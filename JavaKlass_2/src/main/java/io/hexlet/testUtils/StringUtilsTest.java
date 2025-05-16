package io.hexlet.testUtils;

public class StringUtilsTest {
    public static void testCapitalize() {
//         Если результат метода не равен ожидаемому значению
        if (!"Hello".equals(StringUtils.capitalizeNew("hello"))) {
            // Выбрасываем исключение и завершаем выполнение теста
            throw new AssertionError("Метод работает неверно!");
        }
        if (!"".equals(StringUtils.capitalizeNew(""))) {
            throw new AssertionError("Пустая строка!");
        }
        System.out.println("Все тесты пройдены!");
    }
//    public static void testCapitalizeZero() {
//
//        if (!"".equals(StringUtils.capitalizeNew(""))) {
//            throw new AssertionError("Метод не работает!");
//        }
//    }
}
