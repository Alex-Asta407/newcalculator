package com.example.newcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mariuszgromada.math.mxparser.Expression;


public class ExampleUnitTest {
    @Test
    public void Given_StringFiveMultiplyFive_When_ExpCalculatePerformed_Then_ReturnTwentyFive() {
        final String givenString = "5*5";

        final int expectedResult = 25;
        Expression exp = new Expression(givenString);
        final int actualResult = (int) exp.calculate();

        assertEquals(expectedResult, actualResult);
    }
}