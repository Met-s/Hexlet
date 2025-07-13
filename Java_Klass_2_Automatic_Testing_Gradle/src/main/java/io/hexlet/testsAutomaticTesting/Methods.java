package io.hexlet.testsAutomaticTesting;

import java.util.List;
import io.hexlet.testsAutomaticTesting.implementations.FindRight;
import io.hexlet.testsAutomaticTesting.implementations.FindWrong1;
import io.hexlet.testsAutomaticTesting.implementations.FindWrong2;
import io.hexlet.testsAutomaticTesting.User;



public class Methods {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static List<User> findByName(List<User> users, String name) {
        return switch (implementation) {
            case "wrong1" -> FindWrong1.findByName(users, name);
            case "wrong2" -> FindWrong2.findByName(users, name);
            default -> FindRight.findByName(users, name);
        };
    }
}

