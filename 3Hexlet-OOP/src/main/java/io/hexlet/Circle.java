package io.hexlet;
//№_3
//public class Circle {

//    public int x;
//    public int y;
//    public int radius;
//
//    Circle(int x, int y, int radius) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }
//}
//№_10
public class Circle implements Geometric {
    /**
     * Класс  Circle который представляет собой круг.
     * Класс реализовывает интерфейс Geometric.
     * Конструктор класса принимает в качестве аргумента радиус круга
     * (целое число типа int).
     * В нём определены методы getName() и getSquare().
     * Метод getName() возвращает название фигуры – строку "circle",
     * а метод getSquare() – площадь круга.
     */
    private int radius;
    Circle(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return "circle";
    }

    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }



}
