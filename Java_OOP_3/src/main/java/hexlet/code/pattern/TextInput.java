package hexlet.code.pattern;

import lombok.AllArgsConstructor;

/**
 * Структурные паттерны
 * Composite (Компоновщик)
 */
@AllArgsConstructor
public class TextInput implements Component {
    public void draw() {
        System.out.println("draw text input");
    }
}
