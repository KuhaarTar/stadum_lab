package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Gym extends SportComplex {
    private int countOfSimulator;
    private String monthlySubscriptionFee;
    private int countOfCoach;

    public Gym(String name, int capacity, int currentAttendance,
               int countOfSimulator, String monthlySubscriptionFee, int countOfCoach) {
        super(name, capacity, currentAttendance);
        this.countOfSimulator = countOfSimulator;
        this.monthlySubscriptionFee = monthlySubscriptionFee;
        this.countOfCoach = countOfCoach;
    }

    @Override
    public String getSupportedSports() {
        return "1. Powerlifting ";
    }
}
