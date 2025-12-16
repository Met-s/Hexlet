package hexlet.code.pattern;


import lombok.AllArgsConstructor;

import java.util.List;
/**
 * Структурные паттерны
 * Decorator (Декоратор)
 */
@AllArgsConstructor
public class BaseOrder implements Order {

    public List<Integer> prices;

    @Override
    public int getTotalPrice() {
        return prices.stream().mapToInt(x -> x).sum();
    }
}
