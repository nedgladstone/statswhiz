package com.github.nedgladstone.statswhiz.model;

import io.micronaut.core.annotation.Introspected;

import java.time.LocalDateTime;

@Introspected
public class StatsHittingMlb {
    private long player_id;
    private Integer season;
    private LocalDateTime end_date;
    private String sport;
    private String sport_code;
    private Long sport_id;
    private String league;
    private String league_full;
    private String league_short;
    private Long league_id;
    private String team_full;
    private String team_short;
    private String team_abbrev;
    private Integer team_seq;
    private Long team_id;
    private Double avg;
    private Double slg;
    private Double obp;
    private Double ops;
    //private Double go_ao;
    private Double ppa;
    private Double babip;
    private Integer gidp;
    private Integer np;
    private Integer hgnd;
    private Integer tb;
    private Integer gidp_opp;
    private Integer bb;
    private Integer hbp;
    private Integer so;
    private Integer sac;
    private Integer hfly;
    private Integer wo;
    private Integer sf;
    private Integer hpop;
    private Integer cs;
    private Integer sb;
    private Integer ibb;
    private Integer roe;
    private Integer go;
    private Integer hr;
    private Integer rbi;
    private Integer lob;
    private Integer xbh;
    private Integer g;
    private Integer d;
    private Integer tpa;
    private Integer h;
    private Integer hldr;
    private Integer t;
    private Integer ao;
    private Integer r;
    private Integer ab;

    public StatsHittingMlb(long player_id, Integer season, LocalDateTime end_date, String sport, String sport_code, Long sport_id, String league, String league_full, String league_short, Long league_id, String team_full, String team_short, String team_abbrev, Integer team_seq, Long team_id, Double avg, Double slg, Double obp, Double ops/*, Double go_ao*/, Double ppa, Double babip, Integer gidp, Integer np, Integer hgnd, Integer tb, Integer gidp_opp, Integer bb, Integer hbp, Integer so, Integer sac, Integer hfly, Integer wo, Integer sf, Integer hpop, Integer cs, Integer sb, Integer ibb, Integer roe, Integer go, Integer hr, Integer rbi, Integer lob, Integer xbh, Integer g, Integer d, Integer tpa, Integer h, Integer hldr, Integer t, Integer ao, Integer r, Integer ab) {
        this.player_id = player_id;
        this.season = season;
        this.end_date = end_date;
        this.sport = sport;
        this.sport_code = sport_code;
        this.sport_id = sport_id;
        this.league = league;
        this.league_full = league_full;
        this.league_short = league_short;
        this.league_id = league_id;
        this.team_full = team_full;
        this.team_short = team_short;
        this.team_abbrev = team_abbrev;
        this.team_seq = team_seq;
        this.team_id = team_id;
        this.avg = avg;
        this.slg = slg;
        this.obp = obp;
        this.ops = ops;
        //this.go_ao = go_ao;
        this.ppa = ppa;
        this.babip = babip;
        this.gidp = gidp;
        this.np = np;
        this.hgnd = hgnd;
        this.tb = tb;
        this.gidp_opp = gidp_opp;
        this.bb = bb;
        this.hbp = hbp;
        this.so = so;
        this.sac = sac;
        this.hfly = hfly;
        this.wo = wo;
        this.sf = sf;
        this.hpop = hpop;
        this.cs = cs;
        this.sb = sb;
        this.ibb = ibb;
        this.roe = roe;
        this.go = go;
        this.hr = hr;
        this.rbi = rbi;
        this.lob = lob;
        this.xbh = xbh;
        this.g = g;
        this.d = d;
        this.tpa = tpa;
        this.h = h;
        this.hldr = hldr;
        this.t = t;
        this.ao = ao;
        this.r = r;
        this.ab = ab;
    }

    public long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(long player_id) {
        this.player_id = player_id;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport_code() {
        return sport_code;
    }

    public void setSport_code(String sport_code) {
        this.sport_code = sport_code;
    }

    public Long getSport_id() {
        return sport_id;
    }

    public void setSport_id(Long sport_id) {
        this.sport_id = sport_id;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getLeague_full() {
        return league_full;
    }

    public void setLeague_full(String league_full) {
        this.league_full = league_full;
    }

    public String getLeague_short() {
        return league_short;
    }

    public void setLeague_short(String league_short) {
        this.league_short = league_short;
    }

    public Long getLeague_id() {
        return league_id;
    }

    public void setLeague_id(Long league_id) {
        this.league_id = league_id;
    }

    public String getTeam_full() {
        return team_full;
    }

    public void setTeam_full(String team_full) {
        this.team_full = team_full;
    }

    public String getTeam_short() {
        return team_short;
    }

    public void setTeam_short(String team_short) {
        this.team_short = team_short;
    }

    public String getTeam_abbrev() {
        return team_abbrev;
    }

    public void setTeam_abbrev(String team_abbrev) {
        this.team_abbrev = team_abbrev;
    }

    public Integer getTeam_seq() {
        return team_seq;
    }

    public void setTeam_seq(Integer team_seq) {
        this.team_seq = team_seq;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Double getSlg() {
        return slg;
    }

    public void setSlg(Double slg) {
        this.slg = slg;
    }

    public Double getObp() {
        return obp;
    }

    public void setObp(Double obp) {
        this.obp = obp;
    }

    public Double getOps() {
        return ops;
    }

    public void setOps(Double ops) {
        this.ops = ops;
    }

    /*
    public Double getGo_ao() {
        return go_ao;
    }

    public void setGo_ao(Double go_ao) {
        this.go_ao = go_ao;
    }
    */

    public Double getPpa() {
        return ppa;
    }

    public void setPpa(Double ppa) {
        this.ppa = ppa;
    }

    public Double getBabip() {
        return babip;
    }

    public void setBabip(Double babip) {
        this.babip = babip;
    }

    public Integer getGidp() {
        return gidp;
    }

    public void setGidp(Integer gidp) {
        this.gidp = gidp;
    }

    public Integer getNp() {
        return np;
    }

    public void setNp(Integer np) {
        this.np = np;
    }

    public Integer getHgnd() {
        return hgnd;
    }

    public void setHgnd(Integer hgnd) {
        this.hgnd = hgnd;
    }

    public Integer getTb() {
        return tb;
    }

    public void setTb(Integer tb) {
        this.tb = tb;
    }

    public Integer getGidp_opp() {
        return gidp_opp;
    }

    public void setGidp_opp(Integer gidp_opp) {
        this.gidp_opp = gidp_opp;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public Integer getHbp() {
        return hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }

    public Integer getSo() {
        return so;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public Integer getSac() {
        return sac;
    }

    public void setSac(Integer sac) {
        this.sac = sac;
    }

    public Integer getHfly() {
        return hfly;
    }

    public void setHfly(Integer hfly) {
        this.hfly = hfly;
    }

    public Integer getWo() {
        return wo;
    }

    public void setWo(Integer wo) {
        this.wo = wo;
    }

    public Integer getSf() {
        return sf;
    }

    public void setSf(Integer sf) {
        this.sf = sf;
    }

    public Integer getHpop() {
        return hpop;
    }

    public void setHpop(Integer hpop) {
        this.hpop = hpop;
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

    public Integer getIbb() {
        return ibb;
    }

    public void setIbb(Integer ibb) {
        this.ibb = ibb;
    }

    public Integer getRoe() {
        return roe;
    }

    public void setRoe(Integer roe) {
        this.roe = roe;
    }

    public Integer getGo() {
        return go;
    }

    public void setGo(Integer go) {
        this.go = go;
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

    public Integer getLob() {
        return lob;
    }

    public void setLob(Integer lob) {
        this.lob = lob;
    }

    public Integer getXbh() {
        return xbh;
    }

    public void setXbh(Integer xbh) {
        this.xbh = xbh;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public Integer getTpa() {
        return tpa;
    }

    public void setTpa(Integer tpa) {
        this.tpa = tpa;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getHldr() {
        return hldr;
    }

    public void setHldr(Integer hldr) {
        this.hldr = hldr;
    }

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }

    public Integer getAo() {
        return ao;
    }

    public void setAo(Integer ao) {
        this.ao = ao;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getAb() {
        return ab;
    }

    public void setAb(Integer ab) {
        this.ab = ab;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "player_id=" + player_id +
                ", season=" + season +
                ", end_date=" + end_date +
                ", sport='" + sport + '\'' +
                ", sport_code='" + sport_code + '\'' +
                ", sport_id=" + sport_id +
                ", league='" + league + '\'' +
                ", league_full='" + league_full + '\'' +
                ", league_short='" + league_short + '\'' +
                ", league_id=" + league_id +
                ", team_full='" + team_full + '\'' +
                ", team_short='" + team_short + '\'' +
                ", team_abbrev='" + team_abbrev + '\'' +
                ", team_seq=" + team_seq +
                ", team_id=" + team_id +
                ", avg=" + avg +
                ", slg=" + slg +
                ", obp=" + obp +
                ", ops=" + ops +
                //", go_ao=" + go_ao +
                ", ppa=" + ppa +
                ", babip=" + babip +
                ", gidp=" + gidp +
                ", np=" + np +
                ", hgnd=" + hgnd +
                ", tb=" + tb +
                ", gidp_opp=" + gidp_opp +
                ", bb=" + bb +
                ", hbp=" + hbp +
                ", so=" + so +
                ", sac=" + sac +
                ", hfly=" + hfly +
                ", wo=" + wo +
                ", sf=" + sf +
                ", hpop=" + hpop +
                ", cs=" + cs +
                ", sb=" + sb +
                ", ibb=" + ibb +
                ", roe=" + roe +
                ", go=" + go +
                ", hr=" + hr +
                ", rbi=" + rbi +
                ", lob=" + lob +
                ", xbh=" + xbh +
                ", g=" + g +
                ", d=" + d +
                ", tpa=" + tpa +
                ", h=" + h +
                ", hldr=" + hldr +
                ", t=" + t +
                ", ao=" + ao +
                ", r=" + r +
                ", ab=" + ab +
                '}';
    }
}
