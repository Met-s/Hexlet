package io.hexlet.controlTask;


import lombok.*;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *###_____ Испытания Java: Дженерики ____###
 * ###_____ Задание ____###
 * //№_2
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Stack<T> {
    private List<T> items = new ArrayList<>();

    public T push(T value) {

        this.items.add(value);
        return value;
    }

    public T pop() {

        T result ;
        if (!this.items.isEmpty()) {
            result = this.items.remove(this.items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
        return result;
    }

    public T peek() {
        return items.get(this.items.size() - 1);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

}
