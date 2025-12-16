package hexlet.code.pattern;


import lombok.AllArgsConstructor;
/**
 * Структурные паттерны
 * Decorator (Декоратор)
 */
@AllArgsConstructor
public class DeliveryOrder implements Order {

    private Order order;

    @Override
    public int getTotalPrice() {
        return order.getTotalPrice() + 1000;
    }
}
