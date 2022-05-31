package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    @Test
    @Order(1)
    void test3() {
        System.out.println("test3");
    }

    @Test
    @Order(2)
    void test2() {
        System.out.println("test2");
    }

    @Test
    @Order(3)
    void test1() {
        System.out.println("test1");
    }
}
