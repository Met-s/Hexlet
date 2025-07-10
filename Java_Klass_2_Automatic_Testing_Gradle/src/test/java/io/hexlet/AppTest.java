package io.hexlet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {


    private static Path getFixturePath(String fileName) {
        return Paths.get("src", "test", "resources", "fixtures", fileName)
                .toAbsolutePath().normalize();
    }

    private static String readFixture(String fileName) throws Exception {
        var path = getFixturePath(fileName);
        return Files.readString(path).trim();
    }

    private static void writeFixture(String fileName, String text) throws Exception {
        var path = getFixturePath(fileName);
        Files.writeString(path, text);

    }
    String text;


    @BeforeEach
    public void readeText() throws Exception {
        text = readFixture("textString.txt");
    }

    @Test
    public void appReverseTest() throws Exception {

        var links = AppReverse.reverse(text);
        writeFixture("reversText.txt",links);
        var actual = readFixture("reversText.txt");
        var expected = readFixture("fixturesReversText.txt");
        assertEquals(expected, actual);
    }
}
