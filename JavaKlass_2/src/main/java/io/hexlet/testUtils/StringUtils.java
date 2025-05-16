package io.hexlet.testUtils;

public class StringUtils {
    public static String capitalizeNew(String text) {

        if ("".equals(text)) {
            return "";
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
    // Пример другой реализации того же самого метода
//    public static String capitalize(String text) {
//
//        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
//    }
    public static int len(String text) {
        return text.length();
    }
}
