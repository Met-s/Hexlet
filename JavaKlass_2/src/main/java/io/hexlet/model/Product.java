package io.hexlet.model;
// №_10
public final class Product {

    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
