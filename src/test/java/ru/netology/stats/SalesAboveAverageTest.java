package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesAboveAverageTest {
    @Test
    public void salesAboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
