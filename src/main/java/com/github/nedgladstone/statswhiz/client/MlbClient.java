package com.github.nedgladstone.statswhiz.client;

import com.github.nedgladstone.statswhiz.model.*;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;

import javax.inject.Singleton;
import java.net.URI;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class MlbClient {
    private static final Logger logger = LoggerFactory.getLogger("com.github.nedgladstone.statswhiz");

    private final RxHttpClient httpClient;

    public MlbClient(@Client RxHttpClient httpClient) {
        logger.info("MlbClient created");
        this.httpClient = httpClient;
    }

    public List<PlayerMlb> fetchPlayers(String nameFragment) {
        logger.info("fetch players " + nameFragment);
        // http://lookup-service-prod.mlb.com/json/named.search_player_all.bam?sport_code='mlb'&name_part={nameFragment}%25"
        URI uri = UriBuilder.of("http://lookup-service-prod.mlb.com/json/named.search_player_all.bam")
                .queryParam("sport_code", "'mlb'")
                .queryParam("name_part", "'" + nameFragment + "%'")
                .build();
        logger.info("uri " + uri);

        HttpRequest<?> req = HttpRequest.GET(uri);
        logger.info("req " + req);
        PlayersResponseMlb resp = httpClient.toBlocking().retrieve(req, PlayersResponseMlb.class);
        return resp.getSearch_player_all().getQueryResults().getRow();
    }

    public PlayerMlb fetchPlayer(long id) {
        logger.info("fetch player " + id);
        // GET/json/named.player_info.bam?sport_code='mlb'&player_id={player_id}
        URI uri = UriBuilder.of("http://lookup-service-prod.mlb.com/json/named.player_info.bam")
                .queryParam("sport_code", "'mlb'")
                .queryParam("player_id", "'" + id + "'")
                .build();
        logger.info("uri " + uri);

        HttpRequest<?> req = HttpRequest.GET(uri);
        logger.info("req " + req);
        PlayersResponseMlb resp = httpClient.toBlocking().retrieve(req, PlayersResponseMlb.class);
        return resp.getSearch_player_all().getQueryResults().getRow().get(0);
    }

    public List<StatsHittingMlb> fetchHittingStats(long playerId, int year) {
        logger.info("fetch hitting stats for player " + playerId + ", year " + year);
        // GET/json/named.sport_hitting_tm.bam?league_list_id='mlb'&game_type={game_type}&season={season}&player_id={player_id}
        URI uri = UriBuilder.of("http://lookup-service-prod.mlb.com/json/named.sport_hitting_tm.bam")
                .queryParam("league_list_id", "'mlb'")
                .queryParam("game_type", "'R'")
                .queryParam("season", "'" + year + "'")
                .queryParam("player_id", "'" + playerId + "'")
                .build();
        logger.info("uri " + uri);

        HttpRequest<?> req = HttpRequest.GET(uri);
        logger.info("req " + req);
        StatsHittingResponseMlb resp = httpClient.toBlocking().retrieve(req, StatsHittingResponseMlb.class);
        return resp.getSport_hitting_tm().getQueryResults().getRow();
    }

    public List<StatsPitchingMlb> fetchPitchingStats(long playerId, int year) {
        logger.info("fetch pitching stats for player " + playerId + ", year " + year);
        // GET/json/named.sport_pitching_tm.bam?league_list_id='mlb'&game_type={game_type}&season={season}&player_id={player_id}
        URI uri = UriBuilder.of("http://lookup-service-prod.mlb.com/json/named.sport_pitching_tm.bam")
                .queryParam("league_list_id", "'mlb'")
                .queryParam("game_type", "'R'")
                .queryParam("season", "'" + year + "'")
                .queryParam("player_id", "'" + playerId + "'")
                .build();
        logger.info("uri " + uri);

        HttpRequest<?> req = HttpRequest.GET(uri);
        logger.info("req " + req);
        StatsPitchingResponseMlb resp = httpClient.toBlocking().retrieve(req, StatsPitchingResponseMlb.class);
        return resp.getSport_pitching_tm().getQueryResults().getRow();
    }
}
