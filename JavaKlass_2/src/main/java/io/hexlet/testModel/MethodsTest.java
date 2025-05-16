package io.hexlet.testModel;

import io.hexlet.model.Methods;

public class MethodsTest {

//    public static void testGet() {
//
//        String[] strings = new String[]{"hello", "world"};
//
//        if (!"hello".equals(Methods.get(strings, 0, "value"))) {
//            throw new AssertionError("Метод работает неверно!");
//        }
//
//        if (!"value".equals(Methods.get(strings, 3, "value"))) {
//            throw new AssertionError("Метод работает неверно!");
//        }
//
//        if (!"value".equals(Methods.get(strings, -1, "value"))) {
//            throw new AssertionError("Метод работает неверно!");
//        }
//        System.out.println("Все тесты пройдены!");
//    }
    public static void testGet() {
        String[] strings = {"zero", "one", "two", "three"};
        var defaultValue = "value";

        var actual1 = Methods.get(strings, 0, defaultValue);
        if (!actual1.equals(strings[0])) {
            throw new AssertionError("actual1");
        }

        var actual2 = Methods.get(strings, 2, defaultValue);
        if (!actual2.equals(strings[2])) {
            throw new AssertionError("actual2");
        }

        var actual3 = Methods.get(strings, 8, defaultValue);
        if (!defaultValue.equals(actual3)) {
            throw new AssertionError("actual3");
        }

        var actual4 = Methods.get(strings, -2, defaultValue);
        if (!defaultValue.equals(actual4)) {
            throw new AssertionError("actual4");
        }
        }

}
