package com.github.nedgladstone.statswhiz.controller;

import com.github.nedgladstone.statswhiz.client.MlbClient;
import com.github.nedgladstone.statswhiz.model.*;
import com.github.nedgladstone.statswhiz.repository.PlayerRepository;
import com.github.nedgladstone.statswhiz.repository.StatsRepository;
import io.micronaut.data.exceptions.EmptyResultException;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import org.hibernate.PersistentObjectException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.PersistenceException;
import java.util.List;
import java.util.Optional;

@ExecuteOn(TaskExecutors.IO)
@Controller("/stats")
public class StatsController {
    private static final Logger logger = LoggerFactory.getLogger("com.github.nedgladstone.statswhiz");

    protected final StatsRepository statsRepository;
    protected final PlayerRepository playerRepository;
    protected final PlayerController playerController;
    protected final MlbClient mlbClient;

    public StatsController(StatsRepository statsRepository, PlayerRepository playerRepository, PlayerController playerController, MlbClient mlbClient) {
        this.statsRepository = statsRepository;
        this.playerRepository = playerRepository;
        this.playerController = playerController;
        this.mlbClient = mlbClient;
    }

    @Get("/{id}")
    public Stats getStats(long id) {
        return getStatsFromDb(id);
    }

    @Get("/find")
    public Stats findStats(@QueryValue long playerId, @QueryValue int year) {
        logger.info("In stats find: player " + playerId + ", year " + year);
        Player player = playerController.getPlayer(playerId);
        if (player == null) {
            logger.info("Player " + playerId + " not found");
            return null;
        }

        // The following is a hideous, unacceptable, and temporary hack
        // Finding by player and year is throwing an exception
        // So while the stats db is small, just get all entries for the year
        // and filter manually for player
        // TODO NG2021-02-05: Fix this to use findStatsInDb(player, year) again!!!
        List<Stats> statses = findStats2(year);
        Optional<Stats> stats = statses.stream().filter(s -> playerId == s.getPlayer().getId()).findFirst();
        if (stats.isPresent()) {
            return stats.get();
        }
        return fetchStatsFromMlb(player, year);
//        return findStatsInDb(player, year);
    }

    @Get("/find2")
    public List<Stats> findStats2(@QueryValue int year) {
        logger.info("In stats find2: year " + year);
        return statsRepository.find(year);
    }

    @Get("/ping")
    public String test(@QueryValue String testParam) {
        logger.info("In ping");
        return "Pong " + testParam;
    }

    private Stats findStatsInDb(Player player, int year) {
        String fullName = player.getFullName();
        logger.info("Fetching stats for " + fullName + ", year " + year + " from DB");
        Stats stats = null;
        Long playerId = player.getId();
        try {
            List<Stats> statses = statsRepository.find(playerId, year);
            if ((statses != null) && (statses.size() > 0)) {
                stats = statses.get(0);
            }
        } catch (EmptyResultException | PersistenceException e) {
            logger.info("Stats query threw exception " + e);
            // leave stats null
        }
        if (stats == null) {
            logger.info("Stats for " + fullName + ", year " + year + " not found in database");
            return fetchStatsFromMlb(player, year);
        }
        logger.info("Found stats for " + fullName + ", year " + ": " + stats);
        return stats;
    }

    private Stats getStatsFromDb(long id) {
        logger.info("Fetching stats " + id + " from DB");
        Optional<Stats> stats = statsRepository.findById(id);
        if (stats.isEmpty()) {
            logger.info("Stats " + id + " not found in database");
            return null;
        }
        logger.info("Found stats " + id + ": " + stats);
        return stats.get();
    }

    private Stats fetchStatsFromMlb(Player player, int year) {
        String fullName = player.getFullName();
        long mlbPlayerId = player.getMlbPlayerId();
        logger.info("Fetching hitting stats for player " + fullName + ", year " + year + " from MLB");
        List<StatsHittingMlb> hittingMatches = mlbClient.fetchHittingStats(mlbPlayerId, year);
        if ((hittingMatches == null) || (hittingMatches.size() == 0)) {
            logger.info("Did not find hitting stats for player " + fullName);
            return null;
        }
        StatsHittingMlb hittingStatsMlb = hittingMatches.get(0);
        logger.info("Fetched hitting stats for player " + fullName + ", year " + year + " from MLB: " + hittingStatsMlb);

        logger.info("Fetching pitching stats for player " + fullName + ", year " + year + " from MLB");
        List<StatsPitchingMlb> pitchingMatches = mlbClient.fetchPitchingStats(mlbPlayerId, year);
        StatsPitchingMlb pitchingStatsMlb;
        if ((pitchingMatches == null) || (pitchingMatches.size() == 0)) {
            logger.info("Did not find pitching stats for player " + fullName);
            pitchingStatsMlb = null;
        } else {
            pitchingStatsMlb = pitchingMatches.get(0);
            logger.info("Fetched pitching stats for player " + fullName + ", year " + year + " from MLB: ", pitchingStatsMlb);
        }

        Stats stats = new Stats(player, hittingStatsMlb, pitchingStatsMlb);
        player.addStats(stats);
        try {
            statsRepository.save(stats);
        } catch (PersistenceException e) {
            // Here's another horrible hack. Saving the stats object is throwing an exception
            // "detached entity passed to persist: Player"
            // Everything seems to save ok, nonetheless, so for now - swallow the exception.
            // TODO NG2021-02-05 Stop swallowing this exception and fix it!!!
            logger.info("Swallowed bogus exception " + e);
        }
        logger.info("Added stats " + stats + " to database");
        return stats;
    }
}
