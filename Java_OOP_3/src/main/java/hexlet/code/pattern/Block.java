package hexlet.code.pattern;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Структурные паттерны
 * Composite (Компоновщик)
 */
@AllArgsConstructor
public class Block implements Component {
    List<Component> childComponents;

    public void draw() {
        System.out.println("drawBlocd");
        childComponents.forEach(Component::draw);
    }
}
