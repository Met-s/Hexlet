package io.hexlet.moduls;

import java.util.Map;
import java.util.HashMap;
//№_15
public class Data {
    public static Map<String, Double> getProducts() {
        var products = new HashMap<String, Double>();

        products.put("Coffee", 30.0);// 22.0
        products.put("Bread", 10.0);
        products.put("Milk", 20.0);

        products.put("Lychee", 31.0);
        products.put("Salmon", 27.0);
        products.put("Salt", 5.0);
        products.put("Shrimp", 45.0);
        products.put("Strawberries", 15.0);
        products.put("Water", 7.0);
        products.put("Tomatoes", 46.0);
        products.put("Chicken", 50.0);


        return products;
    }
}
