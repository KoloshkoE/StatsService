package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthMaxSalesTest {
    @Test
    public void monthMaxSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
