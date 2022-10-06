package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator Calc = new Calculator();

    @Test
    public void testAdd() {
        int expectedResult = 35;
        long result = Calc.add(15, 20);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testSubtract() {
        int expectedResult = 50;
        long result = Calc.subtract(75, 25);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testMultiply() {
        int expectedResult = 10;
        long result = Calc.multiply(2, 5);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    public void testDivide() {
        int unexpectedResult = 15;
        long result = Calc.divide(50, 5);
        System.out.println(result);
        Assertions.assertNotEquals(unexpectedResult, result);
    }
}