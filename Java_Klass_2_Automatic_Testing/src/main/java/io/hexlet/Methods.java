//package io.hexlet;
//
//public class Methods {
//}


package io.hexlet;

import io.hexlet.implementations.Validator;
import io.hexlet.implementations.Right;
import io.hexlet.implementations.Wrong1;
import io.hexlet.implementations.Wrong2;
import io.hexlet.implementations.Wrong3;
import io.hexlet.implementations.Wrong4;

public class Methods {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Validator makeValidator() {
        return switch (implementation) {
            case "wrong1" -> new Wrong1();
            case "wrong2" -> new Wrong2();
            case "wrong3" -> new Wrong3();
            case "wrong4" -> new Wrong4();
            default -> new Right();
        };
    }
}
