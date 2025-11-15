package io.hexlet.testsAutomaticTesting;

import io.hexlet.testsAutomaticTesting.implementations_5.Library;
import io.hexlet.testsAutomaticTesting.implementations_5.LibraryRight;
import io.hexlet.testsAutomaticTesting.implementations_5.LibraryWrong1;
import io.hexlet.testsAutomaticTesting.implementations_5.LibraryWrong2;
import io.hexlet.testsAutomaticTesting.implementations_5.LibraryWrong3;

public class Libraries_5 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Library makeLibrary() {
        return switch (implementation) {
            case "wrong1" -> new LibraryWrong1();
            case "wrong2" -> new LibraryWrong2();
            case "wrong3" -> new LibraryWrong3();
            default -> new LibraryRight();
        };
    }
}

