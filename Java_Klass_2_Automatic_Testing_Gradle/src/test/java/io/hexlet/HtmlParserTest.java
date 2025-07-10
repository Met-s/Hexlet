package io.hexlet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HtmlParserTest {

//    @Test
//    public void testExtractLinks() throws Exception {
//
//        var path = Paths.get("src/test/resources/fixtures/withLinks.html");
//        var html = Files.readString(path).trim();
//
//        var links = HtmlParser.extractLinks(html);
//        assertEquals(List.of("/resumes/1"), links);
//    }

    private static Path getFixturePath(String fileName) {
        return Paths.get("src", "test", "resources", "fixtures",
                fileName).toAbsolutePath().normalize();
    }

    private static String readFixture(String fileName) throws Exception {
        var path = getFixturePath(fileName);
        return Files.readString(path).trim();
    }

    @Test
    public void testExtractLinks() throws Exception {
        var html = readFixture("withLinks.html");
        var links = HtmlParser.extractLinks(html);
        assertEquals(List.of("/resumes/1"), links);
    }


}
// assertEquals(List.of("/resumes/1", "/users/6"), links);*/



