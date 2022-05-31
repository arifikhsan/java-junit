package org.example;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private String temp;

    @Test
    void testA() {
        temp = "Arif";
    }

    @Test
    void testB() {
        System.out.println(temp);
    }
}
