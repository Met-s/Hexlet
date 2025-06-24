package io.hexlet;

import java.util.Arrays;

import static io.hexlet.modul.Methods_45.without;


public class App {
    public static void main(String[] args) {
        /**
         * АвтоТесты: JUnit
         * ###_____ Задание ____###
         * //№_45
         */

        int[] numbers = {1, 2, 3, 4, 5};
        // исключаем из исходного массива числа 2 и 3
        var result = without(numbers, 2, 3);
        System.out.println(Arrays.toString(result));

        int[] emptyNumbers = {};
        var result1 = without(emptyNumbers, 3, 4, 5);
        System.out.println(Arrays.toString(result1));

        int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
        var result2 = without(withDuplicateNumbers, 2);
        System.out.println(Arrays.toString(result2));

        var result3 = without(numbers, 8);
        System.out.println(Arrays.toString(result3));

    }

}