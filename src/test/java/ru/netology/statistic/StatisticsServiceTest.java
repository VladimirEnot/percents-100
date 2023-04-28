
    package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class StatisticsServiceTest {

        @Test
        public void findMaxWhenMaximumFirst() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
        public void findMaxWhenMaximumMiddle() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 35, 8, 6, 11, 11, 12};
            long expected = 35;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
    }



