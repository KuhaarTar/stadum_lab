package ua.lviv.iot.algo.part1.stadiumLab;

import java.util.ArrayList;
import java.util.List;

public class SportComplexManager {
    private final List<SportComplex> sportComplexes = new ArrayList<>();

    public void addSportComplex(final SportComplex sportComplex) {
        sportComplexes.add(sportComplex);
    }

    public void findAllWithCapacityGreaterThan(int capacity) {
        sportComplexes.stream()
                .filter(s -> s.getCapacity() >= capacity)
                .forEach(s -> System.out.println(s));

    }

    public void findAllByName(String name) {
        sportComplexes.stream()
                .filter(s -> s.getName() == name)
                .forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        SportComplexManager sportComplexManager = new SportComplexManager();

        sportComplexManager.addSportComplex(new SwimmingPool("Lviv central pool", 200, 50, 20, 50, 5));
        sportComplexManager.addSportComplex(new SwimmingPool("Novoyavorivsk swimming  pool", 100, 20, 20, 50, 3));
        sportComplexManager.addSportComplex(new Stadium("Yavoriv stadium", 3000, 400, "Red team", "Team of blue"));
        sportComplexManager.addSportComplex(new Stadium("Olympic stadium", 10000, 8540, "Team of dragons", "Team of Black"));
        sportComplexManager.addSportComplex(new FootballField("Silmash", 200, 50, 300, 100, "Natural grass"));
        sportComplexManager.addSportComplex(new FootballField("Salem football field", 1000, 100, 500, 200, "Artificial coating"));
        sportComplexManager.addSportComplex(new Gym("Fitness club", 500, 200, 250, "15$", 20));
        sportComplexManager.addSportComplex(new Gym("UprisingTiger", 300, 100, 150, "5$", 7));

        sportComplexManager.findAllWithCapacityGreaterThan(400);
        sportComplexManager.findAllByName("Lviv central pool");

        for (SportComplex sportComplex : sportComplexManager.sportComplexes) {
            System.out.println(sportComplex);
        }

    }
}
