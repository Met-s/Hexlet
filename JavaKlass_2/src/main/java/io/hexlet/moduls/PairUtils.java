package io.hexlet.moduls;

public class PairUtils {
    public static <L, R> SimplePair<L, R> getPair(L left, R right) {
        var pair = new SimplePair<L, R>();
        pair.setLeft(left);
        pair.setRight(right);
        return pair;
    }
}
