package ua.lviv.iot.algo.part1.stadiumLab.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.stadiumLab.models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SportComplexManagerTest{
    private final List<SportComplex> sportComplexes = new ArrayList<>();
    private final List<SportComplex> res = new ArrayList<>();
    private SportComplexManager manager;
    private SportComplex sportComplex1;
    private SportComplex sportComplex2;
    private SportComplex sportComplex3;
    private SportComplex sportComplex4;


    @BeforeEach
    public void setUp(){
        sportComplex1 = new SwimmingPool("Lviv central pool", 2000,
                50, 20, 50, 5);
        sportComplex2 = new FootballField("Salem football field", 1500, 100, 500, 200, "Artificial coating");
        sportComplex3 = new Stadium("Yavoriv stadium", 3000,
                400, "Red team", "Team of blue");
        sportComplex4 = (new Gym("Fitness club", 120,
                200, 250, "15$", 20));
        Collections.addAll(sportComplexes,sportComplex1,sportComplex2,sportComplex3,sportComplex4);
        manager = new SportComplexManager(sportComplexes);
    }

    @Test
    public void testFindAllWithCapacityGreaterThan() {
        Collections.addAll(res,sportComplex1,sportComplex2,sportComplex3);
        assertEquals(res, manager.findAllWithCapacityGreaterThan(1000));
    }

    @Test
    public void testFindAllByName(){
        Collections.addAll(res,sportComplex4);
        assertEquals(res,manager.findAllByName("Fitness club"));
    }

    @Test
    public void testPrintSportComplex() {
        Collections.addAll(res,sportComplex1,sportComplex2,sportComplex3,sportComplex4);
        assertEquals(res, manager.printSportComplexes());
    }

    @Test
    public void testAddSportComplex(){
        manager.addSportComplex(sportComplex1);
        assertEquals(5,sportComplexes.size());
    }
}
