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

    public L getLeeft();
    public R getRight();

    public void setLeeft(L leeft);
    public void setRight(R right);
}
