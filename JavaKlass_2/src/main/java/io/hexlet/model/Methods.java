package io.hexlet.model;

import org.apache.commons.lang3.*;


public class Methods {
/**
 * №_40
 */
//    public static String get(String[] strings, int index, String value) {
//        if (index >= strings.length || index < 0) {
//            return value;
//        }
//        return strings[index];
//    }
/**
* №_41
*/
    private static String implementation = "right";

    private static int[] right(int[] numbers, int n) {
        return ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong1(int[] numbers, int n) {
        return n <= numbers.length
                ? ArrayUtils.subarray(numbers, 0, n)
                : new int[] {};
    }

    private static int[] wrong2(int[] numbers, int n) {
        return ArrayUtils.isEmpty(numbers)
                ? new int[] {0}
                : ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong3(int[] numbers, int n) {
        return n == 0
                ? ArrayUtils.subarray(numbers, 0, numbers.length)
                : ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong4(int[] numbers, int n) {
        return n == numbers.length
                ? new int[] {}
                : ArrayUtils.subarray(numbers, 0, n);
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static int[] take(int[] numbers, int n) {
        return switch (implementation) {
            case "wrong1" -> wrong1(numbers, n);
            case "wrong2" -> wrong2(numbers, n);
            case "wrong3" -> wrong3(numbers, n);
            case "wrong4" -> wrong4(numbers, n);
            default -> right(numbers, n);
        };
    }

}
