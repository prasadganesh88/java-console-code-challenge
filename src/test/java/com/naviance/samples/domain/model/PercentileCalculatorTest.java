package com.naviance.samples.domain.model;

import static org.junit.Assert.*;
import org.junit.Test;

import com.naviance.samples.domain.model.PercentileCalculator;

public class PercentileCalculatorTest {

    private static final double ASSERTION_DELTA = .001;

    @Test
    public void calculateNearestRankPercentileOfOrderedList() {
        double[] numberList = new double[] {15, 20, 35, 40, 50};
        PercentileCalculator calculator = new PercentileCalculator();
        assertEquals("P30 of 5 item list", (double) 20,
                calculator.calculatePercentile(30, numberList), ASSERTION_DELTA);
        assertEquals("P40 of 5 item list", (double) 35,
                calculator.calculatePercentile(40, numberList), ASSERTION_DELTA);
        assertEquals("P100 of 5 item list", (double) 50,
                calculator.calculatePercentile(100, numberList),
                ASSERTION_DELTA);
    }

    @Test
    public void calculateNearestRankPercentileOfUnorderedList() {
        double[] numberList = new double[] {20, 15, 40, 35, 50};
        PercentileCalculator calculator = new PercentileCalculator();
        assertEquals("P30 of 5 item list", (double) 20,
                calculator.calculatePercentile(30, numberList), ASSERTION_DELTA);
        assertEquals("P40 of 5 item list", (double) 35,
                calculator.calculatePercentile(40, numberList), ASSERTION_DELTA);
    }

    @Test
    public void calculateNearestRankPercentileOfOrderedListWithRepeats() {
        double[] numberList = new double[] {15, 20, 35, 35, 40, 40, 50};
        PercentileCalculator calculator = new PercentileCalculator();
        assertEquals("P30 of 7 item list", (double) 35,
                calculator.calculatePercentile(30, numberList), ASSERTION_DELTA);
        assertEquals("P40 of 7 item list", (double) 35,
                calculator.calculatePercentile(40, numberList), ASSERTION_DELTA);
        assertEquals("P90 of 7 item list", (double) 50,
                calculator.calculatePercentile(90, numberList), ASSERTION_DELTA);

    }

    @Test
    public void calculateNearestRankPercentileOfUnorderedListWithRepeats() {

        double[] numberList = new double[] {20, 35, 15, 40, 35, 50, 40};
        PercentileCalculator calculator = new PercentileCalculator();
        assertEquals("P30 of 7 item list", (double) 35,
                calculator.calculatePercentile(30, numberList), ASSERTION_DELTA);
        assertEquals("P40 of 7 item list", (double) 35,
                calculator.calculatePercentile(40, numberList), ASSERTION_DELTA);
        assertEquals("P90 of 7 item list", (double) 50,
                calculator.calculatePercentile(90, numberList), ASSERTION_DELTA);
    }

}
