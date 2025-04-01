package io.hexlet.model;

import java.util.HashMap;


public class Fibonacci {
    private static HashMap<Long, Long> res = new HashMap<>();

    public static long isFib(long n) {

        if (n == 1) {
            return 0L;
        } else if (n == 2) {
            return 1L;
        }
        return isFib(n - 1) + isFib(n - 2);
    }

    public static long fib(long key) {
        return res.computeIfAbsent(key,Fibonacci::isFib);
    }

}
