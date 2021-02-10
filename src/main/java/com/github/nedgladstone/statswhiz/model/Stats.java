package com.github.nedgladstone.statswhiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.github.nedgladstone.statswhiz.util.StatsUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_player")
    @JsonBackReference
    private Player player;

    private int season;

    private String sport;

    private String league;

    private String team;

    private int gamesPlayed;

    private int gamesPitched;

    private int numPitchesSeen;

    private int numPitchesThrown;

    // Batting

    private int ab;

    private double avg;

    private int hr;

    private int rbi;

    // Baserunning

    private int cs;

    private int sb;

    // Pitching

    private double pitchAvg;

    private double pitchEra;


    public Stats(Player player, StatsHittingMlb statsHittingMlb, StatsPitchingMlb statsPitchingMlb) {
        this.player = player;
        this.season = statsHittingMlb.getSeason();
        this.sport = statsHittingMlb.getSport();
        this.league = statsHittingMlb.getLeague();
        this.team = statsHittingMlb.getTeam_full();
        this.gamesPlayed = StatsUtils.tryParseInt(statsHittingMlb.getG());
        this.numPitchesSeen = StatsUtils.tryParseInt(statsHittingMlb.getNp());
        this.ab = StatsUtils.tryParseInt(statsHittingMlb.getAb());
        this.avg = StatsUtils.tryParseDouble(statsHittingMlb.getAvg());
        this.hr = StatsUtils.tryParseInt(statsHittingMlb.getHr());
        this.rbi = StatsUtils.tryParseInt(statsHittingMlb.getRbi());
        this.cs = StatsUtils.tryParseInt(statsHittingMlb.getCs());
        this.sb = StatsUtils.tryParseInt(statsHittingMlb.getSb());

        if (statsPitchingMlb != null) {
            this.gamesPitched = StatsUtils.tryParseInt(statsPitchingMlb.getG());
            this.numPitchesThrown = StatsUtils.tryParseInt(statsPitchingMlb.getNp());
            this.pitchAvg = StatsUtils.tryParseDouble(statsPitchingMlb.getAvg());
            this.pitchEra = StatsUtils.tryParseDouble(statsPitchingMlb.getEra());
        }
    }

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", player id=" + player.getId() +
                ", season=" + season +
                ", sport='" + sport + '\'' +
                ", league='" + league + '\'' +
                ", team='" + team + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                ", gamesPitched=" + gamesPitched +
                ", numPitchesSeen=" + numPitchesSeen +
                ", numPitchesThrown=" + numPitchesThrown +
                ", ab=" + ab +
                ", avg=" + avg +
                ", hr=" + hr +
                ", rbi=" + rbi +
                ", cs=" + cs +
                ", sb=" + sb +
                ", pitchAvg=" + pitchAvg +
                ", pitchEra=" + pitchEra +
                '}';
    }

}
