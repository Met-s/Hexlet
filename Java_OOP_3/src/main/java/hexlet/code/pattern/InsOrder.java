package hexlet.code.pattern;

import lombok.AllArgsConstructor;

/**
 * Структурные паттерны
 * Decorator (Декоратор)
 */
@AllArgsConstructor
public class InsOrder implements Order {

    private Order order;

    @Override
    public int getTotalPrice() {
        return order.getTotalPrice() + 200;
    }
}
