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


    public Stadium(final String name ,final int capacity,
                    final int currentAttendance, final String homeTeam,
                    final String awayTeam, SportTypes... types) {
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

    public int addAttendies(final int count) {
        if (currentAttendance != capacity) {
            currentAttendance += count;
            return currentAttendance;
        }
        return currentAttendance;
    }

    public int decreaseAttendance() {
        if (currentAttendance - 100 < 0) {
            currentAttendance = 0;
            return currentAttendance;
        } else {
            currentAttendance = currentAttendance - 100;
        }
        return currentAttendance;
    }

    public String changeHomeTeam(final String teamName) {
        homeTeam = teamName;
        return homeTeam;
    }

    public String changeAwayTeam(final String teamName) {
        awayTeam = teamName;
        return awayTeam;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return sportTypes;
    }
}
