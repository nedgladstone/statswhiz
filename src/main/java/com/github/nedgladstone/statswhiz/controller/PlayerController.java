package com.github.nedgladstone.statswhiz.controller;

import com.github.nedgladstone.statswhiz.client.MlbClient;
import com.github.nedgladstone.statswhiz.model.*;
import com.github.nedgladstone.statswhiz.repository.PlayerRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@ExecuteOn(TaskExecutors.IO)
@Controller("/player")
public class PlayerController {
    private static final Logger logger = LoggerFactory.getLogger("com.github.nedgladstone.statswhiz");

    protected final PlayerRepository playerRepository;
    protected final MlbClient mlbClient;

    public PlayerController(PlayerRepository playerRepository, MlbClient mlbClient) {
        this.playerRepository = playerRepository;
        this.mlbClient = mlbClient;
    }

    @Get("/list")
    public Iterable<Player> list() {
        logger.info("In list");
        return playerRepository.findAll();
    }

    @Get("/{id}")
    public Player getPlayer(long id) {
        return getPlayerFromDb(id);
    }

    @Get("/find")
    public Player findPlayer(@QueryValue String lastName, @QueryValue String firstName) {
        return findPlayerInDb(lastName, firstName);
    }

    @Get("/test")
    public String test(String testParam) {
        logger.info("In test");
        return "Yep, server is working. I was passed " + testParam;
    }

    private Player findPlayerInDb(String lastName, String firstName) {
        String fullName = firstName + " " + lastName;
        logger.info("Fetching player " + fullName + " from DB");
        Player player;
        try {
            player = playerRepository.find(lastName, firstName);
        } catch (io.micronaut.data.exceptions.EmptyResultException e) {
            player = null;
        }
        if (player == null) {
            logger.info("Player " + fullName + " not found in database");
            return fetchPlayerFromMlb(lastName, firstName);
        }
        logger.info("Found player " + fullName + ": " + player);
        return player;
    }

    private Player getPlayerFromDb(long id) {
        logger.info("Fetching player " + id + " from DB");
        Optional<Player> player = playerRepository.findById(id);
        if (player.isEmpty()) {
            logger.info("Player " + id + " not found in database");
            return null;
        }
        logger.info("Found player " + id + ": " + player);
        return player.get();
    }

    private Player fetchPlayerFromMlb(String lastName, String firstName) {
        String fullName = firstName + " " + lastName;
        logger.info("Fetching player " + fullName + " from MLB");
        List<PlayerMlb> matches = mlbClient.fetchPlayers(fullName);
        if ((matches == null) || (matches.size() == 0)) {
            logger.info("Did not find player " + fullName);
            return null;
        }

        PlayerMlb playerMlb = matches.get(0);
        Player player = new Player(playerMlb);
        logger.info("Found player " + fullName + " in MLB Lookup Service: " + playerMlb);
        playerRepository.save(player);
        logger.info("Added player " + player + " to database");
        return player;
    }
}
