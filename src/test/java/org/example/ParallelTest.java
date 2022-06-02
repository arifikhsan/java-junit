package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelTest {
    @Test
    void testSlow1() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    void testSlow2() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    void testSlow3() throws InterruptedException {
        Thread.sleep(4_000);
    }
}
