package io.hexlet.testsAutomaticTesting.implementations_4;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.util.List;

public final class FormatterWrong1 {
    private static ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
    private static ObjectMapper jsonMapper = new ObjectMapper();

    public static String format(List<String> data, String format) throws JsonProcessingException {

        switch (format) {
            case "json" -> {
                return jsonMapper.writeValueAsString(data);
            }
            case "yaml", "yml" -> {
                if (data.isEmpty()) {
                    return "";
                }

                return yamlMapper.writeValueAsString(data);
            }
            default -> throw new IllegalArgumentException("Format " + format + " not supported");
        }
    }
}
