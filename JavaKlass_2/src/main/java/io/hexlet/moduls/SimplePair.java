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
/**
 * Два параметра типа
 */
public class SimplePair<L, R> {

    private L left;
    private R right;
    // Добавляем конструктор по умолчанию
    // чтобы оставить возможность создавать пустую пару
    public SimplePair() {}
    public SimplePair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setRight(R right) {
        this.right = right;
    }
}
