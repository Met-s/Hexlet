package io.hexlet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SomeClassTest {

    @Test
    @DisplayName("SomeClassTest: Проверка метода сложения.")
    public void testSum() {
        var expected = 5;
        var actual = SomeClass.sum(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("SomeClassTst: User - getName, getAge.")
    public void testGetName() {
        var user = new User("Mark", 15);
        assertEquals("Mark", user.getName());
        assertEquals(15, user.getAge());
    }
}
