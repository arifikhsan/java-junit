package org.example.inheritance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomCalculatorTest extends AbstractCalculatorTest {
    @Test
    void testRandom(Random random, TestInfo testInfo) {
        var a = random.nextInt();
        var b = random.nextInt();

        System.out.println(a + b);
        System.out.println(testInfo.getDisplayName());
        assertEquals(a + b, calculator.add(a, b));
    }
}
