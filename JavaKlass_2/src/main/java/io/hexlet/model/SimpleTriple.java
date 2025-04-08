package io.hexlet.model;

public class SimpleTriple<L, M, R> implements Triple<L, M, R> {
    private L left;
    private M middle;
    private R right;

    public SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public M getMiddle() {
        return middle;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setMiddle(M middle) {
        this.middle = middle;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public SimpleTriple<R, M, L> reverse() {
        var result = new SimpleTriple<>(getRight(), getMiddle(),
                getLeft());

        return result;
    }

    public boolean isEqualTo(SimpleTriple<Integer, String, Boolean> trip) {

        return this.getLeft().equals(trip.getLeft()) && this.getMiddle()
                .equals(trip.getMiddle()) && this.getRight().equals(trip.getRight());
    }


}
