package ru.netology.statisics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    @Test
    void calculateSum() { // Сумма всех продаж

        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);

    }

//    @Test
//    void averageSumInMonth() {
//
//        long [] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        long averageSum = 15;
//
//        long actual = StatisticsService.averageSumInMonth(averageSum);
//
//        assertEquals(averageSum, actual);
//    }

    @Test
    void findMax() {

        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void maxSales() { // Номер месяца, в котором был пик продаж

        StatisticsService service = new StatisticsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = 6;

        int actual = service.maxSales(month);

        assertEquals(maxMonth, actual);

    }

    @Test
    void minSales() { // Номер месяца, в котором был минимум продаж

        StatisticsService service = new StatisticsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth = 9;

        int actual = service.minSales(month);

        assertEquals(minMonth, actual);

    }
}
