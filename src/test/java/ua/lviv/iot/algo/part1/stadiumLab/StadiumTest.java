package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.EqualsAndHashCode;
import lombok.var;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@EqualsAndHashCode
public class StadiumTest {
    private SportTypes [] list = new SportTypes[10];

    @Test
    public void testGetInstance() {
        var instance = Stadium.getInstance();
        assertEquals(instance,Stadium.getInstance());
    }
    @Test
    public void testAddAttendiesWhenNotFull() {
        Stadium sportComplex = new Stadium("Stadium", 1000, 500 ,"null","null",list[9]);
        int result = sportComplex.addAttendies(100);
        assertEquals(600, result);
        assertEquals(600, sportComplex.getCurrentAttendance());
    }

    @Test
    public void testAddAttendiesWhenFull() {
        Stadium sportComplex = new Stadium("Stadium", 1000, 1000,"null","null",list[9]);
        int result = sportComplex.addAttendies(100);
        assertEquals(1000, result);
        assertEquals(1000, sportComplex.getCurrentAttendance());
    }
    @Test
    public void testDecreaseAttendance(){
        Stadium obj = new Stadium("Test",100,100,
                "null","null",list[9]);
        assertEquals(0,obj.decreaseAttendance());
    }
    @Test
    public void testChangeHomeTeam(){
        Stadium obj = new Stadium("Test",100,100,
                "null","null",list[9]);
        assertEquals("Lviv Team",obj.changeHomeTeam("Lviv Team"));
    }
    @Test
    public void testChangeAwayTeam(){
        Stadium obj = new Stadium("Test",100,100,
                "null","null",list[9]);
        assertEquals("Kyiv Team",obj.changeAwayTeam("Kyiv Team"));
    }
    @Test
    public void testGetSupportedSports(){
        Stadium obj = new Stadium("Test",100,100,
                "null","null",list[9]);
        assertEquals(obj.getSupportedSports(),obj.getSupportedSports());
    }
}