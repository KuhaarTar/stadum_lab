package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class FootballField extends SportComplex {

    private int length;
    private int width;
    private String typeFieldCoverage;

    public FootballField(String name, int capacity, int currentAttendance,
                         int length, int width, String typeFieldCoverage) {
        super(name, capacity, currentAttendance);
        this.length = length;
        this.width = width;
        this.typeFieldCoverage = typeFieldCoverage;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return new SportTypes[]{SportTypes.FOOTBALL};
    }
}
