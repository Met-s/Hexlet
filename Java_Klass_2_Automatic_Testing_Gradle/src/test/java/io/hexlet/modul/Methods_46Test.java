package io.hexlet.modul;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static io.hexlet.modul.Methods_46.add;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods_46Test {
    List<Integer> coll = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void test1() {
        assertTrue(add(coll, 5));
    }

    @Test
    public void test2() {
        assertTrue(add(coll, 5, 2));
    }

    @Test
    public void test3() {
        add(coll, 5);
        assertEquals(5, coll.getLast());
    }

    @Test
    public void test4() {
        add(coll, 5, 2);
        assertEquals(5, coll.get(2));
    }

    @Test
    public void test5() {
        add(coll, 5, 4);
        assertEquals(5, coll.getLast());
    }
}
