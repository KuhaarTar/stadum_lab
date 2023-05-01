package ua.lviv.iot.algo.part1.stadiumLab;

import java.util.List;
import java.util.stream.Collectors;

public class SportComplexManager {
    private final List<SportComplex> sportComplexes;

    public SportComplexManager(final List<SportComplex> sportComplexes) {
        this.sportComplexes = sportComplexes;
    }

    public void addSportComplex(final SportComplex sportComplex) {
        sportComplexes.add(sportComplex);
    }

    public List<SportComplex> findAllWithCapacityGreaterThan(final int capacity) {
        return sportComplexes.stream()
                .filter(s -> s.getCapacity() >= capacity)
                .collect(Collectors.toList());

    }

    public List<SportComplex> findAllByName(final String name) {
        return sportComplexes.stream()
                .filter(s -> s.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<SportComplex> printSportComplexes() {
        return sportComplexes;
    }
}
