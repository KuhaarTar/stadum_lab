package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stadium {
    private String name;
    private int capacity;
    private int currentAttendance;
    private String homeTeam;
    private String awayTeam;
    private static Stadium instance;

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


    public static void main(String[] args) {
        var stadiums = new Stadium[4];
        stadiums[0] = new Stadium();
        stadiums[1] = new Stadium("CityStadium", 1000, 450, "Blue team", "RedTeam");
        stadiums[2] = getInstance();
        stadiums[3] = getInstance();
        for (Stadium stadium : stadiums) {
            System.out.println(stadium);
        }
    }
}