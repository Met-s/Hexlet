package io.hexlet;

import org.junit.jupiter.api.Test;

public class TestClass {
    private long startTime = System.currentTimeMillis();

    @Test
    public void testFirst() {
        System.out.println("first = " + startTime);
    }

    @Test
    public void tetStcond() {
        System.out.println("second = " + startTime);
    }
}
