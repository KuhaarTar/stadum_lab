package ua.lviv.iot.algo.part1.stadiumLab.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class SwimmingPool extends SportComplex {
    private int numberOfShowerRooms;
    private int volumeOfThePool;
    private int maximumNumberOfCompetition;

    public SwimmingPool(final String name, final int capacity, final int currentAttendance,
                         final int numberOfShowerRooms, final int volumeOfThePool, final int maximumNumberOfParticipantsInCompetition) {
        super(name, capacity, currentAttendance);
        this.numberOfShowerRooms = numberOfShowerRooms;
        this.volumeOfThePool = volumeOfThePool;
        this.maximumNumberOfCompetition
                = maximumNumberOfParticipantsInCompetition;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return new SportTypes[]{SportTypes.SWIMMING};
    }

    @Override
    public String getClassName() {
        return "SwimmingPool";
    }

    public String getHeaders(){
        return super.getHeaders()+" , numberOfShowerRooms ,volumeOfThePool ,maximumNumberOfCompetition";
    }

    public String toCSV(){
        return super.toCSV()+","+getNumberOfShowerRooms()+","+getVolumeOfThePool()+","+getMaximumNumberOfCompetition();
    }
}
