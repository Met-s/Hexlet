package io.hexlet.modul;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.modul.Methods_42.indexOf;

public class MethodsTest_42 {

    @Test
    public void testIndexOf() {
        int[] numbers = {1, 2, 1, 2};
        assertThat(1).isEqualTo(indexOf(numbers, 2, 0));
        assertThat(-1).isEqualTo(indexOf(numbers, 8, 0));
        assertThat(-1).isEqualTo(indexOf(new int[] {}, -1, 0));
        assertThat(-1).isEqualTo(indexOf(numbers, 1, 5));
        assertThat(indexOf(numbers, 1, 0)).isEqualTo(0); //0
    }
}
