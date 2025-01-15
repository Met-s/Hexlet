package io.hexlet;

public class App {
    //№_1
//    public static double getSquare(int ab, int ac, int a) {
//        /**
//         * принимает в качестве аргументов две стороны треугольника и угол
//         * между ними в градусах (целые числа), а возвращает площадь этого
//         * треугольника в виде числа типа double
//         */
//        var aRad = a * 3.14 / 180;
//        var sinA = Math.sin(aRad);
//        //        result = Math.rint(result);
//        return (ab * ac * sinA) / 2;
//    }

    //№_2
//    public static Point getNewPoint() {
//        var point = new Point(5, 10);
//        return point;
//    }

    //№_3
    public static double getCircumference(Circle circle) {
        /**
         * Длинна окружности
         * радиус приходит из класса Circle.java
         */
        double result = circle.radius * 2 * Math.PI;
        return result;
    }
}
