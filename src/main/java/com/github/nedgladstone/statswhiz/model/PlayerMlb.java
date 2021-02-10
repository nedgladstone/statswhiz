package com.github.nedgladstone.statswhiz.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Introspected
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
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
    private String positionId;

    @JsonProperty("position")
    private String position;
}
