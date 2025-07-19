package io.hexlet.testsAutomaticTesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static io.hexlet.testsAutomaticTesting.Formatters_4.format;

public class Formatter_4Test {

    private static Path getFixturePath(String fileName) {
        return Paths.get("src", "test", "resources",
                "fixtures", fileName).toAbsolutePath().normalize();
    }

    private static String readFixture(String fileName) throws Exception {
        Path filePath = getFixturePath(fileName);
        return Files.readString(filePath).trim();
    }

    private static void writeFixture(String fileName, String text) throws Exception {
        var path = getFixturePath(fileName);
        Files.writeString(path, text);

    }

    static ArrayList<String> coll = new ArrayList<>();

    @BeforeAll
    public static void beforeAll() {
        coll.addAll(List.of("apple", "lemon", "pear"));
    }

    @Test
    public void testStringToJson() throws Exception {

        var expected = readFixture("list_4.json");
        var actual = format(coll, "json");
        assertEquals(expected, actual);
    }


    @Test
    public void testStringToYaml() throws Exception {

        var expected = readFixture("list_4.yaml");


        var actual = format(coll, "yaml");
        assertEquals(expected, actual);
    }

    @Test
    public void testStringToYml() throws Exception {
//        writeFixture("list_4.yml", format(coll, "yml"));
        var expected = readFixture("list_4.yml");
        var actual = format(coll, "yml");
        assertEquals(expected, actual);
    }


}
