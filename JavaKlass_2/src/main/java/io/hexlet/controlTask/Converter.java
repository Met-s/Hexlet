package io.hexlet.controlTask;

public interface Converter<T, U> {
    U convert(T value);
}
