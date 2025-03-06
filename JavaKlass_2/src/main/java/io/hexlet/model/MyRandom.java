package io.hexlet.model;

// №_7
public class MyRandom {
    public static int minValue = 1;
    public static int maxValue = 100;

    public static int generate() {
        return minValue + (int)(Math.random() * (maxValue - minValue) + 1);
    }
}
