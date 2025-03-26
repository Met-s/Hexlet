package io.hexlet.moduls;

import java.util.Map;
import java.util.HashMap;

/**
 * Метод computeIfAbsent() отличается от compute(), тем, что лямбда вызывается
 * только в том случае, если ключа в коллекции до этого не было. С его помощью,
 * например, реализуется кеш, специальное хранилище, которое хранит данные,
 * полученные в результате выполнения тяжелой операции. Это позволяет экономить
 * ресурсы на повторных запросах, которые проходят уже без вычисления.
 */

public class CacheExample {
    private static Map<String, Integer> cache = new HashMap<>();
    public static int computeExpensiveOperation(String key) {
        // Симулируем тяжелую операцию
        return key.length();
    }

    public static int getValue(String key) {
        return cache.computeIfAbsent(key,
                (k) -> CacheExample.computeExpensiveOperation(k));
    }

    public static void main(String[] args) {
        System.out.println(getValue("hello"));
        System.out.println(getValue("java"));
        System.out.println(getValue("hello"));
    }

}
