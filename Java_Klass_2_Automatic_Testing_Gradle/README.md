

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

###_____ Плохие и хорошие практики тестирования ____###

###_____ Задание ____###\
№_47\
Напишите тесты для корзины интернет-магазина. Работать с корзиной мы можем при помощи следующих методов:

1. Статический метод makeCart() – создаёт новую пустую корзину (объект)
2. Метод addItem(good, count) – добавляет в корзину товары и их количество. Товар – это объект класса Good с двумя свойствами: name (имя) и price (стоимость). Количество — целое положительное число
3. Метод getItems() – возвращает список List<Map> товаров в формате [{good=товар, count=количество}, {good=товар, count=количество}, ...]. Каждый элемент списка – это словарь Map, содержащий товар и его количество {good, count}
4. Метод getCost() – возвращает стоимость корзины. Стоимость корзины высчитывается как сумма стоимости всех добавленных товаров с учётом их количества.
5. Метод getCount() – возвращает общее количество товаров в корзине.
```
// Создаём новый объект корзины
var cart = makeCart();

// Создаём новые товары
var car = new Good("car", 3);
var house = new Good("house", 10);

// Добавляем их в корзину
cart.addItem(car, 5);
cart.addItem(house, 2);

cart.getItems().size(); // 2
cart.getCost(); // 35
cart.getCount(); // 7
```
###_____ Файл ____###
```
public final class Good {
private String name;
private int price;

    Good(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
```
###_____ Решение ____###
```
import org.junit.jupiter.api.Test;

import static io.hexlet.modul.Carts.makeCart;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CartTest_47 {

    @Test
    public void addItemCartTest() {
        var cart = makeCart();

        var car = new Good_47("car", 3);
        var car2 = new Good_47("car2", 10);
        cart.addItem(car, 2);
        cart.addItem(car2, 1);

        assertEquals(2, cart.getItems().size());
        assertEquals(3, cart.getCount());
        assertEquals(16, cart.getCost());
    }
}
```
###_____ Решение Учителя ____###
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.Carts.makeCart;

class CartTest {

    // BEGIN
    @Test
    public void testCart() {

        var cart = makeCart();

        assertEquals(0, cart.getItems().size());

        var car = new Good("car", 3);
        cart.addItem(car, 5);

        assertEquals(15, cart.getCost());
        assertEquals(5, cart.getCount());

        var house = new Good("house", 10);
        cart.addItem(house, 2);
        assertEquals(35, cart.getCost());
        assertEquals(7, cart.getCount());
    }
    // END
}
```
//===========================================================================

###_____ Покрытие кода тестами ____###

###_____ Дополнительные материалы ____###

1. Тестирование Java-кода с [JUnit](https://ru.hexlet.io/blog/posts/testirovanie-java-koda-s-junit-osnovnye-vozmozhnosti-i-primery)

###_____ Задание ____###\
//№_48\
В нашем проекте имеется метод indexOf() для работы со списками. Программист, работавший на этом проекте до вас, недостаточно ответственно отнесся к написанию тестов. Вам нужно исправить этот недочет и дописать недостающие тесты.

Чтобы понять, каких тестов не хватает, сгенерируйте отчёт по покрытию кода тестами. Для этого выполните в терминале команду make test-coverage. Чтобы увидеть подробный отчёт, нажмите кнопку "Web-доступ" в упражнении. Изучите статистику, посмотрите, какие строки кода в методе indexOf() не покрыты тестами и допишите тесты на эти случаи.

src/test/java/io/hexlet/MethodsTest.java
Допишите необходимые тесты для метода indexOf(), ориентируясь на отчёт о покрытии тестами. Метод возвращает первый индекс, по которому переданное значение может быть найдено в списке, или -1, если такого значения нет.

Метод принимает три аргумента:

Список List, в котором ведется поиск
Значение, поиск которого ведется в списке
Индекс, с которого начинается поиск элемента. Если значение отрицательное, то оно используется, как смещение с конца списка. Это не обязательный аргумент, если он не передан при вызове, поиск начинается с начала списка.
```
var coll = List.of(1, 2, 3, 2, 5);

indexOf(coll, 2, 2); // 3
indexOf(coll, 2); // 1
indexOf(coll, 2, -3); // 3
indexOf(coll, 7); // -1
```
###_____ Решение ____###
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.Methods.indexOf;
import java.util.List;

class MethodsTest {

    @Test
    public void testIndexOf() {
        var coll = List.of(1, 2, 3, 2, 4);
        var actual = indexOf(coll, 2, 2);
        assertEquals(3, actual);

        // BEGIN (write your solution here)
        assertEquals(-1, indexOf(List.of(), 2));
        assertEquals(-1, indexOf(List.of(), 2, 2));
        assertEquals(-1, indexOf(List.of(), 2, -1));

        assertEquals(1, indexOf(coll, 2));
        assertEquals(1, indexOf(coll,2, -9));
        assertEquals(3, indexOf(coll, 2, -2));
        
        assertEquals(-1, indexOf(coll, 2, -1));
        assertEquals(-1, indexOf(coll, 2, 5));
        assertEquals(-1, indexOf(coll, 5, 2));
        // END
    }
}
```
###_____ Решение Учителя ____###
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.Methods.indexOf;
import java.util.List;

class MethodsTest {

    @Test
    public void testIndexOf() {
        var coll = List.of(1, 2, 3, 2, 4);
        var actual = indexOf(coll, 2, 2);
        assertEquals(3, actual);

        // BEGIN
        var coll1 = List.of();
        var actual1 = indexOf(coll1, 0, 1);
        assertEquals(-1, actual1);

        var coll2 = List.of(1, 2, 3, 2, 4);
        var actual2 = indexOf(coll2, 2, -3);
        assertEquals(3, actual2);

        var coll3 = List.of(1, 2, 2);
        var actual3 = indexOf(coll3, 2, -10);
        assertEquals(1, actual3);

        var coll4 = List.of(1, 2, 3, 2, 4);
        var actual4 = indexOf(coll4, 2);
        assertEquals(1, actual4);

        var coll5 = List.of(5, 1, 2, 3);
        var actual5 = indexOf(coll5, 5, 2);
        assertEquals(-1, actual5);
        // END
    }
}
```
//===========================================================================

###_____ Разработка через тестирование ____###

###_____ Задание ____###\
//№_49\
В этом упражнении вам предстоит попрактиковаться в подходе "Разработка через тестирование". Вам нужно будет написать и тесты и реализацию функции. Сначала напишите тесты и запуcтите тестирование. Тесты должны упасть. Затем напишите решение, которое будет проходить тесты.

src/test/java/io/hexlet/MethodsTest.java
Напишите тесты, проверяющие работу статического метода fill(List coll, E element, int begin, int end). Метод заполняет элементы списка переданным значением, начиная со старта и заканчивая (но не включая) конечной позицией. Метод меняет исходный список!

Метод принимает следующие параметры:

coll – список List, элементы которого будут заполнены element – значение, которым будут заполнены элементы списка begin – стартовая позиция. Не обязательный параметр. Если стартовая позиция не передана, заполнение будет происходить с начала списка. end– конечная позиция. Не обязательный параметр. Если конечная позиция не передана, заполнение будет происходить до конца списка.

Метод работает только с неотрицательными индексами
```
var coll = Arrays.asList("a", "b", "c", "d");

// Все вызовы нужно рассматривать, как независимые
fill(coll, "*", 1, 3);
System.out.println(coll); // => ["a", "*", "*", "d"]

fill(coll, "*");
System.out.println(coll); // => ["*", "*", "*", "*"]

fill(coll, "*", 4, 6);
System.out.println(coll); // => ["a", "b", "c", "d"]

fill(coll, "*", 0, 10);
System.out.println(coll); // => ["*", "*", "*", "*"]
```
src/main/java/io/hexlet/Fill.java\
Реализуйте публичный статический метод fill(List coll, E element, int begin, int end), опираясь на описание и пример его работы

Подсказки\
Чтобы реализовать значения параметров по умолчанию, используйте перегрузку методов

###_____ Решение ____###
```
package io.hexlet.module;

import java.util.List;


public class Methods_49 {
public static <T> void fill(List<T> coll, T element, int begin, int end) {

        int collSize = coll.size();


        if ((begin > collSize) || (begin < 0)) {
            begin = collSize;
        }

        if (end > collSize) {
            end = collSize;
        }

        for (int i = begin; i < end; i++) {
            coll.set(i, element);
        }
    }

    public static <T> void fill(List<T> coll, T element, int begin) {

        int end = coll.size();
        if ((begin < 0) || (begin > end)) {
            begin = end;
        }
        fill(coll, element, begin, end);
    }

    public static <T> void fill(List<T> coll, T element) {

        int begin = 0;
        int end = coll.size();
        fill(coll, element, begin, end);
    }
```    
Method_49Test
```
package io.hexlet.modul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.module.Methods_49.fill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Method_49Test {

    List<String> coll = new ArrayList<>();

    @BeforeEach
    public void bforeEach() {
        coll.addAll(Arrays.asList("a", "b", "c", "d"));
    }


    @Test
    public void test() {

        fill(coll, "*", 1, 3);
        var expected = Arrays.asList("a", "*", "*", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test2() {

        fill(coll, "*", 2);
        var expected = Arrays.asList("a", "b", "*", "*");
        assertEquals(expected, coll);
    }

    @Test
    public void test3() {

        fill(coll, "*");
        var expected = Arrays.asList("*", "*", "*", "*");
        assertEquals(expected, coll);
    }
    //    =================================================

    @Test
    public void test4() {

        var expected = Arrays.asList("*", "*", "*", "*");
        fill(coll, "*", 0, 10);
        assertEquals(expected, coll);
    }

    @Test
    public void test9() {
        var expected = Arrays.asList("a", "b", "c", "d");
        fill(coll, "*", 10, 2);
        assertEquals(expected, coll);
    }

//    ====================================

    @Test
    public void test5() {

        fill(coll, "*", 4, 6);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test7() {
        fill(coll, "*", -1, 6);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test10() {
        fill(coll, "*", 1, -1);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }


    @Test
    public void test6() {
        fill(coll, "*", -5);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test8() {
        fill(coll, "*", 6);
        var expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void test11() {

        coll = Arrays.asList();
        fill(coll, "*");
        var expected = Arrays.asList();
        assertEquals(expected, coll);
    }



}
```
###_____ Решение Учителя ____###
```
public static <T> void fill(List<T> coll, T element, int begin, int end) {
// BEGIN
var collLength = coll.size();
var normalizedBegin = begin > collLength ? end : begin;
var normalizedEnd = end > collLength ? collLength : end;

        for (var i = normalizedBegin; i < normalizedEnd; i++) {
            coll.set(i, element);
        }
        // END
    }

    public static <T> void fill(List<T> coll, T element, int begin) {

        // BEGIN
        fill(coll, element, begin, coll.size());
        // END
    }

    public static <T> void fill(List<T> coll, T element) {

        // BEGIN
        fill(coll, element, 0, coll.size());
        // END
    }
```
MethodsTest
```
class MethodsTest {

    // BEGIN
    private List<String> coll = new ArrayList<>();;

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList("a", "b", "c", "d"));
    }

    @Test
    public void testCommonCase() {
        fill(coll, "*", 1, 3);
        var expected = List.of("a", "*", "*", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void testDefaultStartAndEnd() {
        fill(coll, "*");
        var expected = List.of("*", "*", "*", "*");
        assertEquals(expected, coll);
    }

    @Test
    public void testStartMoreLength() {
        fill(coll, "*", 10, 12);
        var expected = List.of("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void testStartMoreOrEqualEnd() {
        fill(coll, "*", 2, 2);
        var expected = List.of("a", "b", "c", "d");
        assertEquals(expected, coll);
    }

    @Test
    public void testEndMoreLength() {
        fill(coll, "*", 0, 10);
        var expected = List.of("*", "*", "*", "*");
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
