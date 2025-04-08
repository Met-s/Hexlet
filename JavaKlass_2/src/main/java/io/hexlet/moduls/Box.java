package io.hexlet.moduls;

public class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Box<T> copyBox() {
        return new Box<>(getValue());
    }

}
