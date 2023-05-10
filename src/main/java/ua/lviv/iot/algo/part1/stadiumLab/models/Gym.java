package ua.lviv.iot.algo.part1.stadiumLab.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@AllArgsConstructor
@ToString(callSuper = true)
public class Gym extends SportComplex{

    private Integer id;
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

    @Override
    public String getClassName() {
        return "Gym";
    }

    public String getHeaders(){
        return super.getHeaders()+"  , countOfSimulator, monthlySubscriptionFee, countOfCoach";
    }

    public String toCSV(){
        return super.toCSV()+" ,"+getCountOfSimulator()+" ,"+getCountOfCoach()+","+getMonthlySubscriptionFee();
    }
    public Gym() {
        id = 0;
    }
}
