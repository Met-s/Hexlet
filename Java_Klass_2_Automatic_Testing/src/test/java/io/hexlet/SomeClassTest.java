package io.hexlet;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SomeClassTest {
    @Test
    public void testMethod() {
        var a = "Hello, world!";
        var b = "Hello, world!";

        assertThat(a).isEqualTo(b);
        assertThat(a).isEqualTo("Hello, world!");
    }

}
