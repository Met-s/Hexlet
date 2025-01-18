package io.hexlet;

import java.util.Arrays;



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
//    public static double getCircumference(Circle circle) {
//        /**
//         * Длинна окружности
//         * радиус приходит из класса Circle.java
//         */
//        double result = circle.radius * 2 * Math.PI;
//        return result;
//    }

    //№_4
//    public static String checkSecurity(Url url) {
//        var protocol = url.getProtocol();
//        var securePart = protocol.equals("https") ? "" : "not ";
//
//        return "Connection to "
//                + url.getHost()
//                + " is "
//                + securePart
//                + "secure";
//    }

//        if (url.getProtocol().equals("https")) {
//            return ("Connection to " + url.getHost() + " is secure");
//        } else {
//            return ("Connection to " + url.getHost() + " is not secure");
//        }
//№_7
//    public static boolean hasDuplicates(String[] strings) {
//        /**
//         * Принимает массив строк,проверяет содержатся ли в массиве дубликаты.
//         * Если содержатся, возвращает true, иначе false
//         */
//        boolean result = false;
//        for (int i = 0; i < strings.length; i++) {
//            if (result == true) {
//                break;
//            }
//            for (int j = i + 1; j < strings.length; j++) {
//                if (strings[i].equals(strings[j])) {
//                    result = true;
//                    break;
//                }
//            }
//        }
//        return result ;
//
//    }
// ###_____ Решение Учителя ____###
//    public static boolean hasDuplicates(String[] words) {
//        var copy = Arrays.copyOf(words, words.length);
//        Arrays.sort(copy);
//
//        for (var i = 0; i < copy.length - 1; i++) {
//            var currentWord = copy[i];
//            var nextWord = copy[i + 1];
//
//            if (currentWord.equals(nextWord)) {
//                return true;
//            }
//        }
//        return false;
//    }
//№_8
//    public static Double calculateAverage(Integer[] numbers) {
//        /**
//         * Принимает массив целых чисел. Метод возвращает среднее арифметическое
//         * значение всех чисел в массиве, число типа Double.
//         * На вход метода может прийти пустой массив, или массив, содержащий
//         * значения null. В этом случае вычислить среднее значение невозможно
//         * метод должен вернуть null
//         */
//        Double result = null;
//
//        if (numbers.length == 0) {
//            return result;
//        }
//
//        int sum = 0;
//        for (Integer number : numbers) {
//            if (number != null) {
//                sum += number;
//            } else {
//                return result;
//            }
//        }
//        result = (double) sum / numbers.length;
//        System.out.println("result :" + result);
//        return result;
//    }
// ###_____ Решение Учителя ____###
//    public static Double calculateAverage(Integer[] numbers) {
//
//        var length = numbers.length;
//
//        if (length == 0) {
//            return null;
//        }
//
//        var sum = 0.0;
//
//        for (var num : numbers) {
//
//            if (num == null) {
//                return null;
//            }
//
//            sum += num;
//        }
//
//        return sum / length;
//    }
//№_10
    public static String getFigureSquare(Geometric figure) {
        /**
         * Принимает в качестве аргумента геометрическую фигуру типа
         * Geometric.
         * возвращать площадь фигуры в виде строки формата
         * "Square of quadrate is 36.0"
         */
        var nameFigure = figure.getName();
        var squareFigure = figure.getSquare();
        System.out.println("Square of " + nameFigure + " is " + squareFigure);
        return "Square of " + nameFigure + " is " + squareFigure;
    }











//№_11
//№_12
//№_13
//№_14
//№_15
//№_

}
// ###_____ Решение Учителя ____###
