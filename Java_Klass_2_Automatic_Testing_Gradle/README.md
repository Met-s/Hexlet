

//=================================================================================
###_____ Java: Автоматическое тестирование ###
//=================================================================================
###_____ JUnit ____###
Аннотация @Test "показывает" фреймворк, что этот метод является тестом, а класс Assertions является основным для большинства тестовых методов.

Этого достаточно, чтобы создать простейший Gradle-проект с JUnit5 в качестве тестового фреймворка. Создайте подобный проект на своём компьютере и наберите ./gradlew test в терминале для запуска тестов. JUnit5 сам найдёт все методы помеченные аннотацией @Test и, если хотя бы в одном из них тесты не пройдут, то выполнение завершится с ошибкой.

###_____ chmod +x gradlew ____###

Как отмечено в комментариях, просто работает
```
./gradlew
```
У меня сработало. Добавил 
```
./
```
Указывает на поиск в текущем каталоге, так 
как он не указан в пути.
Если это по-прежнему не работает, запустите
```
chmod +x gradlew
```
А затем повторите попытку
Windows PowerShell
```
.\gradlew
```
###_____ Задание ____###\
//№_45\
src/test/java/io/hexlet/MethodsTest.java\
Напишите тесты для метода without(), который принимает в качестве первого аргумента массив чисел и возвращает его копию, из которой исключены значения, переданные вторым и последующими аргументами. Если массив содержит повторяющиеся элементы с искомым значением, они все исключаются из массива (изучите примеры). Метод without() уже импортирован в файл с тестами.

Метод without() принимает на вход:

Первый аргумент — массив целых чисел int[]
Второй и последующие аргументы — любое количество целых чисел, которые нужно исключить из массива
Идея метода взята из библиотеки lodash на JavaScript — _.without()
```
int[] numbers = {1, 2, 3, 4, 5};
// Исключаем из исходного массива числа 2 и 3
without(numbers, 2, 3); // [1, 4, 5]

int[] emptyNumbers = {};
without(emptyNumbers, 3, 4, 5); // []

int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
without(withDuplicateNumbers, 2); // [1, 5]
```
Подсказки
Для сравнения массивов используйте [assertArrayEquals()](https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html#assertArrayEquals-int:A-int:A-)

###_____ Решение ____###
```
package io.hexlet.modul;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static io.hexlet.modul.Methods_45.without;

public class Methods_45Test {
int[] expected = {1, 2, 3, 4, 5};
@Test
public void excludeNumbers() {
int[] numbers = {1, 2, 3, 4, 5};
int[] expected = {1, 4, 5};
int[] actual = without(numbers, 2, 3); // [1, 4, 5]
assertArrayEquals(expected, actual);
}

    @Test
    public void excludeDuplicates() {
        int[] numbers = {1, 2, 2, 2, 3};
        int[] expected = {1, 3};
        int[] actual = without(numbers, 2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyArray() {
        int[] numbers = {};
        int[] expected = {};
        int[] actual = without(numbers, 2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void missingNumber() {
        int[] numbers = {1, 2, 3};
        int[] expected = {1, 2, 3};
        int[] actual = without(numbers, 5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void missingNumber2() {
        int[] numbers = {1, 1, 2, 2, 2};
        int[] expected = {};
        int[] actual = without(numbers, 1, 2);
        assertArrayEquals(expected, actual);
    }
```
###_____ Решение Учителя ____###
```
@Test
public void testWithout() {
int[] numbers1 = {1, 2, 3, 4, 5};
var actual1 = without(numbers1, 2, 3);
int[] expected1 = {1, 4, 5};
assertArrayEquals(expected1, actual1);

        int[] numbers2 = {1, 2, 2, 3, 4, 5};
        var actual2 = without(numbers2, 2, 3);
        int[] expected2 = {1, 4, 5};
        assertArrayEquals(expected2, actual2);

        int[] numbers3 = {1, 2, 3};
        var actual3 = without(numbers3, 1, 3);
        int[] expected3 = {2};
        assertArrayEquals(expected3, actual3);

        int[] numbers4 = {};
        var actual4 = without(numbers4, 2);
        int[] expected4 = {};
        assertArrayEquals(expected4, actual4);
    }
```









//=================================================================================
###_____ Java:  ____###
//=================================================================================
###_____ Задание ____###
//№_

###_____ Решение ____###

###_____ Решение Учителя ____###

###_____ Страница модуля ____###
==============================================================================
