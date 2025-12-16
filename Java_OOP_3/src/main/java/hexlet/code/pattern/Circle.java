package hexlet.code.pattern;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;


/**
 * Порождающие паттерны
 * Prototype (Прототип)
 */
@AllArgsConstructor
public class Circle implements Shape {
    private final int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @SneakyThrows
    @Override
    public Shape clone() {
        // Снаружи радиус не доступен
        // Поэтому сделать такой вызов снаружи не получится, не прибегая к рефлексии
        return new Circle(this.radius);
    }
}
