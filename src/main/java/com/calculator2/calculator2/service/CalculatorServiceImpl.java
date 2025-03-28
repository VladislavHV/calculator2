package com.calculator2.calculator2.service;

import com.calculator2.calculator2.exception.CalculatorZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatorPlus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String calculatorMinus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String calculatorMultiply(int num1, int num2) {
        if (num1 == 0) {
            throw new RuntimeException("Умножать на ноль нельзя!");
        } else if (num2 == 0) {
            throw new CalculatorZeroException("Умножать на ноль нельзя");
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String calculatorDivide(int num1, int num2) {
        if (num1 == 0) {
            throw new RuntimeException("Делить на ноль нельзя!");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
