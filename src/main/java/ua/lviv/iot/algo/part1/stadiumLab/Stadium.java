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
    private SportTypes[] sportTypes = new SportTypes[10];


    public Stadium(String name, int capacity,
                   int currentAttendance, String homeTeam,
                   String awayTeam, SportTypes... types) {
        this.name = name;
        this.capacity = capacity;
        this.currentAttendance = currentAttendance;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.sportTypes = types;
    }

    public static Stadium getInstance() {
        if (instance == null) {
            instance = new Stadium();
        }
        return instance;
    }

    public void addAttendies(int count) {
        if (currentAttendance != capacity) {
            currentAttendance += count;
        }
    }

    public void decreaseAttendance() {
        currentAttendance = Math.max(currentAttendance - 100, 0);
    }

    public void changeHomeTeam(String teamName) {
        homeTeam = teamName;
    }

    public void changeAwayTeam(String teamName) {
        awayTeam = teamName;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return sportTypes;
    }
}