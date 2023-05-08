package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageSalesMonthTest {
    @Test
    public void averageSalesMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

}
