package io.hexlet.testsAutomaticTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static io.hexlet.testsAutomaticTesting.Methods_2.slice;
import java.util.List;
import java.util.ArrayList;

public class Methods_2Test {

    @Test
    public void sliceTest() {
        var numbers = List.of(1, 2, 3, 4, 5);
        var actual = slice(numbers, 1, 4);
        assertEquals(List.of(2, 3, 4), actual);

        assertNotSame(numbers, actual);

        var numbers1 = List.of();
        var actual1 = slice(numbers1, 1, 4);
        assertEquals(List.of(), actual1);

        var actual2 = slice(numbers, -4, -2);
        assertEquals(List.of(2, 3), actual2);

//        var actual3 = slice(numbers, -8, 8);
//        assertEquals(numbers, actual3);

        var actual4 = slice(numbers, 1, -8);
        assertEquals(List.of(2, 3, 4), actual4);


    }


}
