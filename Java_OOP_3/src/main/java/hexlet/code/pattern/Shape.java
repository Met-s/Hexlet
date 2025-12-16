package hexlet.code.pattern;
/**
 * Порождающие паттерны
 * Prototype (Прототип)
 */
public interface Shape extends Cloneable<Shape> {
    double getArea();
    Shape clone();
}
