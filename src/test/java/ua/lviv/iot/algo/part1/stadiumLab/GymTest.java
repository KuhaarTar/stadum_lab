package ua.lviv.iot.algo.part1.stadiumLab;

import lombok.var;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GymTest{
    @Test
    public void testGetSupportedSports() {
        var gym = new Gym("Fitness club", 500, 200, 250, "15$", 20);
        SportTypes[] testArr = gym.getSupportedSports();
        assertNotNull(testArr);
        assertEquals(1, testArr.length);
        assertArrayEquals(new SportTypes[]{SportTypes.BOX}, testArr);
    }
}
