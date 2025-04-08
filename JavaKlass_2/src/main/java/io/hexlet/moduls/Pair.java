package io.hexlet.moduls;


/**
 * Один параметр типа
 * @param <T>
 */
//public interface Pair<T> {
//
//    public T getLeft();
//    public T getRight();
//
//    public void setLeft(T left);
//    public void setRight(T right);
//}
/**
 * Два параметра типа
 */
public interface Pair<L, R> {

    public L getLeft();
    public R getRight();

    public void setLeft(L left);
    public void setRight(R right);
}
