package com.github.nedgladstone.statswhiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
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

    private Integer gamesPlayed;

    private Integer gamesPitched;

    private Integer numPitchesSeen;

    private Integer numPitchesThrown;

    // Batting

    private Integer ab;

    private Double avg;

    private Integer hr;

    private Integer rbi;

    // Baserunning

    private Integer cs;

    private Integer sb;

    // Pitching

    private Double pitchAvg;

    private Double pitchEra;

    public Long getId() {
        return id;
    }

    public Stats(Player player, int season, String sport, String league, String team, Integer gamesPlayed, Integer gamesPitched, Integer numPitchesSeen, Integer numPitchesThrown, Integer ab, Double avg, Integer hr, Integer rbi, Integer cs, Integer sb, Double pitchAvg, Double pitchEra) {
        this.player = player;
        this.season = season;
        this.sport = sport;
        this.league = league;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
        this.gamesPitched = gamesPitched;
        this.numPitchesSeen = numPitchesSeen;
        this.numPitchesThrown = numPitchesThrown;
        this.ab = ab;
        this.avg = avg;
        this.hr = hr;
        this.rbi = rbi;
        this.cs = cs;
        this.sb = sb;
        this.pitchAvg = pitchAvg;
        this.pitchEra = pitchEra;
    }

    public Stats() {
    }

    public Stats(Player player, StatsHittingMlb statsHittingMlb, StatsPitchingMlb statsPitchingMlb) {
        this.player = player;
        this.season = statsHittingMlb.getSeason();
        this.sport = statsHittingMlb.getSport();
        this.league = statsHittingMlb.getLeague();
        this.team = statsHittingMlb.getTeam_full();
        this.gamesPlayed = statsHittingMlb.getG();
        this.numPitchesSeen = statsHittingMlb.getNp();
        this.ab = statsHittingMlb.getAb();
        this.avg = statsHittingMlb.getAvg();
        this.hr = statsHittingMlb.getHr();
        this.rbi = statsHittingMlb.getRbi();
        this.cs = statsHittingMlb.getCs();
        this.sb = statsHittingMlb.getSb();

        if (statsPitchingMlb != null) {
            this.gamesPitched = statsPitchingMlb.getG();
            this.numPitchesThrown = statsPitchingMlb.getNp();
            this.pitchAvg = statsPitchingMlb.getAvg();
            this.pitchEra = statsPitchingMlb.getEra();
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGamesPitched() {
        return gamesPitched;
    }

    public void setGamesPitched(Integer gamesPitched) {
        this.gamesPitched = gamesPitched;
    }

    public Integer getNumPitchesSeen() {
        return numPitchesSeen;
    }

    public void setNumPitchesSeen(Integer numPitchesSeen) {
        this.numPitchesSeen = numPitchesSeen;
    }

    public Integer getNumPitchesThrown() {
        return numPitchesThrown;
    }

    public void setNumPitchesThrown(Integer numPitchesThrown) {
        this.numPitchesThrown = numPitchesThrown;
    }

    public Integer getAb() {
        return ab;
    }

    public void setAb(Integer ab) {
        this.ab = ab;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getRbi() {
        return rbi;
    }

    public void setRbi(Integer rbi) {
        this.rbi = rbi;
    }

    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public Integer getSb() {
        return sb;
    }

    public void setSb(Integer sb) {
        this.sb = sb;
    }

    public Double getPitchAvg() {
        return pitchAvg;
    }

    public void setPitchAvg(Double pitchAvg) {
        this.pitchAvg = pitchAvg;
    }

    public Double getPitchEra() {
        return pitchEra;
    }

    public void setPitchEra(Double pitchEra) {
        this.pitchEra = pitchEra;
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
