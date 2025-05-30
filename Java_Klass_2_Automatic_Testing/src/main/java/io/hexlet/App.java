package io.hexlet;

import io.hexlet.TestMethod.MethodsTest;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

import static io.hexlet.model.Methods.take;
//import static src.test.java.io.hexlet.MethodsTestTest.testTakeTest;

public class App {
    public static void main(String[] args) {
/**
 * //=======================================================================
 * ###_____ Java: Автоматическое тестирование ____###
 * Причины тестирования
 */
//        var result = StringUtils.capitalize("hello"); // "Hello"
//        System.out.println(result);
//
//        System.out.println(StringUtils.capitalizeNew("hello"));
//        System.out.println(StringUtils.capitalize("how are you"));
//        System.out.println(StringUtils.capitalizeNew(""));

//        StringUtilsTest.testCapitalize();
//        StringUtilsTest.testCapitalizeZero();
//        System.out.println(StringUtils.len("hexlet"));
//        System.out.println(StringUtils.len(null));

//        if (7 != App.sum(3, 4)) {
//            throw new AssertionError("Not Summary!");
//        }
/**
 * №_40
 */
//        String[] strings = {"hello", "world"};
//        String result = Methods.get(strings, 0, "value");   // "world"
//        String result1 = Methods.get(strings, 5, "value");   // "value"
//        String result2 = Methods.get(strings, -2, "value");
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);
//        MethodsTest.testGet();
/**
 * ###_____ Страница модуля ____###
 * ###_____ Утверждения ____###
 */
//        assert 1 == 2 : "Ваш метод не работает!";
        System.out.println("Hello world!");
/**
 * №_41
 */
        int[] numbers = {1, 2, 3};

        var result = take(numbers, 1); // [1]
        var result1 = take(numbers, 2); // [1, 2]
        var result2 = take(numbers, 9); // [1, 2, 3]
        var result4 = take(numbers, -2); // []

        int[] emptyNumbers = {};
        var result3 = take(emptyNumbers, 2); // []

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(result4));

        MethodsTest.testTake();

    }
}
/**
 * //=======================================================================
 * ###_____ Java: Автоматическое тестирование ____###
 * Причины тестирования
 */
//    public static int sum(int a, int b) {
//        return a + b;
//    }
/**
 * №_40
 */

/**
 * №_
 */

/**
 * ###_____ Страница модуля ____###
 */
//###_____ Страница модуля ____###
// №_