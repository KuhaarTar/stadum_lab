package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
