package io.hexlet.modul;

public class Methods_43 {
    private static String implementation = "right";

    private static boolean right(int value, int other) {
        return value > other;
    }

    private static boolean wrong1(int value, int other) {
        return value >= other;
    }

    private static boolean wrong2(int value, int other) {
        return value != other;
    }

    private static boolean wrong3(int value, int other) {
        return true;
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static boolean gt(int value, int other) {
        return switch (implementation) {
            case "wrong1" -> wrong1(value, other);
            case "wrong2" -> wrong2(value, other);
            case "wrong3" -> wrong3(value, other);
            default -> right(value, other);
        };
    }
}

