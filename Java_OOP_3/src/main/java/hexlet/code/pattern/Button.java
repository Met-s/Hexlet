package hexlet.code.pattern;

import lombok.AllArgsConstructor;

/**
 * Структурные паттерны
 * Composite (Компоновщик)
 */
@AllArgsConstructor
public class Button implements Component {
    public void draw() {
        System.out.println("draw button");
    }
}
