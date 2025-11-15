package io.hexlet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAssetDemo {

    @Test
    @DisplayName("Path Java")
    public void testPathJava() {
        Path currentRelativePath = Paths.get("");
        Path currentDir = currentRelativePath.toAbsolutePath();
        String filename = "data" + File.separatorChar + "foo.txt";
        Path filepath = currentDir.resolve(filename);

        System.out.println(filepath);
        System.out.println(currentRelativePath);
        System.out.println(currentDir);
//        System.setOut(String.valueOf(filepath));
        var expected = "HI";
        var actual = "HI";
        String absolutePath = FileSystems.getDefault().getPath(
                        "src", "test", "resources", "fixtures", "fileTest.txt")
                .toAbsolutePath()
                .normalize()
                .toString();
        System.out.println(absolutePath);

        assertEquals(expected, actual);

    }
}
