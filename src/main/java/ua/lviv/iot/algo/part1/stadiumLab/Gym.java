package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class Gym extends SportComplex {
    private int countOfSimulator;
    private String monthlySubscriptionFee;
    private int countOfCoach;

    public Gym(final String name, final int capacity, final int currentAttendance,
               final int countOfSimulator, final String monthlySubscriptionFee, final int countOfCoach) {
        super(name, capacity, currentAttendance);
        this.countOfSimulator = countOfSimulator;
        this.monthlySubscriptionFee = monthlySubscriptionFee;
        this.countOfCoach = countOfCoach;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return new SportTypes[]{SportTypes.BOX};
    }
}
