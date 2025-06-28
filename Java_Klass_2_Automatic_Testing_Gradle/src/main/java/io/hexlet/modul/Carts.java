package io.hexlet.modul;

import io.hexlet.modul.implemeentations_47.Cart;
import io.hexlet.modul.implemeentations_47.CartRight;
import io.hexlet.modul.implemeentations_47.CartWrong1;
import io.hexlet.modul.implemeentations_47.CartWrong2;
import io.hexlet.modul.implemeentations_47.CartWrong3;


public class Carts {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Cart makeCart() {
        return switch (implementation) {
            case "wrong1" -> new CartWrong1();
            case "wrong2" -> new CartWrong2();
            case "wrong3" -> new CartWrong3();
            default -> new CartRight();
        };
    }
}

