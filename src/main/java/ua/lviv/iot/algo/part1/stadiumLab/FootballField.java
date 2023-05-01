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

    public FootballField(final String name, final int capacity, final int currentAttendance,
                         final int length, final int width, final String typeFieldCoverage) {
        super(name, capacity, currentAttendance);
        this.length = length;
        this.width = width;
        this.typeFieldCoverage = typeFieldCoverage;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return new SportTypes[]{SportTypes.FOOTBALL};
    }

    @Override
    public String getClassName() {
        return "FootballField";
    }

    public String getHeaders(){
        return  super.getHeaders() +"  , length ,width ,typeFieldCoverage";
    }

    public String toCSV(){
        return super.toCSV()+","+getLength()+","+getWidth()+","+getTypeFieldCoverage();
    }
}
