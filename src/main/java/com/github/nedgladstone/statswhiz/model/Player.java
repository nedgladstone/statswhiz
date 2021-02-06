package com.github.nedgladstone.statswhiz.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "mlb_player_id")
    private Long mlbPlayerId;

    @Column(name = "name_last")
    private String nameLast;

    @Column(name = "name_first")
    private String nameFirst;

    @Column(columnDefinition = "DATE", name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "birth_country")
    private String birthCountry;

    @Column(name = "college")
    private String college;

    @Column(name = "height_inches")
    private int heightInches;

    @Column(name = "weight_pounds")
    private int weightPounds;

    @Column(columnDefinition = "DATE", name = "pro_debut_date")
    private LocalDate proDebutDate;

    @Column(name = "batting_hand")
    private char battingHand;

    @Column(name = "throwing_hand")
    private char throwingHand;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Stats> stats = new ArrayList<>();


    private static char mlbHandedToChar(String mlbHand) {
        return mlbHand.charAt(0);
    }

    public Player() {
    }

    public Player(Long mlbPlayerId, String nameLast, String nameFirst, LocalDate birthDate, String birthCountry, String college, int heightInches, int weightPounds, LocalDate proDebutDate, char battingHand, char throwingHand) {
        this.mlbPlayerId = mlbPlayerId;
        this.nameLast = nameLast;
        this.nameFirst = nameFirst;
        this.birthDate = birthDate;
        this.birthCountry = birthCountry;
        this.college = college;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
        this.proDebutDate = proDebutDate;
        this.battingHand = battingHand;
        this.throwingHand = throwingHand;
    }

    public Player(PlayerMlb playerMlb) {
        this.mlbPlayerId = playerMlb.getPlayerId();
        this.nameLast = playerMlb.getNameLast();
        this.nameFirst = playerMlb.getNameFirst();
        this.birthDate = LocalDateTime.parse(playerMlb.getBirthDate()).toLocalDate();
        this.birthCountry = playerMlb.getBirthCountry();
        this.college = playerMlb.getCollege();
        this.heightInches = playerMlb.getHeightFeet() * 12 + playerMlb.getHeightInches();
        this.weightPounds = playerMlb.getWeight();
        this.proDebutDate = LocalDateTime.parse(playerMlb.getProDebutDate()).toLocalDate();
        this.battingHand = mlbHandedToChar(playerMlb.getBattingHand());
        this.throwingHand = mlbHandedToChar(playerMlb.getThrowingHand());
    }

    public Player addStats(Stats stats) {
        this.stats.add(stats);
        stats.setPlayer(this);
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFullName() {
        return nameFirst + " " + nameLast;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public LocalDate getProDebutDate() {
        return proDebutDate;
    }

    public void setProDebutDate(LocalDate proDebutDate) {
        this.proDebutDate = proDebutDate;
    }

    public char getBattingHand() {
        return battingHand;
    }

    public void setBattingHand(char battingHand) {
        this.battingHand = battingHand;
    }

    public char getThrowingHand() {
        return throwingHand;
    }

    public void setThrowingHand(char throwingHand) {
        this.throwingHand = throwingHand;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public Long getMlbPlayerId() {
        return mlbPlayerId;
    }

    public void setMlbPlayerId(Long mlbPlayerId) {
        this.mlbPlayerId = mlbPlayerId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", mlbPlayerId=" + mlbPlayerId +
                ", nameLast='" + nameLast + '\'' +
                ", nameFirst='" + nameFirst + '\'' +
                ", birthDate=" + birthDate +
                ", birthCountry='" + birthCountry + '\'' +
                ", college='" + college + '\'' +
                ", heightInches=" + heightInches +
                ", weightPounds=" + weightPounds +
                ", proDebutDate=" + proDebutDate +
                ", battingHand=" + battingHand +
                ", throwingHand=" + throwingHand +
                ", stats=" + stats +
                '}';
    }
}
