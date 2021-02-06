package com.github.nedgladstone.statswhiz.model;

import java.time.LocalDateTime;

public class StatsPitchingMlb {
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

    private Double ip;

    private Double k9;
    private Double bb9;
    private Double h9;
    private Double hr9;
    private Double rs9;

    private Double kbb;
    private Double whip;
    private Double avg;
    private Double obp;
    private Double ops;
    private Double slg;
    private Double pgs;
    private Double go_ao;
    private Double ppa;
    private Double wpct;
    private Double era;
    private Double babip;
    private Double spct;
    private Double pip;

    private Integer gidp;
    private Integer np;
    private Integer tr;
    private Integer gf;
    private Integer bqs;
    private Integer hgnd;
    private Integer sho;
    private Integer bq;
    private Integer gidp_opp;
    private Integer bk;
    private Integer sv;
    private Integer bb;
    private Integer db;
    private Integer hfly;
    private Integer so;
    private Integer tbf;
    private Integer wp;
    private Integer hpop;
    private Integer hb;
    private Integer cs;
    private Integer sb;
    private Integer cg;
    private Integer gs;
    private Integer ibb;
    private Integer pk;
    private Integer go;
    private Integer hr;
    private Integer irs;
    private Integer qs;
    private Integer g;
    private Integer ir;
    private Integer hld;
    private Integer l;
    private Integer svo;
    private Integer h;
    private Integer w;
    private Integer hldr;
    private Integer ao;
    private Integer s;
    private Integer r;
    private Integer ab;
    private Integer er;

    public StatsPitchingMlb(long player_id, Integer season, LocalDateTime end_date, String sport, String sport_code, Long sport_id, String league, String league_full, String league_short, Long league_id, String team_full, String team_short, String team_abbrev, Integer team_seq, Long team_id, Double ip, Double k9, Double bb9, Double h9, Double hr9, Double rs9, Double kbb, Double whip, Double avg, Double obp, Double ops, Double slg, Double pgs, Double go_ao, Double ppa, Double wpct, Double era, Double babip, Double spct, Double pip, Integer gidp, Integer np, Integer tr, Integer gf, Integer bqs, Integer hgnd, Integer sho, Integer bq, Integer gidp_opp, Integer bk, Integer sv, Integer bb, Integer db, Integer hfly, Integer so, Integer tbf, Integer wp, Integer hpop, Integer hb, Integer cs, Integer sb, Integer cg, Integer gs, Integer ibb, Integer pk, Integer go, Integer hr, Integer irs, Integer qs, Integer g, Integer ir, Integer hld, Integer l, Integer svo, Integer h, Integer w, Integer hldr, Integer ao, Integer s, Integer r, Integer ab, Integer er) {
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
        this.ip = ip;
        this.k9 = k9;
        this.bb9 = bb9;
        this.h9 = h9;
        this.hr9 = hr9;
        this.rs9 = rs9;
        this.kbb = kbb;
        this.whip = whip;
        this.avg = avg;
        this.obp = obp;
        this.ops = ops;
        this.slg = slg;
        this.pgs = pgs;
        this.go_ao = go_ao;
        this.ppa = ppa;
        this.wpct = wpct;
        this.era = era;
        this.babip = babip;
        this.spct = spct;
        this.pip = pip;
        this.gidp = gidp;
        this.np = np;
        this.tr = tr;
        this.gf = gf;
        this.bqs = bqs;
        this.hgnd = hgnd;
        this.sho = sho;
        this.bq = bq;
        this.gidp_opp = gidp_opp;
        this.bk = bk;
        this.sv = sv;
        this.bb = bb;
        this.db = db;
        this.hfly = hfly;
        this.so = so;
        this.tbf = tbf;
        this.wp = wp;
        this.hpop = hpop;
        this.hb = hb;
        this.cs = cs;
        this.sb = sb;
        this.cg = cg;
        this.gs = gs;
        this.ibb = ibb;
        this.pk = pk;
        this.go = go;
        this.hr = hr;
        this.irs = irs;
        this.qs = qs;
        this.g = g;
        this.ir = ir;
        this.hld = hld;
        this.l = l;
        this.svo = svo;
        this.h = h;
        this.w = w;
        this.hldr = hldr;
        this.ao = ao;
        this.s = s;
        this.r = r;
        this.ab = ab;
        this.er = er;
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

    public Double getIp() {
        return ip;
    }

    public void setIp(Double ip) {
        this.ip = ip;
    }

    public Double getK9() {
        return k9;
    }

    public void setK9(Double k9) {
        this.k9 = k9;
    }

    public Double getBb9() {
        return bb9;
    }

    public void setBb9(Double bb9) {
        this.bb9 = bb9;
    }

    public Double getH9() {
        return h9;
    }

    public void setH9(Double h9) {
        this.h9 = h9;
    }

    public Double getHr9() {
        return hr9;
    }

    public void setHr9(Double hr9) {
        this.hr9 = hr9;
    }

    public Double getRs9() {
        return rs9;
    }

    public void setRs9(Double rs9) {
        this.rs9 = rs9;
    }

    public Double getKbb() {
        return kbb;
    }

    public void setKbb(Double kbb) {
        this.kbb = kbb;
    }

    public Double getWhip() {
        return whip;
    }

    public void setWhip(Double whip) {
        this.whip = whip;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
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

    public Double getSlg() {
        return slg;
    }

    public void setSlg(Double slg) {
        this.slg = slg;
    }

    public Double getPgs() {
        return pgs;
    }

    public void setPgs(Double pgs) {
        this.pgs = pgs;
    }

    public Double getGo_ao() {
        return go_ao;
    }

    public void setGo_ao(Double go_ao) {
        this.go_ao = go_ao;
    }

    public Double getPpa() {
        return ppa;
    }

    public void setPpa(Double ppa) {
        this.ppa = ppa;
    }

    public Double getWpct() {
        return wpct;
    }

    public void setWpct(Double wpct) {
        this.wpct = wpct;
    }

    public Double getEra() {
        return era;
    }

    public void setEra(Double era) {
        this.era = era;
    }

    public Double getBabip() {
        return babip;
    }

    public void setBabip(Double babip) {
        this.babip = babip;
    }

    public Double getSpct() {
        return spct;
    }

    public void setSpct(Double spct) {
        this.spct = spct;
    }

    public Double getPip() {
        return pip;
    }

    public void setPip(Double pip) {
        this.pip = pip;
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

    public Integer getTr() {
        return tr;
    }

    public void setTr(Integer tr) {
        this.tr = tr;
    }

    public Integer getGf() {
        return gf;
    }

    public void setGf(Integer gf) {
        this.gf = gf;
    }

    public Integer getBqs() {
        return bqs;
    }

    public void setBqs(Integer bqs) {
        this.bqs = bqs;
    }

    public Integer getHgnd() {
        return hgnd;
    }

    public void setHgnd(Integer hgnd) {
        this.hgnd = hgnd;
    }

    public Integer getSho() {
        return sho;
    }

    public void setSho(Integer sho) {
        this.sho = sho;
    }

    public Integer getBq() {
        return bq;
    }

    public void setBq(Integer bq) {
        this.bq = bq;
    }

    public Integer getGidp_opp() {
        return gidp_opp;
    }

    public void setGidp_opp(Integer gidp_opp) {
        this.gidp_opp = gidp_opp;
    }

    public Integer getBk() {
        return bk;
    }

    public void setBk(Integer bk) {
        this.bk = bk;
    }

    public Integer getSv() {
        return sv;
    }

    public void setSv(Integer sv) {
        this.sv = sv;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    public Integer getHfly() {
        return hfly;
    }

    public void setHfly(Integer hfly) {
        this.hfly = hfly;
    }

    public Integer getSo() {
        return so;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public Integer getTbf() {
        return tbf;
    }

    public void setTbf(Integer tbf) {
        this.tbf = tbf;
    }

    public Integer getWp() {
        return wp;
    }

    public void setWp(Integer wp) {
        this.wp = wp;
    }

    public Integer getHpop() {
        return hpop;
    }

    public void setHpop(Integer hpop) {
        this.hpop = hpop;
    }

    public Integer getHb() {
        return hb;
    }

    public void setHb(Integer hb) {
        this.hb = hb;
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

    public Integer getCg() {
        return cg;
    }

    public void setCg(Integer cg) {
        this.cg = cg;
    }

    public Integer getGs() {
        return gs;
    }

    public void setGs(Integer gs) {
        this.gs = gs;
    }

    public Integer getIbb() {
        return ibb;
    }

    public void setIbb(Integer ibb) {
        this.ibb = ibb;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
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

    public Integer getIrs() {
        return irs;
    }

    public void setIrs(Integer irs) {
        this.irs = irs;
    }

    public Integer getQs() {
        return qs;
    }

    public void setQs(Integer qs) {
        this.qs = qs;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getIr() {
        return ir;
    }

    public void setIr(Integer ir) {
        this.ir = ir;
    }

    public Integer getHld() {
        return hld;
    }

    public void setHld(Integer hld) {
        this.hld = hld;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public Integer getSvo() {
        return svo;
    }

    public void setSvo(Integer svo) {
        this.svo = svo;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getHldr() {
        return hldr;
    }

    public void setHldr(Integer hldr) {
        this.hldr = hldr;
    }

    public Integer getAo() {
        return ao;
    }

    public void setAo(Integer ao) {
        this.ao = ao;
    }

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
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

    public Integer getEr() {
        return er;
    }

    public void setEr(Integer er) {
        this.er = er;
    }

    @Override
    public String toString() {
        return "StatsPitchingMlb{" +
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
                ", ip=" + ip +
                ", k9=" + k9 +
                ", bb9=" + bb9 +
                ", h9=" + h9 +
                ", hr9=" + hr9 +
                ", rs9=" + rs9 +
                ", kbb=" + kbb +
                ", whip=" + whip +
                ", avg=" + avg +
                ", obp=" + obp +
                ", ops=" + ops +
                ", slg=" + slg +
                ", pgs=" + pgs +
                ", go_ao=" + go_ao +
                ", ppa=" + ppa +
                ", wpct=" + wpct +
                ", era=" + era +
                ", babip=" + babip +
                ", spct=" + spct +
                ", pip=" + pip +
                ", gidp=" + gidp +
                ", np=" + np +
                ", tr=" + tr +
                ", gf=" + gf +
                ", bqs=" + bqs +
                ", hgnd=" + hgnd +
                ", sho=" + sho +
                ", bq=" + bq +
                ", gidp_opp=" + gidp_opp +
                ", bk=" + bk +
                ", sv=" + sv +
                ", bb=" + bb +
                ", db=" + db +
                ", hfly=" + hfly +
                ", so=" + so +
                ", tbf=" + tbf +
                ", wp=" + wp +
                ", hpop=" + hpop +
                ", hb=" + hb +
                ", cs=" + cs +
                ", sb=" + sb +
                ", cg=" + cg +
                ", gs=" + gs +
                ", ibb=" + ibb +
                ", pk=" + pk +
                ", go=" + go +
                ", hr=" + hr +
                ", irs=" + irs +
                ", qs=" + qs +
                ", g=" + g +
                ", ir=" + ir +
                ", hld=" + hld +
                ", l=" + l +
                ", svo=" + svo +
                ", h=" + h +
                ", w=" + w +
                ", hldr=" + hldr +
                ", ao=" + ao +
                ", s=" + s +
                ", r=" + r +
                ", ab=" + ab +
                ", er=" + er +
                '}';
    }
}
