package io.hexlet.modul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.module.Methods_49.fill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Method_49Test {

    List<String> coll = new ArrayList<>();

    @BeforeEach
    public void bforeEach() {
        coll.addAll(Arrays.asList("a", "b", "c", "d"));
    }


    @Test
    public void test() {

        fill(coll, "*", 1, 3);
        var expected = Arrays.asList("a", "*", "*", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test2() {

        fill(coll, "*", 2);
        var expected = Arrays.asList("a", "b", "*", "*");
        assertEquals(expected, coll);
    }

    @Test
    public void test3() {

        fill(coll, "*");
        var expected = Arrays.asList("*", "*", "*", "*");
        assertEquals(expected, coll);
    }
    //    =================================================

    @Test
    public void test4() {

        var expected = Arrays.asList("*", "*", "*", "*");
        fill(coll, "*", 0, 10);
        assertEquals(expected, coll);
    }

    @Test
    public void test9() {
        var expected = Arrays.asList("a", "b", "c", "d");
        fill(coll, "*", 10, 2);
        assertEquals(expected, coll);
    }

//    ====================================

    @Test
    public void test5() {

        fill(coll, "*", 4, 6);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test7() {
        fill(coll, "*", -1, 6);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test10() {
        fill(coll, "*", 1, -1);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }


    @Test
    public void test6() {
        fill(coll, "*", -5);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test8() {
        fill(coll, "*", 6);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test11() {

        coll = Arrays.asList();
        fill(coll, "*");
        var expected = Arrays.asList();
        assertEquals(expected, coll);
    }



}
