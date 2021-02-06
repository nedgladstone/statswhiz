package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class StatsPitchingResponseMlb {
    private SearchStatsPitchingResultMlb sport_pitching_tm;

    public StatsPitchingResponseMlb(SearchStatsPitchingResultMlb sport_pitching_tm) {
        this.sport_pitching_tm = sport_pitching_tm;
    }

    public SearchStatsPitchingResultMlb getSport_pitching_tm() {
        return sport_pitching_tm;
    }

    public void setSport_pitching_tm(SearchStatsPitchingResultMlb sport_pitching_tm) {
        this.sport_pitching_tm = sport_pitching_tm;
    }

    @Override
    public String toString() {
        return "StatsPitchingResponseMlb{" +
                "search_player_all=" + sport_pitching_tm +
                '}';
    }
}


