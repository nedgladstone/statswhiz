package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class StatsHittingResponseMlb {
    private SearchStatsHittingResultMlb sport_hitting_tm;

    public StatsHittingResponseMlb(SearchStatsHittingResultMlb sport_hitting_tm) {
        this.sport_hitting_tm = sport_hitting_tm;
    }

    public SearchStatsHittingResultMlb getSport_hitting_tm() {
        return sport_hitting_tm;
    }

    public void setSport_hitting_tm(SearchStatsHittingResultMlb sport_hitting_tm) {
        this.sport_hitting_tm = sport_hitting_tm;
    }

    @Override
    public String toString() {
        return "StatsHittingResponseMlb{" +
                "search_player_all=" + sport_hitting_tm +
                '}';
    }
}


