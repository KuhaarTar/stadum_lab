package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

abstract class SportComplex {
    private String name;
    private int capacity;
    private int currentAttendance;

    public abstract SportTypes[] getSupportedSports();
}
