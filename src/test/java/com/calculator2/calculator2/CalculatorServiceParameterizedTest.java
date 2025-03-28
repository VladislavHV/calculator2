package com.calculator2.calculator2;

import com.calculator2.calculator2.service.CalculatorService;
import com.calculator2.calculator2.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({
            "5, 3, 8",
            "-2, -3, -5"
    })
    void testCalculatorPlus(int num1, int num2, int expected) {
        assertEquals(num1 + " + " + num2 + " = " + expected, calculatorService.calculatorPlus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 4, 6",
            "-3, -7, 4"
    })
    void testCalculatorMinus(int num1, int num2, int expected) {
        assertEquals(num1 + " - " + num2 + " = " + expected, calculatorService.calculatorMinus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "6, 2, 12",
            "-3, 3, -9"
    })
    void testCalculatorMultiply(int num1, int num2, int expected) {
        assertEquals(num1 + " * " + num2 + " = " + expected, calculatorService.calculatorMultiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "9, 3, 3",
            "-8, 2, -4"
    })
    void testCalculatorDivide(int num1, int num2, int expected) {
        assertEquals(num1 +  " / " + num2 + " = " + expected, calculatorService.calculatorDivide(num1, num2));
    }

}
