package io.hexlet;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser {
    public static List<String> extractLinks(String html) {
        List<String> result = new ArrayList<>();

        result.add(html.substring(html.lastIndexOf("href=") + 6,
                html.lastIndexOf("\">B")));

        System.out.println(result);

        return result;
    }
}
