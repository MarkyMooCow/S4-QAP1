package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// This is where we are running the calculator tests!
public class CalculatorTest {
    Calculator Calc = new Calculator();

    // Addition
    @Test
    public void testAdd() {
        int expectedResult = 35;
        long result = Calc.add(15, 20);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
    // Subtraction
    @Test
    public void testSubtract() {
        int expectedResult = 50;
        int result = Calc.subtract(75, 25);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
    // Multiplication
    @Test
    public void testMultiply() {
        int expectedResult = 10;
        long result = Calc.multiply(2, 5);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
    // Division, except this one will pass if the answer isn't 15.
    @Test
    public void testDivide() {
        int unexpectedResult = 15;
        long result = Calc.divide(50, 5);
        System.out.println(result);
        Assertions.assertNotEquals(unexpectedResult, result);
    }
    /*
    This is something I made to intentionally fail.
    I wanted to see what happened.
    @Test
    public void failDivide() {
        int expectedResult = 10;
        long result = Calc.divide(50, 5);
        System.out.println(result);
        Assertions.assertNotEquals(expectedResult, result);
    } */
}