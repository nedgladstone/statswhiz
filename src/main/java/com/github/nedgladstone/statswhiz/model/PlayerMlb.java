package com.github.nedgladstone.statswhiz.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class PlayerMlb {
    @JsonProperty("player_id")
    private Long playerId;

    @JsonProperty("name_last")
    private String nameLast;

    @JsonProperty("name_first")
    private String nameFirst;

    @JsonProperty("name_use")
    private String nameUse;

    @JsonProperty("name_display_last_first")
    private String nameDisplayLastFirst;

    @JsonProperty("name_display_first_last")
    private String nameDisplayFirstLast;

    @JsonProperty("name_display_roster")
    private String nameDisplayRoster;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("birth_country")
    private String birthCountry;

    @JsonProperty("birth_state")
    private String birthState;

    @JsonProperty("birth_city")
    private String birthCity;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("college")
    private String college;

    @JsonProperty("height_feet")
    private Integer heightFeet;

    @JsonProperty("height_inches")
    private Integer heightInches;

    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("pro_debut_date")
    private String proDebutDate;

    @JsonProperty("active_sw")
    private String activeSw;

    @JsonProperty("service_years")
    private String serviceYears;

    @JsonProperty("bats")
    private String battingHand;

    @JsonProperty("throws")
    private String throwingHand;

    @JsonProperty("sport_code")
    private String sportCode;

    @JsonProperty("league")
    private String league;

    @JsonProperty("team_id")
    private Long teamId;

    @JsonProperty("team_code")
    private String teamCode;

    @JsonProperty("team_full")
    private String teamFull;

    @JsonProperty("team_abbrev")
    private String teamAbbrev;

    @JsonProperty("position_id")
    private Long positionId;

    @JsonProperty("position")
    private String position;

    public PlayerMlb() {
    }

    public PlayerMlb(Long playerId, String nameLast, String nameFirst, String nameUse, String nameDisplayLastFirst, String nameDisplayFirstLast, String nameDisplayRoster, String birthDate, String birthCountry, String birthState, String birthCity, String highSchool, String college, Integer heightFeet, Integer heightInches, Integer weight, String proDebutDate, String activeSw, String serviceYears, String battingHand, String throwingHand, String sportCode, String league, Long teamId, String teamCode, String teamFull, String teamAbbrev, Long positionId, String position) {
        this.playerId = playerId;
        this.nameLast = nameLast;
        this.nameFirst = nameFirst;
        this.nameUse = nameUse;
        this.nameDisplayLastFirst = nameDisplayLastFirst;
        this.nameDisplayFirstLast = nameDisplayFirstLast;
        this.nameDisplayRoster = nameDisplayRoster;
        this.birthDate = birthDate;
        this.birthCountry = birthCountry;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.highSchool = highSchool;
        this.college = college;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
        this.proDebutDate = proDebutDate;
        this.activeSw = activeSw;
        this.serviceYears = serviceYears;
        this.battingHand = battingHand;
        this.throwingHand = throwingHand;
        this.sportCode = sportCode;
        this.league = league;
        this.teamId = teamId;
        this.teamCode = teamCode;
        this.teamFull = teamFull;
        this.teamAbbrev = teamAbbrev;
        this.positionId = positionId;
        this.position = position;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameUse() {
        return nameUse;
    }

    public void setNameUse(String nameUse) {
        this.nameUse = nameUse;
    }

    public String getNameDisplayLastFirst() {
        return nameDisplayLastFirst;
    }

    public void setNameDisplayLastFirst(String nameDisplayLastFirst) {
        this.nameDisplayLastFirst = nameDisplayLastFirst;
    }

    public String getNameDisplayFirstLast() {
        return nameDisplayFirstLast;
    }

    public void setNameDisplayFirstLast(String nameDisplayFirstLast) {
        this.nameDisplayFirstLast = nameDisplayFirstLast;
    }

    public String getNameDisplayRoster() {
        return nameDisplayRoster;
    }

    public void setNameDisplayRoster(String nameDisplayRoster) {
        this.nameDisplayRoster = nameDisplayRoster;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(Integer heightFeet) {
        this.heightFeet = heightFeet;
    }

    public Integer getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(Integer heightInches) {
        this.heightInches = heightInches;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getProDebutDate() {
        return proDebutDate;
    }

    public void setProDebutDate(String proDebutDate) {
        this.proDebutDate = proDebutDate;
    }

    public String getActiveSw() {
        return activeSw;
    }

    public void setActiveSw(String activeSw) {
        this.activeSw = activeSw;
    }

    public String getServiceYears() {
        return serviceYears;
    }

    public void setServiceYears(String serviceYears) {
        this.serviceYears = serviceYears;
    }

    public String getBattingHand() {
        return battingHand;
    }

    public void setBattingHand(String battingHand) {
        this.battingHand = battingHand;
    }

    public String getThrowingHand() {
        return throwingHand;
    }

    public void setThrowingHand(String throwingHand) {
        this.throwingHand = throwingHand;
    }

    public String getSportCode() {
        return sportCode;
    }

    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamFull() {
        return teamFull;
    }

    public void setTeamFull(String teamFull) {
        this.teamFull = teamFull;
    }

    public String getTeamAbbrev() {
        return teamAbbrev;
    }

    public void setTeamAbbrev(String teamAbbrev) {
        this.teamAbbrev = teamAbbrev;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "PlayerMlb{" +
                "playerId=" + playerId +
                ", nameLast='" + nameLast + '\'' +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameUse='" + nameUse + '\'' +
                ", nameDisplayLastFirst='" + nameDisplayLastFirst + '\'' +
                ", nameDisplayFirstLast='" + nameDisplayFirstLast + '\'' +
                ", nameDisplayRoster='" + nameDisplayRoster + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", birthCountry='" + birthCountry + '\'' +
                ", birthState='" + birthState + '\'' +
                ", birthCity='" + birthCity + '\'' +
                ", highSchool='" + highSchool + '\'' +
                ", college='" + college + '\'' +
                ", heightFeet=" + heightFeet +
                ", heightInches=" + heightInches +
                ", weight=" + weight +
                ", proDebutDate='" + proDebutDate + '\'' +
                ", activeSw='" + activeSw + '\'' +
                ", serviceYears='" + serviceYears + '\'' +
                ", battingHand='" + battingHand + '\'' +
                ", throwingHand='" + throwingHand + '\'' +
                ", sportCode='" + sportCode + '\'' +
                ", league='" + league + '\'' +
                ", teamId=" + teamId +
                ", teamCode='" + teamCode + '\'' +
                ", teamFull='" + teamFull + '\'' +
                ", teamAbbrev='" + teamAbbrev + '\'' +
                ", positionId=" + positionId +
                ", position='" + position + '\'' +
                '}';
    }
}
