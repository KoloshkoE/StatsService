package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int amount = 0;
        for (long sale : sales) {
            amount = (int) (amount + sale);
        }
        return amount;
    }

    public int averageSalesMonth(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesBelowAverage(long[] sales) {
        int salBelAve = 0;
        for (long sale : sales) {
            if (sale < averageSalesMonth(sales)) {
                salBelAve = salBelAve + 1;
            }
        }
        return salBelAve;
    }

    public int salesAboveAverage(long[] sales) {
        int salAboAve = 0;
        for (long sale : sales) {
            if (sale > averageSalesMonth(sales)) {
                salAboAve = salAboAve + 1;
            }
        }
        return salAboAve;
    }
}

