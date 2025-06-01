package io.hexlet.modul;

import org.apache.commons.lang3.ArrayUtils;


public class Methods_42 {
    private static String implementation = "right";

    private static int right(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.indexOf(numbers, value, fromIndex);
    }

    private static int wrong1(int[] numbers, int value, int fromIndex) {
        var index = ArrayUtils.indexOf(numbers, value, fromIndex);
        return index == -1 ? 0 : index;
    }

    private static int wrong2(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.indexOf(numbers, value, 0);
    }

    private static int wrong3(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.isEmpty(numbers)
                ? 0
                : ArrayUtils.indexOf(numbers, value, fromIndex);
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static int indexOf(int[] numbers, int value, int fromIndex) {
        return switch (implementation) {
            case "wrong1" -> wrong1(numbers, value, fromIndex);
            case "wrong2" -> wrong2(numbers, value, fromIndex);
            case "wrong3" -> wrong3(numbers, value, fromIndex);
            default -> right(numbers, value, fromIndex);
        };
    }
}

