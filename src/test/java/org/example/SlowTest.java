package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SlowTest {

    @Test
    @Timeout(value = 15, unit = SECONDS)
    void testSlow() throws InterruptedException {
        Thread.sleep(10_000);
        System.out.println("Slow test");
    }
}
