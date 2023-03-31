package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class Stadium extends SportComplex {
    private String name;
    private int capacity;
    private int currentAttendance;
    private String homeTeam;
    private String awayTeam;
    private static Stadium instance;

    public Stadium(String name, int capacity, int currentAttendance, String homeTeam, String awayTeam) {
        this.name = name;
        this.capacity = capacity;
        this.currentAttendance = currentAttendance;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    static Stadium getInstance() {
        if (instance == null) {
            instance = new Stadium();
        }
        return instance;
    }

    void addAttendies(int count) {
        if (currentAttendance != capacity) {
            currentAttendance += count;
        } else {
            System.out.println("Stadium is full");
        }
    }

    void decreaseAttendance() {
        if (currentAttendance - 100 < 0) {
            currentAttendance = 0;
        } else {
            currentAttendance = currentAttendance - 100;
        }
    }

    void changeHomeTeam(String teamName) {
        homeTeam = teamName;
    }

    void changeAwayTeam(String teamName) {
        awayTeam = teamName;
    }

    @Override
    public String getSupportedSports() {
        return "1. Handball , 2. Volleyball , 3. Basketball";
    }
}