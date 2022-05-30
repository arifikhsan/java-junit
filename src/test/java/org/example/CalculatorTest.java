package org.example;

import org.example.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//@DisplayName("Tes Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

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

    @Test
    @Disabled
    public void testComingSoon() {
        assertEquals(0, calculator.divide(4, 2));
    }
}
