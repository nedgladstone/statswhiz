package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;
import lombok.*;

import java.time.LocalDateTime;

@Introspected
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class StatsHittingMlb {
    private long player_id;
    private int season;
    private LocalDateTime end_date;
    private String sport;
    private String sport_code;
    private long sport_id;
    private String league;
    private String league_full;
    private String league_short;
    private Long league_id;
    private String team_full;
    private String team_short;
    private String team_abbrev;
    private int team_seq;
    private int team_id;
    private String avg;
    private String slg;
    private String obp;
    private String ops;
    private String ppa;
    private String babip;
    private String gidp;
    private String np;
    private String hgnd;
    private String tb;
    private String gidp_opp;
    private String bb;
    private String hbp;
    private String so;
    private String sac;
    private String hfly;
    private String wo;
    private String sf;
    private String hpop;
    private String cs;
    private String sb;
    private String ibb;
    private String roe;
    private String go;
    private String hr;
    private String rbi;
    private String lob;
    private String xbh;
    private String g;
    private String d;
    private String tpa;
    private String h;
    private String hldr;
    private String t;
    private String ao;
    private String r;
    private String ab;
}
