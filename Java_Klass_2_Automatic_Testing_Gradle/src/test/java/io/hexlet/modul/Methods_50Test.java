package io.hexlet.modul;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import static io.hexlet.module.Methods_50.toHtmlList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Methods_50Test {

//    private static Path getFixturePath(String fileName) {
//        return Paths.get("src", "test", "resources", "fixtures",
//                fileName).toAbsolutePath().normalize();
//    }
//
//    private static String readFixture(String fileName) throws Exception {
//        var path = getFixturePath(fileName);
//        return Files.readString(path).trim();
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"list.json", "list.yaml", "list.yml"})
//    void listHtml(String fileName) throws Exception {
//        var path = getFixturePath(fileName);
//        var expected = readFixture("result.html");
//        var actual = toHtmlList(String.valueOf(path));
//        assertEquals(expected, actual);
//    }


    private static Path getFixturePath(String fileName) {
        return Paths.get("src", "test", "resources", "fixtures", fileName)
                .toAbsolutePath().normalize();
    }

    private static String readFixture(String fileName) throws Exception {
        Path filePath = getFixturePath(fileName);
        return Files.readString(filePath).trim();
    }

//    @Test
//    public void testJsonToHtml() throws Exception {
//        var path = getFixturePath("list.json");
//        var expected = readFixture("result.html");
//        var actual = toHtmlList(path.toString());
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testYamlToHtml() throws Exception {
//        var path = getFixturePath("list.yaml");
//        var expected = readFixture("result.html");
//        var actual = toHtmlList(path.toString());
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testYmlToHtml() throws Exception {
//        var path = getFixturePath("list.yml");
//        var expected = readFixture("result.html");
//        var actual = toHtmlList(path.toString());
//
//        assertEquals(expected, actual);
//    }

    // Альтернативное решение


     private static String expected;

    // // Ожидаемый результат везде один и тот же, достаточно прочитать один раз перед всеми тестами
     @BeforeAll
     public static void beforeAll() throws Exception {
         expected = readFixture("result.html");
     }

    // // Так как тесты отличаются только форматом входных данных
    // // мы можем использовать параметризованные тесты
    // // Форматы, которые мы перечислили в аннотации ValueSource, передаются в тестовые метод в качестве аргумента
     @ParameterizedTest
     @ValueSource(strings = {"json", "yaml", "yml"})
     public void testToHtml(String type) throws Exception {
         var filePath = getFixturePath("list." + type);
         var actual = toHtmlList(filePath.toString());

         assertEquals(expected, actual);
     }

}
