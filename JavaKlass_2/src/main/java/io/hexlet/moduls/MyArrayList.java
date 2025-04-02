package io.hexlet.moduls;

public class MyArrayList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void add(T value) {
        data[size++] = value;
    }

    public T get(int index) {
        // Приведение типа к T
        return (T) data[index];
    }
    // Остальные методы
}
