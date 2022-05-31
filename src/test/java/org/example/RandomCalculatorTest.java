package org.example;

import org.example.Calculator;
import org.example.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Extensions({
//    @ExtendWith(RandomParameterResolver.class)
//})
@ExtendWith(RandomParameterResolver.class)
public class RandomCalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testRandom(Random random, TestInfo testInfo) {
        var a = random.nextInt();
        var b = random.nextInt();

        System.out.println(a + b);
        System.out.println(testInfo.getDisplayName());
        assertEquals(a + b, calculator.add(a, b));
    }
}
