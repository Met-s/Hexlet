package io.hexlet;

public class Quadrate implements Geometric {
    /**
     * Класс Quadrate который представляет собой квадрат.
     * Класс реализовывает интерфейс Geometric.
     * Конструктор класса принимает в качестве аргумента сторону квадрата
     * (целое число типа int).
     * В нём определены методы getName() и getSquare().
     * Метод getName() возвращает название фигуры – строку "quadrate",
     * а метод getSquare() – площадь квадрата.
     */
    private int x;

    Quadrate(int x) {
        this.x = x;
    }

    public String getName() {
        return "quadrate";
    }

    public double getSquare() {
        return x * x;
    }
}
