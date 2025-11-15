//=================================================================================\
###_____ Java: Автоматическое тестирование ____###\
//=================================================================================\
###_____ Задание ____###\
//№_40\
Напишите тесты для метода get(strings, index, defaultValue), который получает элемент массива по индексу, при условии, что он существует. В ином случае возвращается defaultValue.

массив строк String[] strings\
число int index\
строка String defaultValue\
Идея метода взята из библиотеки org.apache.commons.lang3 — ArrayUtils.get()
```
String[] strings = {"hello", "world"};
get(strings, 1, "value"); // "world"
get(strings, 5, "value"); // "value"
```
Тесты должны быть построены по такому же принципу, как это описывалось в теории урока: проверка через if и выброс исключения AssertionError в случае провала теста.

Для хорошего тестирования этого метода, понадобится как минимум три проверки:

Проверка, что метод возвращает нужное значение по существующему индексу (прямой тест на работоспособность)
Проверки на то, что возвращается значение по умолчанию если индекс выходит за
границы массива. Индекс может быть как меньше минимального значения, так и
больше длины массива\
###_____ Решение ____###
```
public void testGet() {
//BEGIN (write your solution here)

        String[] strings = new String[]{"hello", "world"};

        if (!"hello".equals(Methods.get(strings, 0, "value"))) {
            throw new AssertionError("Метод работает неверно!");
        }
        if (!"value".equals(Methods.get(strings, 3, "value"))) {
            throw new AssertionError("Метод работает неверно!");
        }

        if (!"value".equals(Methods.get(strings, -1, "value"))) {
            throw new AssertionError("Метод работает неверно!");
        }

        //END
    }
```    
###_____ Решение Учителя ____###
```
import org.junit.jupiter.api.Test;
import static io.hexlet.Methods.get;

public class MethodsTest {

    @Test
    public void testGet() {
        //BEGIN
        String[] strings = {"zero", "one", "two", "three"};
        var defaultValue = "value";

        var actual1 = get(strings, 0, defaultValue);
        if (!actual1.equals(strings[0])) {
            throw new AssertionError();
        }

        var actual2 = get(strings, 2, defaultValue);
        if (!actual2.equals(strings[2])) {
            throw new AssertionError();
        }

        var actual3 = get(strings, 8, defaultValue);
        if (!defaultValue.equals(actual3)) {
            throw new AssertionError();
        }

        var actual4 = get(strings, -2, defaultValue);
        if (!defaultValue.equals(actual4)) {
            throw new AssertionError();
        }
        //END
    }
}
```
//=================================================================================

###_____ Диограмма_diagram_схема ____###

//=================================================================================\
Рисуем схемы в ID припомощи кода mermaid diagram\
создаём файл в коневой папке каталога рядом с README.md

Рисуем диаграммы Mermaid.js в README-файлах [GitHub / Хабр](https://habr.com/ru/articles/652867/)

file diagram.mmd
```
flowchart   RL; LR;TB;TD; BT;
classDef class1 fill:#3f3,stroke:#333,stroke-width:4px
classDef class2 fill:#ff2400,stroke:#333,stroke-width:4px,color:#fff,stroke-dasharray: 12 5

    subgraph one
        node1[Form 1]
        node2(Form 2)
        node3([Форма 3])
        node4[[Форма 4]]
        node5[(Форма 5)]
        node6((Форма 6))
        node7>Форма 7]
    end

    subgraph two
        node8{Форма 8}
        node9{{Форма 9}}
        node10[/Форма 10/]
        node11[\Форма 11\]
        node12[/Форма 12\]
        node13[\Форма 13/]
    end

    subgraph three
        А --> B
        C --- D
        E -.-> F
        G ==> H
        I --o J
        K --x L
        TR

        id1["Это текст (а вот это могло сломать рендеринг), но у нас есть экранирование"]
    end
    subgraph four
        A-- Text ---B
        C---|Text|D
        E-->|text|F
        G-- text -->H
        I-. text .-> J
        K == text ==> L
        CS --> TR
    end

    subgraph five
        Mermaid_Хабр --> CB
        click Mermaid_Хабр "https://habr.com/ru/articles/652867/"
    end

    subgraph six
        AA:::class1 --> BB:::class2
    end

    subgraph seven

    end



%%flowchart TD



    Start --> Up
    Start --> Stop
    Up --> End
    Stop --> End



%%  TB — «top to bottom», сверху вниз;
%%  TD — «top-down/ same as top to bottom», сверху вниз;
%%  BT — «bottom to top», снизу вверх;
%%  RL — «right to left», справа налево;
%%  LR — «left to right», слева направо.
```
###_____ Задание ____###\
№_41\
Напишите тесты для метода take(numbers, n), который возвращает массив из первых n значений массива numbers. Метод take() уже импортирован в файл с тестами.

Метод принимает два параметра:

массив чисел int[] numbers
количество элементов в новом массиве, число int n
Идея метода взята из библиотеки org.apache.commons.lang3 — ArrayUtils.subarray()
```
int[] numbers = {1, 2, 3};
take(numbers, 1); // [1]
take(numbers, 2); // [1, 2]
take(numbers, 9); // [1, 2, 3]

int[] emptyNumbers = {};
take(emptyNumbers, 2); // []
```
Тестирование необходимо провести с использованием ключевого слова assert.

Подсказки
Для сравнения содержимого массивов используйте метод [Arrays.equals()](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html#equals(int%5B%5D,int%5B%5D))


###_____ class Methods ____###
```
import org.apache.commons.lang3.ArrayUtils;

public class Methods {
/**
* №_40
*/
//    public static String get(String[] strings, int index, String value) {
//        if (index >= strings.length || index < 0) {
//            return value;
//        }
//        return strings[index];
//    }
/**
* №_41
*/
private static String implementation = "right";

    private static int[] right(int[] numbers, int n) {
        return ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong1(int[] numbers, int n) {
        return n <= numbers.length
                ? ArrayUtils.subarray(numbers, 0, n)
                : new int[] {};
    }

    private static int[] wrong2(int[] numbers, int n) {
        return ArrayUtils.isEmpty(numbers)
                ? new int[] {0}
                : ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong3(int[] numbers, int n) {
        return n == 0
                ? ArrayUtils.subarray(numbers, 0, numbers.length)
                : ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong4(int[] numbers, int n) {
        return n == numbers.length
                ? new int[] {}
                : ArrayUtils.subarray(numbers, 0, n);
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static int[] take(int[] numbers, int n) {
        return switch (implementation) {
            case "wrong1" -> wrong1(numbers, n);
            case "wrong2" -> wrong2(numbers, n);
            case "wrong3" -> wrong3(numbers, n);
            case "wrong4" -> wrong4(numbers, n);
            default -> right(numbers, n);
        };
    }
}
```
###_____ Решение ____###
```
package io.hexlet;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static io.hexlet.Methods.take;

public class MethodsTest {

    @Test
    public void testTake() {
        //BEGIN (write your solution here)
        assert Arrays.equals(take(new int[] {1, 2, 3}, 5), new int[] {1, 2, 3}) : "AssertionError: actual1";

        assert Arrays.equals(take(new int[] {}, 2), new int[] {}) : "AssertionError: actualNul2";

        assert Arrays.equals(take(new int[] {1, 2, 3}, 0), new int[] {}) : "AssertionError: actual3";
        

        assert Arrays.equals(take(new int[] {1, 2, 3}, 1), new int[] {1}) : "AssertionError: actual4";
                
        assert Arrays.equals(take(new int[] {1, 2, 3}, -2), new int[] {}) : "AssertionError: actual5";
        assert Arrays.equals(take(null, 3), null);

        //END
    }
}
```
###_____ Решение Учителя ____###
```
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static io.hexlet.Methods.take;

public class MethodsTest {

    @Test
    public void testTake() {
        //BEGIN
        int[] numbers = {1, 2, 3};

        assert Arrays.equals(take(numbers, 2), new int[] {1, 2});
        assert Arrays.equals(take(numbers, 9), new int[] {1, 2, 3});
        assert Arrays.equals(take(new int[] {}, 2), new int[] {});
        assert Arrays.equals(take(numbers, 0), new int[] {});
        assert Arrays.equals(take(numbers, 3), new int[] {1, 2, 3});
        //END
    }
}
```
###_____ Библиотека AssertJ ____###\
[Документация AssertJ](https://assertj.github.io/doc/)

###_____ Задание ____###\
//№_42\
src/test/java/io/hexlet/MethodsTest.java
Напишите тесты для метода indexOf(numbers, value, fromIndex), возвращает индекс первого вхождения переданного элемента в массив, начиная поиск с индекса fromIndex. Метод уже импортирован в файл с тестами.

Метод indexOf() принимает на вход:

массив чисел int[] numbers
значение искомого элемента int value
индекс с которого будет произведён поиск int fromIndex
Если искомый элемент не найден в массиве, то метод возвращает -1.
```
int[] numbers = {1, 2, 1, 2};
indexOf(numbers, 2, 0); // 1
indexOf(numbers, 2, 2); // 3
indexOf(numbers, 8, 0); // -1
```
Подсказки
Тестирование необходимо провести с использованием библиотеки AssertJ. Метод assertThat() уже импортирован в файле MethodsTest.java.
[ArrayUtils.indexOf()](https://commons.apache.org/proper/commons-lang/javadocs/api-release/org/apache/commons/lang3/ArrayUtils.html#indexOf-int:A-int-int-)

###_____ Methods_42 ____###
```
package io.hexlet.modul;

import org.apache.commons.lang3.ArrayUtils;


public class Methods_42 {
private static String implementation = "right";

    private static int right(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.indexOf(numbers, value, fromIndex);
    }

    private static int wrong1(int[] numbers, int value, int fromIndex) {
        var index = ArrayUtils.indexOf(numbers, value, fromIndex);
        return index == -1 ? 0 : index;
    }

    private static int wrong2(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.indexOf(numbers, value, 0);
    }

    private static int wrong3(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.isEmpty(numbers)
                ? 0
                : ArrayUtils.indexOf(numbers, value, fromIndex);
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static int indexOf(int[] numbers, int value, int fromIndex) {
        return switch (implementation) {
            case "wrong1" -> wrong1(numbers, value, fromIndex);
            case "wrong2" -> wrong2(numbers, value, fromIndex);
            case "wrong3" -> wrong3(numbers, value, fromIndex);
            default -> right(numbers, value, fromIndex);
        };
    }
}
```
###_____ Решение ____###
```
package io.hexlet;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.modul.Methods_42.indexOf;

public class MethodsTest_42 {

    @Test
    public void testIndexOf() {
        int[] numbers = {1, 2, 1, 2};
        assertThat(1).isEqualTo(indexOf(numbers, 2, 0));
        assertThat(-1).isEqualTo(indexOf(numbers, 8, 0));
        assertThat(-1).isEqualTo(indexOf(new int[] {}, -1, 0));
        assertThat(-1).isEqualTo(indexOf(numbers, 1, 5));
        assertThat(indexOf(numbers, 1, 0)).isEqualTo(0); //0
    }
}
```
###_____ Решение Учителя ____###
```
package io.hexlet;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.Methods.indexOf;

public class MethodsTest {

    @Test
    public void testIndexOf() {
        //BEGIN
        int[] numbers = {1, 2, 3, 1, 5};

        assertThat(indexOf(numbers, 1, 0)).isEqualTo(0);
        assertThat(indexOf(numbers, 8, 0)).isEqualTo(-1);
        assertThat(indexOf(numbers, 1, 2)).isEqualTo(3);
        assertThat(indexOf(new int[] {}, 2, 0)).isEqualTo(-1);
        //END
    }
}
```
###_____ Задание ____###\
//№_43\
src/test/java/io/hexlet/MethodsTest.java
Напишите тесты для метода gt(value, other), который возвращает true в том случае, если value > other, и false в иных случаях.

Метод gt() принимает на вход:
```
число int value
число int other
gt(3, 1); // true

gt(3, 3); // false

gt(1, 3); // false
```
###_____ Дополнительные материалы ____###

1. [Документация AssertJ](https://assertj.github.io/doc/)
2. Весь перечень подобных матчеров и примеров их использования можно найти в официальной документации [AbstractObjectAssert](https://joel-costigliola.github.io/assertj/core-8/api/org/assertj/core/api/AbstractObjectAssert.html)

###_____ class Methods ____###
```
public class Methods {
private static String implementation = "right";

    private static boolean right(int value, int other) {
        return value > other;
    }

    private static boolean wrong1(int value, int other) {
        return value >= other;
    }

    private static boolean wrong2(int value, int other) {
        return value != other;
    }

    private static boolean wrong3(int value, int other) {
        return true;
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static boolean gt(int value, int other) {
        return switch (implementation) {
            case "wrong1" -> wrong1(value, other);
            case "wrong2" -> wrong2(value, other);
            case "wrong3" -> wrong3(value, other);
            default -> right(value, other);
        };
    }
}
```
###_____ Решение ____###
```
package io.hexlet.modul;

import org.junit.jupiter.api.Test;

import static io.hexlet.modul.Methods_43.gt;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MethodsTest_43 {

    @Test
    public void testGt() {
        assertThat(gt(3, 1)).isTrue();
        assertThat(gt(3, 3)).isFalse();
        assertThat(gt(3, 4)).isFalse();
    }
}
```
###_____ Задание ____###\
//№_44\
Напишите тесты для объекта Validator. Это валидатор чисел, который проверяет корректность данных с помощью метода isValid(). Необходимые проверки добавляются вызовами методов на объекте (см. пример).
```
// Создаем объект валидатора
var validator = makeValidator();
// Так как не было добавлено ни одной проверки,
// корректными данными будут считаться числа и значение null
validator.isValid(null); // true
validator.isValid("some string"); // false
// добавляем проверку, что переданное значение должно быть числом
validator.required();
validator.isValid(null); // false
// добавляем проверку, что переданное число больше нуля
validator.positive();
validator.isValid(5); // true
validator.isValid(0); // false
```
###_____ Решение ____###
```
package io.hexlet.modul;

import org.junit.jupiter.api.Test;

import static io.hexlet.Methods.makeValidator;
import static org.assertj.core.api.Assertions.assertThat;

public class MethodsTest_44 {

    @Test
    public void testValidator() {

        var validator = makeValidator();
        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid("some")).isFalse();

        validator.required();
        assertThat(validator.isValid(null)).isFalse();
        validator.positive();
        assertThat(validator.isValid(5)).isTrue();
        assertThat(validator.isValid(0)).isFalse();
    }
}

/**
* Сопуствующие файлы:
* implementations/
*                  Right
*                  Validator
*                  Wrong1
*                  Wrong2
*                  Wrong3
*                  Wrong4
* main.java.io.hexlet/
*            Methods
* test.jama.io.hexlet/
*            TestsTest
*/
```
###_____ Решение Учителя ____###
```
package io.hexlet;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.Methods.makeValidator;

public class MethodsTest {

    @Test
    public void testValidator() {
        //BEGIN
        var validator = makeValidator();
        assertThat(validator.isValid(5)).isTrue();
        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid("string")).isFalse();

        validator.required();
        assertThat(validator.isValid(null)).isFalse();

        validator.positive();
        assertThat(validator.isValid(0)).isFalse();
        assertThat(validator.isValid(-5)).isFalse();
        assertThat(validator.isValid(100)).isTrue();
        //END
    }
}
```






№_\
###_____ Задание ____###\
###_____ Решение ____###\
###_____ Решение Учителя ____###\
###_____ Страница модуля ____###\
==============================================================================\
###_____ Java:  ____###\
