package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Introspected
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class StatsPitchingMlb {
    private long player_id;
    private int season;
    private LocalDateTime end_date;
    private String sport;
    private String sport_code;
    private long sport_id;
    private String league;
    private String league_full;
    private String league_short;
    private long league_id;
    private String team_full;
    private String team_short;
    private String team_abbrev;
    private Integer team_seq;
    private long team_id;

    private String ip;

    private String k9;
    private String bb9;
    private String h9;
    private String hr9;
    private String rs9;

    private String kbb;
    private String whip;
    private String avg;
    private String obp;
    private String ops;
    private String slg;
    private String pgs;
    private String go_ao;
    private String ppa;
    private String wpct;
    private String era;
    private String babip;
    private String spct;
    private String pip;

    private String gidp;
    private String np;
    private String tr;
    private String gf;
    private String bqs;
    private String hgnd;
    private String sho;
    private String bq;
    private String gidp_opp;
    private String bk;
    private String sv;
    private String bb;
    private String db;
    private String hfly;
    private String so;
    private String tbf;
    private String wp;
    private String hpop;
    private String hb;
    private String cs;
    private String sb;
    private String cg;
    private String gs;
    private String ibb;
    private String pk;
    private String go;
    private String hr;
    private String irs;
    private String qs;
    private String g;
    private String ir;
    private String hld;
    private String l;
    private String svo;
    private String h;
    private String w;
    private String hldr;
    private String ao;
    private String s;
    private String r;
    private String ab;
    private String er;
}
