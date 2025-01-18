package io.hexlet;

//public class UserController {
//    public static void replaceName(User user, String newFirstName) {
//    user.firstName = newFirstName;
//}
//}
//№_9
// Это код, который использует генератор паролей passwordGenerator
// Класс создает гипотетического пользователя
class UserController {
    // Интерфейс - это тип данных, поэтому мы указываем его в опрделенении
    // метода
    // Сюда мы можем передать любой генератор паролей,
    // Который реализует интерфейс PasswordGenerator
    public String create(PasswordGenerator generator) {
        // Создаем пользователя
        // И где-то тут же генерируем ему пароль
        var password = generator.generate(10);
        return password;
    }
}