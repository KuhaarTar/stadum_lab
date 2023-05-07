package ua.lviv.iot.algo.part2.java_spring_lab.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
@AllArgsConstructor
public class Gym {
    private Integer id;
    private String name;
    private int capacity;
    private int currentAttendance;
    private int countOfSimulator;
    private String monthlySubscriptionFee;
    private int countOfCoach;

    public Gym() {
        id = 0;
    }
}
