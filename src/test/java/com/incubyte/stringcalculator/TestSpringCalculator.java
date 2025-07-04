package com.incubyte.stringcalculator;

import org.example.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestSpringCalculator {
    @Test
    public void ReturnZeroForEmptyString(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void ReturnNumberForSingleNumber(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void ReturnSumForTwoNumbers(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,5"));
    }
}
