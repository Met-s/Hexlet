package io.hexlet.util;


public class MathUtils {
    /**
     * Статический метод для вычисления факториала числа
     */
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
