package io.hexlet;

public class AppReverse {

    public static String reverse(String input) {
        var reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
