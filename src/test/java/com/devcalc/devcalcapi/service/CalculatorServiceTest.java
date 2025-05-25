package com.devcalc.devcalcapi.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(15, calculatorService.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculatorService.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
    }
}
