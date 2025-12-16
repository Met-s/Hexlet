package hexlet.code.pattern;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Структурные паттерны
 * Composite (Компоновщик)
 */
@AllArgsConstructor
public class Window implements Component {
    List<Component> childComponents;

    public void draw() {
        System.out.println("drewWindow");
        childComponents.forEach(Component::draw);
    }
}


