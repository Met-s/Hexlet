package io.hexlet.model;

public class Methods {
    public static String get(String[] strings, int index, String value) {
        if (index >= strings.length || index < 0) {
            return value;
        }
        return strings[index];
    }

}
