package ua.lviv.iot.algo.part1.stadiumLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FootballFieldTest {
    @Test
    public void testGetSupportedSports() {
        var footballField = new FootballField("Salem football field", 1000, 100, 500, 200, "Artificial coating");
        SportTypes[] testArr = footballField.getSupportedSports();
        assertNotNull(testArr);
        assertEquals(1, testArr.length);
        assertArrayEquals(new SportTypes[]{SportTypes.FOOTBALL}, testArr);
    }
}