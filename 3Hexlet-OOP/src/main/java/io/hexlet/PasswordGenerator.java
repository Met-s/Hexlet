package io.hexlet;

// интерфейс PasswordGenerator
// Задает требование к классу генератору паролей,
// какие методы требуются от класса

interface PasswordGenerator {
    String generate();
    String generate(int length);
}
