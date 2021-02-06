package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class PlayersResponseMlb {
    private SearchPlayersResultMlb search_player_all;

    public PlayersResponseMlb(SearchPlayersResultMlb search_player_all) {
        this.search_player_all = search_player_all;
    }

    public SearchPlayersResultMlb getSearch_player_all() {
        return search_player_all;
    }

    public void setSearch_player_all(SearchPlayersResultMlb search_player_all) {
        this.search_player_all = search_player_all;
    }

    @Override
    public String toString() {
        return "PlayerResponseMlb{" +
                "search_player_all=" + search_player_all +
                '}';
    }
}


