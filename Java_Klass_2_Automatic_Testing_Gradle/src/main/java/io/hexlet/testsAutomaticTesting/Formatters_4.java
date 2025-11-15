package io.hexlet.testsAutomaticTesting;


import com.fasterxml.jackson.core.JsonProcessingException;
import io.hexlet.testsAutomaticTesting.implementations_4.Formatter;
import io.hexlet.testsAutomaticTesting.implementations_4.FormatterWrong1;
import io.hexlet.testsAutomaticTesting.implementations_4.FormatterWrong2;
import io.hexlet.testsAutomaticTesting.implementations_4.FormatterWrong3;

import java.util.List;


public class Formatters_4 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static String format(List<String> data, String format) throws JsonProcessingException {
        return switch (implementation) {
            case "wrong1" -> FormatterWrong1.format(data, format);
            case "wrong2" -> FormatterWrong2.format(data, format);
            case "wrong3" -> FormatterWrong3.format(data, format);
            default -> Formatter.format(data, format);
        };
    }
}
