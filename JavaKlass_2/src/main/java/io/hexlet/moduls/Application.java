package io.hexlet.moduls;

import java.util.List;

public class Application {
    public static Double average(List<Integer> numbers) {
        // Double
        var sum = 0.0;
        for (var number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static <T> Double averageJ(List<? extends Number> numbers) {
        var sum = 0.0;
        for (var number : numbers) {
        // The operator += is undefined for the argument type(s) double, T
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    // Copy
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }



}
