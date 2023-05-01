package ua.lviv.iot.algo.part1.stadiumLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwimmingPoolTest {
    @Test
    public void testGetSupportedSports() {
            var swimmingPool = new SwimmingPool();
            SportTypes[] testArr = swimmingPool.getSupportedSports();
            assertNotNull(testArr);
            assertEquals(1, testArr.length);
            assertArrayEquals(new SportTypes[]{SportTypes.SWIMMING}, testArr);
    }
}
