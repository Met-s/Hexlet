package io.hexlet;



import java.util.Stack;

import static io.hexlet.Methods.makeValidator;
import static io.hexlet.modul.Methods_43.gt;

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
 * ###_____ Утверждения Assert ____###
 */
//        assert 1 == 2 : "Ваш метод не работает!";
//        System.out.println("Hello world!");
///**
// * №_41
// */
//        int[] numbers = {1, 2, 3};
//
//        var result = take(numbers, 1); // [1]
//        var result1 = take(numbers, 2); // [1, 2]
//        var result2 = take(numbers, 9); // [1, 2, 3]
//        var result4 = take(numbers, -2); // []

//        int[] emptyNumbers = {};
//        var result3 = take(emptyNumbers, 2); // []
//
//        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(result1));
//        System.out.println(Arrays.toString(result2));
//        System.out.println(Arrays.toString(result3));
//        System.out.println(Arrays.toString(result4));
//
//        MethodsTest.testTake();
/**
 * ###_____ Страница модуля ____###
 * ###_____ Библиотека AssertJ ____###
 */
//        SomeClassTest.estMethod();
///**
// * №_42
// */
//        int[] numbers = {1, 2, 1, 2};
//        int[] numbersZero = {};
//        int[] numbersOne = {0};
//        int result1 = indexOf(numbers, 2, 0); // 1
//        int result2 = indexOf(numbers, 2, 2); // 3
//        int result3 = indexOf(numbers, 8, 0); // -1
//        int result4 = indexOf(numbersZero, 2, 0);
//        int result5 = indexOf(numbersOne, 2, 2);
//        int result6 = indexOf(numbers, 1, 0); // 0
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3); // -1
//        System.out.println(result4); // -1
//        System.out.println(result5); // -1
//        System.out.println(result6); // 0
/**
 * ###_____ Страница модуля ____###
 * ###_____ Матчеры ____###
 */
//        int[] a = {1, 2, 3};
//        int[] b = {1, 2, 3};

//        System.out.println(a.SameAs(b));
/**
 * №_43
 */
//        System.out.println(gt(3, 1)); // true
//        System.out.println(gt(3, 3)); // false
//        System.out.println(gt(1, 3)); // false
/**
 * ###_____ Страница модуля ____###
 * ###_____ Модульные тесты ____###
 */
        // Если вы не знакомы с дженериками, то не переживайте
        // Такой способ создания не влияет на использование
        // Он лишь нужен для указания типа данных, которые могут храниться в стеке
//        Stack<Integer> stack = new Stack<>();
//        // Проверка на пустоту
//        System.out.println(stack.isEmpty());            // true;
//        // Добавление в стек
//        System.out.println(stack.push(1)); // (1)
//        System.out.println(stack.push(2)); // (2, 1)
//
//        System.out.println(stack.push(3)); // (3, 2, 1)
//        System.out.println(stack);
//        System.out.println(stack.isEmpty()); // false
//        // Извлечение из стека
//        var value = stack.pop();    // 3. В стеке (2, 1)
//        System.out.println(value);
//        System.out.println(stack);
//        System.out.println(stack.pop()); // 2. В стеке (1)
//        System.out.println(stack.pop()); // 1. В стеке пусто
//        System.out.println(stack.isEmpty()); // true
/**
 * №_44
 */
        // Создаем объект валидатора
        var validator = makeValidator();
        // Так как не было добавлено ни одной проверки,
        // корректными данными будут считаться числа и значение null
        var result = validator.isValid(null); // true
        System.out.println(result);
        var result1 = validator.isValid("some string"); // false
        System.out.println(result1);

        // добавляем проверку, что переданное значение должно быть числом
        validator.required();
        var result2 = validator.isValid(null); //false
        System.out.println(result2);

        // добавляем проверку, что переданное число больше нуля
        validator.positive();
        var result3 = validator.isValid(5); // true
        System.out.println(result3);
        var result4 = validator.isValid(0); // false
        System.out.println(result4);












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