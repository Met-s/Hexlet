package io.hexlet;

import org.apache.commons.lang3.RandomStringUtils;
//№_9
// Этот класс - еще одна реализация интерфейса PasswordGenerator
// Он содержит те же самые методы с такой же сигнатурой, но с другой реализацией
// Методы этого класса генериреут более сложный буквенно-цифроовй пароль

public class SuperPasswordGenerator implements PasswordGenerator {
    public String generate() {
        return this.generate(16);
    };

    public String generate(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    };
}
