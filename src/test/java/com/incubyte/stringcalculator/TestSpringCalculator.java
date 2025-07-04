package com.incubyte.stringcalculator;

import org.example.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void HandleNewlinesBetweenNumbers(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void SupportCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(8, calculator.add("//;\n4;4"));
    }

    @Test
    public void ThrowExceptionForNegativeNumbers(){
        StringCalculator calculator = new StringCalculator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("-1")
        );
        assertEquals("Negative Numbers Not Allowed -1", exception.getMessage());
    }
}
