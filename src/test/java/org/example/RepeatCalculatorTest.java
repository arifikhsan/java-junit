package org.example;

import org.example.inheritance.AbstractCalculatorTest;
import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatCalculatorTest extends AbstractCalculatorTest {
    @DisplayName("Tes random calculator")
    @RepeatedTest(value = 10, name = "{displayName} ke {currentRepetition} dari {totalRepetitions}")
    void testRandom(Random random, TestInfo testInfo) {
        var a = random.nextInt();
        var b = random.nextInt();

        System.out.println(a + b);
        System.out.println(testInfo.getDisplayName());
        assertEquals(a + b, calculator.add(a, b));
    }

    @DisplayName("Tes random calculator")
    @RepeatedTest(value = 10, name = "{displayName} ke {currentRepetition} dari {totalRepetitions}")
    void testRandomInfo(Random random, TestInfo testInfo, RepetitionInfo repetitionInfo) {
        var a = random.nextInt();
        var b = random.nextInt();

        System.out.println(testInfo.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        assertEquals(a + b, calculator.add(a, b));
    }
}
