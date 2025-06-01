package io.hexlet.modul;

import org.junit.jupiter.api.Test;

import static io.hexlet.modul.Methods_43.gt;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MethodsTest_43 {

    @Test
    public void testGt() {
        assertThat(gt(3, 1)).isTrue();
        assertThat(gt(3, 3)).isFalse();
        assertThat(gt(3, 4)).isFalse();
    }
}
