

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
№_45\
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
==============================================================================\
###_____ Подготовка данных ____###

###_____ Дополнительные материалы ____###
1. Аннотации [Junit](https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations)

###_____ Задание ____###\
№_46\
Напишите тесты для метода add(). Метод добавляет в список, переданный первым аргументом, элемент по указанному индексу. Если в списке уже есть элемент по такому индексу, то он и все следующие элементы сдвигаются вправо. Если индекс не передан, элемент добавляется в конец списка. В случае успешного изменения коллекции метод возвращает true. Метод меняет переданный список

Метод принимает три параметра:

Первый – список List, в который нужно добавить элемент
Второй – добавляемый элемент
Третий (необязательный) - индекс, по которому будет вставлен элемент. Если индекс не передан, элемент будет добавлен в конец списка.
В случае, если индекс элемента выходит за пределы длины массива
```
(index < 0 || index > size())
```
, метод выбрасывает исключение IndexOutOfBoundsException
```
List<Integer> coll = Arrays.asList(1, 2, 3, 4);

// Все вызовы нужно рассматривать, как независимые
add(coll, 5); // true
System.out.println(coll); // => [1, 2 ,3, 4, 5]

add(coll, 5, 1); // true
System.out.println(coll); // => [1, 5, 2 ,3, 4]

add(coll, 5, 4); // true
System.out.println(coll); // => [1, 2 ,3, 4, 5]
```
###_____ Подсказки ____###\
В этом упражнении нужно будет проверить не только возвращаемое значение, но и то, что метод нужным образом меняет исходный список
Информация по исключению дается для более полного понимания работы метода, проверять это поведение в упражнении не нужно.

###_____ Решение ____###
```
package io.hexlet.modul;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static io.hexlet.modul.Methods_46.add;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods_46Test {
List<Integer> coll = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void test1() {
        assertTrue(add(coll, 5));
    }

    @Test
    public void test2() {
        assertTrue(add(coll, 5, 2));
    }

    @Test
    public void test3() {
        add(coll, 5);
        assertEquals(5, coll.getLast());
    }

    @Test
    public void test4() {
        add(coll, 5, 2);
        assertEquals(5, coll.get(2));
    }

    @Test
    public void test5() {
        add(coll, 5, 4);
        assertEquals(5, coll.getLast());
    }
}
```
###_____ Решение Учителя ____###
```
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static io.hexlet.Methods.add;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class MethodsTest {

    // BEGIN
    private List<Integer> coll = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void testWithoutIndex() {
        var actual = add(coll, 10);
        var expected = List.of(1, 2, 3, 4, 10);
        assertTrue(actual);
        assertEquals(expected, coll);
    }

    @Test
    public void testIndexNotExists() {
        var actual = add(coll, 10, 4);
        var expected = List.of(1, 2, 3, 4, 10);
        assertTrue(actual);
        assertEquals(expected, coll);
    }

    @Test
    public void testIndexExists() {
        var actual = add(coll, 10, 0);
        var expected = List.of(10, 1, 2, 3, 4);
        assertTrue(actual);
        assertEquals(expected, coll);
    }
    // END
}
```









//============================================================================

###_____ Java:  ____###

//============================================================================

###_____ Задание ____###

№_

###_____ Решение ____###

###_____ Решение Учителя ____###

###_____ Страница модуля ____###
==============================================================================
