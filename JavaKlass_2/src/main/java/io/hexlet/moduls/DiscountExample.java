package io.hexlet.moduls;

import java.util.HashMap;

/**
 * Метод computeIfPresent() отличается от compute() тем, что лямбда вызывается
 * только в том случае, если ключ уже был добавлен в коллекцию. Ниже пример
 * кода, который применяет скидку к товарам, находящимся внутри коллекции,
 * без ручной проверки того, есть ли они там на самом деле:
 */


public class DiscountExample {
    public static void main(String[] args) {
        var prices = new HashMap<String, Double>();
        prices.put("T-shirt", 20.0);
        prices.put("Jeans", 40.0);

        prices.computeIfPresent("Jeans", (key, value) -> value * 0.9);
        prices.computeIfPresent("Socks", (key, value) -> value * 0.9);

        System.out.println(prices);
    }
}
