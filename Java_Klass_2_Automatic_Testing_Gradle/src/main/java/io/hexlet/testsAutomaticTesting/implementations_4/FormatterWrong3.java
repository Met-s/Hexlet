package io.hexlet.testsAutomaticTesting.implementations_4;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public final class FormatterWrong3 {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String format(List<String> data, String format) throws JsonProcessingException {
        return mapper.writeValueAsString(data).trim();
    }
}