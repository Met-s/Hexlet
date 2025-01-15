package io.hexlet;

public class App {
    //№_1
    public static double getSquare(int ab, int ac, int a) {
        /**
         * принимает в качестве аргументов две стороны треугольника и угол
         * между ними в градусах (целые числа), а возвращает площадь этого
         * треугольника в виде числа типа double
         */
        var aRad = a * 3.14 / 180;
        var sinA = Math.sin(aRad);
        //        result = Math.rint(result);
        return (ab * ac * sinA) / 2;
    }
}
