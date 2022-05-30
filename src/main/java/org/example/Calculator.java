package org.example;

public class Calculator {
    public Integer add(Integer first, Integer second) {
        return first + second;
    }

    public Integer divide(Integer first, Integer second) {
        if (second == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return first / second;
    }
}
