package com.devcalc.devcalcapi.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public double sqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo");
        }
        return Math.sqrt(x);
    }
}
