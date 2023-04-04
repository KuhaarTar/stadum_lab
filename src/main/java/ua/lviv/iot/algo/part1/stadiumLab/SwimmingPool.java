package ua.lviv.iot.algo.part1.stadiumLab;

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

    public SwimmingPool(String name, int capacity, int currentAttendance,
                        int numberOfShowerRooms, int volumeOfThePool, int maximumNumberOfParticipantsInCompetition) {
        super(name, capacity, currentAttendance);
        this.numberOfShowerRooms = numberOfShowerRooms;
        this.volumeOfThePool = volumeOfThePool;
        this.maximumNumberOfCompetition = maximumNumberOfParticipantsInCompetition;
    }

    @Override
    public SportTypes[] getSupportedSports() {
        return new SportTypes[]{SportTypes.SWIMMING};
    }
}
