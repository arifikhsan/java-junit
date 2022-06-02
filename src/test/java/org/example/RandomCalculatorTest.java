package org.example;

import org.example.Calculator;
import org.example.resolver.RandomParameterResolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
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

    @DisplayName("Tes random calculator")
    @ParameterizedTest(name = "{displayName} ke {index} dari {arguments} dengan parameter {0}")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void testWithParameter(int value) {
        var expected = value + value;
        var actual = calculator.add(value, value);
        assertEquals(expected, actual);
    }

    public static List<Integer> parameterSource() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @DisplayName("Tes random calculator")
    @ParameterizedTest(name = "{displayName} ke {index} dari {arguments} dengan parameter {0}")
    @MethodSource("parameterSource")
    void testWithMethodSource(int value) {
        var expected = value + value;
        var actual = calculator.add(value, value);
        assertEquals(expected, actual);
    }
}
