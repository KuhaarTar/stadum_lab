package ua.lviv.iot.algo.part1.stadiumLab.manager;

import ua.lviv.iot.algo.part1.stadiumLab.models.*;
import ua.lviv.iot.algo.part1.stadiumLab.writer.SportComplexWriter;

import java.io.IOException;
import java.util.LinkedList;
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

    public static void main(String[] args)  {
        List<SportComplex> complexList = new LinkedList<>();
        complexList.add(new SwimmingPool("Lviv central pool", 200,
                50, 20, 50, 5));
        complexList.add(new SwimmingPool("Lviv central pool", 200,
                50, 20, 50, 5));
        complexList.add(new Stadium("Olympic stadium", 10000,
                8540, "Team of dragons", "Team of Black"));
        complexList.add(new FootballField("Silmash", 200, 50, 300, 100, "Natural grass"));
        complexList.add(new Gym("UprisingTiger", 300,
                100, 150, "5$", 7));
        complexList.add(new Gym("UprisingTiger", 300,
                100, 150, "5$", 7));
        SportComplexWriter writer = new SportComplexWriter();
        writer.writeToFile(complexList);
    }
}
