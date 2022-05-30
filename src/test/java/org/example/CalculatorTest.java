package org.example;

import org.example.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//@DisplayName("Tes Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
//    @DisplayName("Test skenario sukses untuk method add(integer, integer)")
    void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}
