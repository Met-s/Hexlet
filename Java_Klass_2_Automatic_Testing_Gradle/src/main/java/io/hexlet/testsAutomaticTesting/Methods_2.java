package io.hexlet.testsAutomaticTesting;


import java.util.List;
import io.hexlet.testsAutomaticTesting.implementations_2.Right;
import io.hexlet.testsAutomaticTesting.implementations_2.Wrong1;
import io.hexlet.testsAutomaticTesting.implementations_2.Wrong2;
import io.hexlet.testsAutomaticTesting.implementations_2.Wrong3;


public class Methods_2 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static <T> List<T> slice(List<T> coll, int begin, int end) {
        return switch (implementation) {
            case "wrong1" -> Wrong1.slice(coll, begin, end);
            case "wrong2" -> Wrong2.slice(coll, begin, end);
            case "wrong3" -> Wrong3.slice(coll, begin, end);
            default -> Right.slice(coll, begin, end);
        };
    }
}

