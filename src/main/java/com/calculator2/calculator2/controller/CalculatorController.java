package com.calculator2.calculator2.controller;

import com.calculator2.calculator2.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "")
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(int num1, int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(int num1, int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(int num1, int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(int num1, int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }
}
