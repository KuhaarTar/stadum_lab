package ua.lviv.iot.algo.part1.stadiumLab;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class SwimmingPool extends SportComplex{
    private int numberOfShowerRooms;
    private int volumeOfThePool;
    private int maximumNumberOfParticipantsInCompetition;

    public SwimmingPool(String name, int capacity, int currentAttendance,
                        int numberOfShowerRooms, int volumeOfThePool, int maximumNumberOfParticipantsInCompetition) {
        super(name, capacity, currentAttendance);
        this.numberOfShowerRooms = numberOfShowerRooms;
        this.volumeOfThePool = volumeOfThePool;
        this.maximumNumberOfParticipantsInCompetition = maximumNumberOfParticipantsInCompetition;
    }

    @Override
    public String getSupportedSports() {
        return "1. Swimming , 2. Diving , 3. Dance on the water";
    }
}
