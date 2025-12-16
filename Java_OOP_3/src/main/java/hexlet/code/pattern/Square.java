package hexlet.code.pattern;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

/**
 * Порождающие паттерны
 * Prototype (Прототип)
 */

@AllArgsConstructor
public class Square implements Shape {
    private final int a;

    @Override
    public double getArea() {
        return a * a;
    }

    @SneakyThrows
    @Override
    public Shape clone() {
        return new Square(a);
    }
}
