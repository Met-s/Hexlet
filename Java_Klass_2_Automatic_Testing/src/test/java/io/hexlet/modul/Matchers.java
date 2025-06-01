package io.hexlet.modul;

import org.junit.jupiter.api.Test;

import static io.hexlet.modul.Methods.take;
import static org.assertj.core.api.Assertions.assertThat;

public class Matchers {
//    @Test
    public void testMatchers() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

//        assertThat(a).isSameAs(b);
//        assertThat(a).isNotSameAs(b);
        assertThat(a).isEqualTo(b);
    }
//    @Test
    public void testMatchersMass() {
        int[] data = {1, 2, 3};

//        assertThat(take(data, 2).length).isEqualTo(3);
        assertThat(take(data, 2)).hasSize(3);
    }
    @Test
    public void testMethod() {
        var a = "Hello, world!";
        assertThat(a)
                .startsWith("Hello")
                .contains("llo, ")
                .endsWith("!");
    }


}
