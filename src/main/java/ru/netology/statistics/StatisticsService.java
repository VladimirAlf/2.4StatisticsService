package ru.netology.statistics;

import static com.sun.tools.doclint.Entity.sum;

public class StatisticsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

//    public static long averageSumInMonth(long salesAmount) {
//
//        long averageSumInMonth = salesAmount / salesAmount.length;
//
//        return averageSumInMonth;
//    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];

        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

}