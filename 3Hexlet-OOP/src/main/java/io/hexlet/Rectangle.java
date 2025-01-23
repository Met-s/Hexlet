package io.hexlet;


public class Rectangle {
//    private int length;  // длина
//    private int width;   // ширина     area
//
//    Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//
//    }
//
//    public int getSquare() throws Exception {
//        try {
//            isCheckValue(length);
//            isCheckValue(width);
//            return length * width;
//        } catch (Exception e) {
//            throw new Exception("Side cannot have a negative value");
//        }
//    }
//
//// ###_____ У Учителя этого метода нет ____###
//    public static void isCheckValue(int value) throws Exception {
//        if (value < 0) {
//            throw new Exception("Failed to calculate area Check");
//        }
//    }


//  ###_____ Решение Учитуеля ____###
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getSquare() throws Exception {
        if (width < 0 || length < 0) {
            throw new Exception("Failed to calculate area"); // создаём исключение

        }

        return width * length;
    }
}
