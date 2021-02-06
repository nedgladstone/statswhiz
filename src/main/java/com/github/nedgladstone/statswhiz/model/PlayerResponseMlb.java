package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class PlayerResponseMlb {
    private SearchPlayersResultMlb player_info;

    public PlayerResponseMlb(SearchPlayersResultMlb player_info) {
        this.player_info = player_info;
    }

    public SearchPlayersResultMlb getPlayer_info() {
        return player_info;
    }

    public void setPlayer_info(SearchPlayersResultMlb player_info) {
        this.player_info = player_info;
    }

    @Override
    public String toString() {
        return "PlayerResponseMlb{" +
                "search_player_all=" + player_info +
                '}';
    }
}


