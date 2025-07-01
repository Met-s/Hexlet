package io.hexlet.modul;

import java.util.List;
import io.hexlet.modul.implementations_48.Right;
import io.hexlet.modul.implementations_48.Wrong1;
import io.hexlet.modul.implementations_48.Wrong2;
import io.hexlet.modul.implementations_48.Wrong3;
import io.hexlet.modul.implementations_48.Wrong4;

public class Methods_48 {

    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static <T> int indexOf(List<T> coll, T value, int fromIndex) {
        return switch (implementation) {
            case "wrong1" -> Wrong1.indexOf(coll, value, fromIndex);
            case "wrong2" -> Wrong2.indexOf(coll, value, fromIndex);
            case "wrong3" -> Wrong3.indexOf(coll, value, fromIndex);
            case "wrong4" -> Wrong4.indexOf(coll, value, fromIndex);
            default -> Right.indexOf(coll, value, fromIndex);
        };
    }

    public static <T> int indexOf(List<T> coll, T value) {
        return switch (implementation) {
            case "wrong1" -> Wrong1.indexOf(coll, value);
            case "wrong2" -> Wrong2.indexOf(coll, value);
            case "wrong3" -> Wrong3.indexOf(coll, value);
            case "wrong4" -> Wrong4.indexOf(coll, value);
            default -> Right.indexOf(coll, value);
        };
    }
}
