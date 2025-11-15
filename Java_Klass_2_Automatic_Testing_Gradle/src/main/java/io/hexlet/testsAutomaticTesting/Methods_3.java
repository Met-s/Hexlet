package io.hexlet.testsAutomaticTesting;

import io.hexlet.testsAutomaticTesting.implementations_3.Right;
import io.hexlet.testsAutomaticTesting.implementations_3.Wrong1;
import io.hexlet.testsAutomaticTesting.implementations_3.Wrong2;
import io.hexlet.testsAutomaticTesting.implementations_3.Wrong3;
import io.hexlet.testsAutomaticTesting.implementations_3.Wrong4;


public class Methods_3 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static String generatePassword(
            int length, boolean includeUpcase, boolean includeDigits, boolean includeSpecial) {
        return switch (implementation) {
            case "wrong1" -> Wrong1.generatePassword(length, includeUpcase, includeDigits, includeSpecial);
            case "wrong2" -> Wrong2.generatePassword(length, includeUpcase, includeDigits, includeSpecial);
            case "wrong3" -> Wrong3.generatePassword(length, includeUpcase, includeDigits, includeSpecial);
            case "wrong4" -> Wrong4.generatePassword(length, includeUpcase, includeDigits, includeSpecial);
            default -> Right.generatePassword(length, includeUpcase, includeDigits, includeSpecial);
        };
    }

    public static String generatePassword() {
        return switch (implementation) {
            case "wrong1" -> Wrong1.generatePassword();
            case "wrong2" -> Wrong2.generatePassword();
            case "wrong3" -> Wrong3.generatePassword();
            case "wrong4" -> Wrong4.generatePassword();
            default -> Right.generatePassword();
        };
    }
}

