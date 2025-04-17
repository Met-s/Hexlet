package io.hexlet.moduls;

/**
 * Один параметр типа
 * @param <T>
 */
//public class SimplePair<T> implements Pair<T> {
//
//    private T left;
//    private T right;
//
//    public T getLeft() {
//        return left;
//    }
//
//    public T getRight() {
//        return right;
//    }
//
//    public void setLeft(T left) {
//        this.left = left;
//    }
//
//    public void setRight(T right) {
//        this.right = right;
//    }
//}

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Два параметра типа
 */
@AllArgsConstructor
@ToString
public final class SimplePair<L, R> implements Pair<L, R> {

    private L left;
    private R right;
    // Добавляем конструктор по умолчанию
    // чтобы оставить возможность создавать пустую пару
//    public SimplePair() {}
//    public SimplePair(L left, R right) {
//        this.left = left;
//        this.right = right;
//    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

//    public void setLeft(L left) {
//        this.left = left;
//    }
//
//    public void setRight(R right) {
//        this.right = right;
//    }

//    public SimplePair<L, R> copy() {
//        return new SimplePair<L, R>(getLeft(), getRight());
//    }
//
//    public void replaceWith(SimplePair<L, R> pair) {
//        setLeft(pair.getLeft());
//        setRight(pair.getRight());
//    }
}
