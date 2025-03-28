package com.calculator2.calculator2;

import com.calculator2.calculator2.exception.CalculatorZeroException;
import com.calculator2.calculator2.service.CalculatorService;
import com.calculator2.calculator2.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void testWelcome() {
        assertEquals("Добро пожаловать в калькулятор", calculatorService.welcome());
    }

    @Test
    void testCalculatorPlus() {
        assertEquals("5 + 3 = 8", calculatorService.calculatorPlus(5, 3));
        assertEquals("4 + 4 = 8", calculatorService.calculatorPlus(4, 4));
    }

    @Test
    void testCalculatorMinus() {
        assertEquals("4 - 2 = 2", calculatorService.calculatorMinus(4, 2));
        assertEquals("90 - 89 = 1", calculatorService.calculatorMinus(90, 89));
    }

    @Test
    void testCalculatorMultiply() {
        assertEquals("7 * 2 = 14", calculatorService.calculatorMultiply(7, 2));
        assertEquals("9 * 9 = 81", calculatorService.calculatorMultiply(9, 9));
    }

    @Test
    void testCalculatorDivide() {
        assertEquals("20 / 4 = 5", calculatorService.calculatorDivide(20, 4));
        assertEquals("15 / 5 = 3", calculatorService.calculatorDivide(15, 5));
    }

    @Test
    void testCalculatorMultiplyThrowsExceptionNum1IsZero() {
        Exception exception = assertThrows(RuntimeException.class, () -> calculatorService.calculatorMultiply(0, 5));
        assertEquals("Умножать на ноль нельзя!", exception.getMessage());
    }

    @Test
    void testCalculatorMultiplyThrowsExceptionNum2IsZero() {
        Exception exception = assertThrows(CalculatorZeroException.class, () -> calculatorService.calculatorMultiply(5, 0));
        assertEquals("Умножать на ноль нельзя", exception.getMessage());
    }

    @Test
    void testCalculatorDivideThrowsExceptionNum1IsZero() {
        Exception exception = assertThrows(RuntimeException.class, () -> calculatorService.calculatorDivide(0, 1));
        assertEquals("Делить на ноль нельзя!", exception.getMessage());
    }

    @Test
    void testCalculatorDivideThrowsExceptionNum2IsZero() {
        Exception exception = assertThrows(CalculatorZeroException.class, () -> calculatorService.calculatorDivide(1, 0));
        assertEquals("Делить на ноль нельзя", exception.getMessage());
    }

}
