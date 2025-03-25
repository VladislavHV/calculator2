package com.calculator2.calculator2.model;

import java.util.Objects;

public class Calculator {

    private int calculator;

    public Calculator(int calculator) {
        this.calculator = calculator;
    }

    public int getCalculator() {
        return calculator;
    }

    public void setCalculator(int calculator) {
        this.calculator = calculator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return calculator == that.calculator;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(calculator);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "calculator=" + calculator +
                '}';
    }
}
