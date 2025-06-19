package io.hexlet;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Stack;
import static org.assertj.core.api.Assertions.catchThrowable;
import java.util.EmptyStackException;


class StackTest {
    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    public void testStackIsEmpty() {
        Stack<Integer> stack = new Stack<>();
        assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();
        stack.pop();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void testEmptyPop() {
        Stack<Integer> stack = new Stack<>();
        // Помещаем пробрасываемое исключение в переменную
        var thrown = catchThrowable(    // этот метод призван "ловить" исключения
                () -> stack.pop()   // провоцируем исключительную ситуацию
        );
        // А теперь проверяем что мы поймали нужное исключение
        assertThat(thrown).isInstanceOf(EmptyStackException.class);
    }
}
