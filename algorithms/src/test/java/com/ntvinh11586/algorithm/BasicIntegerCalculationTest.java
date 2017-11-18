package com.ntvinh11586.algorithm;

import junit.framework.Assert;

import org.junit.Test;

public class BasicIntegerCalculationTest {

    @Test
    public void shouldPerformAddTwoIntegersRight() {
        Assert.assertEquals(
                10,
                BasicIntegerCalculation.addTwoIntegers(3,  7).intValue()
        );
    }
}