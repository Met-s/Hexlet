package io.hexlet.util;


public class TextUtils {
    public static int getWordsCount(String text) {
        int result = 0;
        text = text.trim();
        if (!text.isEmpty()) {
            String[] strRes = text.split(" ");
            result = strRes.length;
        }
        return result;
    }
}
