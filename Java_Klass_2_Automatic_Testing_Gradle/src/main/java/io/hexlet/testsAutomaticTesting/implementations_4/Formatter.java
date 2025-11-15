package io.hexlet.testsAutomaticTesting.implementations_4;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.util.List;



public final class Formatter {
    private static ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
    private static ObjectMapper jsonMapper = new ObjectMapper();

    public static String format(List<String> data, String format) throws JsonProcessingException {
        var mapper = switch (format) {
            case "json" -> jsonMapper;
            case "yaml", "yml" -> yamlMapper;
            default -> throw new IllegalArgumentException("Format " + format + " not supported");
        };

        return mapper.writeValueAsString(data).trim();
    }
}
