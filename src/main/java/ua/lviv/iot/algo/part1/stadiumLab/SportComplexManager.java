package ua.lviv.iot.algo.part1.stadiumLab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SportComplexManager {
    private List<SportComplex> sportComplexes = new ArrayList<>();

    public SportComplexManager(List<SportComplex> sportComplexes) {
        this.sportComplexes = sportComplexes;
    }
    public void addSportComplex(final SportComplex sportComplex) {
        sportComplexes.add(sportComplex);
    }

    public List<SportComplex> findAllWithCapacityGreaterThan(int capacity) {
        return sportComplexes.stream()
                .filter(s -> s.getCapacity() >= capacity)
                .collect(Collectors.toList());

    }

    public List<SportComplex> findAllByName(String name) {
        return sportComplexes.stream()
                .filter(s -> s.getName() == name)
                .collect(Collectors.toList());
    }

    public List<SportComplex> printSportComplexes() {
        for(SportComplex sportComplex: sportComplexes){
            System.out.println(sportComplex.toString());
        }
        return sportComplexes;
    }
}
