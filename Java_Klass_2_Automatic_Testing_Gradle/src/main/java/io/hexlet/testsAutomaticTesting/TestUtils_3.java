package io.hexlet.testsAutomaticTesting;


public class TestUtils_3 {
    public static boolean containsUpperCase(String text) {
        return text.matches(".*[A-Z].*");
    }

    public static boolean containsDigits(String text) {
        return text.matches(".*[0-9].*");
    }

    public static boolean containsSpecialChars(String text) {
        return text.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }
    public static boolean isLowerCaseAlphabetic(String text) {
        return text.matches("^[a-z]+$");
    }
}

