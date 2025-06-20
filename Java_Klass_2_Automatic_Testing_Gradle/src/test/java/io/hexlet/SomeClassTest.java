package io.hexlet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomeClassTest {
    @Test
    public void testSum() {
        var expected = 5;
        var actual = SomeClass.sum(3, 32);
        assertEquals(expected, actual);
    }
}
