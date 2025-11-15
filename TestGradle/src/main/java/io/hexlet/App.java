package io.hexlet;


import static io.hexlet.Methods.take;

public class App {
    public static void main(String[] args) {
        assert 1 == 2 : "Ваш метод не работает!";
        System.out.println("Hello World!");

        int[] numbers = {1, 2, 3};
        take(numbers, 1); // [1]
        take(numbers, 2); // [1, 2]
        take(numbers, 9); // [1, 2, 3]

        int[] emptyNumbers = {};
        take(emptyNumbers, 2); // []

    }
}