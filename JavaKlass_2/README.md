

23 (WSL) Oracle OpenJDK 23.0.1\
###_____ Java: Классы ____###\
Курсс_№_2\
###_____ Задания ____###

№_1\
App.java\
TextUtils.java

Предположим, мы разрабатываем приложение, в котором пользователи могут 
публиковать собственные статьи. Для публикации у нас есть одно 
условие — статья должна содержать не менее 10 слов. Для проверки выполнения 
этого условия нам понадобится посчитать количество слов в статье. 
Вам предстоит разработать утилиту, которая будет делать это

src/main/java/io/hexlet/util/TextUtils.java
В файле создайте публичный класс TextUtils, который будет содержать утилиты 
для работы с текстом. В классе реализуйте публичный статический 
метод getWordsCount(), который принимает в качестве параметра 
текст — значение типа String. Метод должен вернуть целое 
число — количество слов в тексте. Слова в тексте разделены одним пробелом, 
а значит словом считается любая последовательность, не содержащая пробелов.

```import io.hexlet.util.TextUtils;

TextUtils.getWordsCount(""); // 0
TextUtils.getWordsCount("man in BlacK"); // 3
TextUtils.getWordsCount("  hello, world!  "); // 2
```
№_2\
Book.java\
App.java

src/main/java/io/hexlet/model/Book.java

В файле создайте класс Book, который будет представлять собой книгу в нашем 
приложении. Класс содержит следующие поля:

title — название книги, строка
author — имя автора книги, строка
published — год публикации, целое число
Реализуйте в классе конструктор

Так как наш класс неявно наследуется от класса Object, ему уже доступен 
метод toString() со стандартным поведением. Переопределите метод toString() 
так, чтобы сделать собственное текстовое представление книги:
```
var book = new Book("First Folio", "William Shakespeare", 1623);
System.out.println(book); //=> Book "First Folio" written by William Shakespeare published in 1623
```
№_3\
Предположим, мы разрабатываем каталог автомобилей. Вам предстоит реализовать метод,
который будет производить поиск автомобиля в этом каталоге

src/main/java/io/hexlet/App.java
В классе App создайте публичный статический метод contains(), который принимает два параметра:

Каталог автомобилей — массив Car[]
Автомобиль Car, который мы ищем.
Метод должен вернуть true, если такой же автомобиль есть в каталоге и false в ином случае
```
Car[] cars = {
new Car("Aston Martin", "V8 Vantage", 2011),
new Car("Ford", "VWindstar", 1998),
new Car("Lotus", "Exige", 2006)
};

var car1 = new Car("Lotus", "Exige", 2006);
App.contains(cars, car1); // true

var car2 = new Car("Lotus", "Exige", 2009);
App.contains(cars, car2); // false
```
src/main/java/io/hexlet/model/Car.java
В классе Car переопределите методы equals() и hashCode() так, 
чтобы сравнение двух объектов класса Car происходило по содержимому. 
Считаем, что автомобили идентичны, если у них совпадают марка, модель и год выпуска.
```
var car1 = new Car("bmv", "x5", 1998);
var car2 = new Car("bmv", "x5", 1998);
car1.equals(car2); // true

var car3 = new Car("bmv", "x5", 2000);
car1.equals(car3); // false
```
Методы equals() и hashCode() работают в связке, так что эти методы нужно переопределять парно

###_____ Решение Учителя ____###

package io.hexlet;
```
import io.hexlet.model.Car;

class App {
    public static boolean contains(Car[] cars, Car car) {
        for (var currentCar : cars) {
            if (currentCar.equals(car)) {
            return true;
            }
        }
        return false;
    }
}
```
###_____ Lombok ____###\
[Project Lombok](https://projectlombok.org/#) \
Project Lombok - это библиотека java, которая автоматически подключается 
к вашему редактору и инструментам сборки, придавая пикантность вашей java.
Никогда больше не пишите другой метод getter или equals, с одной аннотацией 
ваш класс имеет полнофункциональный конструктор, автоматизирующий ведение 
журнала переменных и многое другое.

№_4\
src/main/java/io/hexlet/model/Film.java \
В файле создайте класс Film, который будет представлять собой фильм. 
Класс содержит следующие поля:

title — название фильма, строка
director — имя режиссера, строка
produced — год выпуска, целое число
genre — жанр фильма, строка
actors — имена актеров, массив строк
duration — длительность фильма в минутах, целое число
Реализуйте в классе пустой конструктор и конструктор со всеми полями. 
Добавьте в класс геттеры и сеттеры для всех полей. 
Переопределите методы equals() и hashCode() так, 
чтобы сравнение фильмов происходило по содержимому всех полей объекта, кроме поля duration
```
var film1 = new Film(
"Man Who Sleeps",
"John Doe",
1998,
"action",
new String[] {"Jack Jones", "Anna S"},
123
);

film.getDirector(); // John Doe 
film.setDuration(250);
film.getDuration(); // 250
```
Подсказки \
Параметры аннотации [EqualsAndHashCode](https://javadoc.io/doc/org.projectlombok/lombok/1.16.18/lombok/EqualsAndHashCode.html#exclude--) \
Статья про [EqualsAndHashCode](https://www.baeldung.com/java-lombok-equalsandhashcode)

№_5 \
###_____ Data-классы ____###

src/main/java/io/hexlet/dto/CustomerDTO.java
В файле создайте класс CustomerDTO, который будет служить в нашем приложении для получения извне данных о покупателе. 
Класс содержит следующие поля:

firstName — имя покупателя, строка
lastName — фамилия покупателя, строка
email — адрес электронной почты, строка
Сделайте поля класса неизменяемыми и реализуйте в классе конструктор и геттеры
```
var customerDTO = new CustomerDTO("Anna", "Smith", "anna@gmail.com");
```
###_____ Решение ____###
```
CustomerDTO.java
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomerDTO {
private final String firstName;
private final String lastName;
private final String email;
}
```
№_6\
###_____ Задание ____###\
Представьте, что мы разрабатываем логистическое приложение, 
которое следит за транспортировкой и хранением грузов. 
Одно из сущностей нашего приложения — это склад товаров. 
У нашего склада есть максимальная вместимость. 
Мы не можем разместить на складе товаров больше, чем там поместится. 
И не можем забрать со склада товаров больше, чем там сейчас есть

src/main/java/io/hexlet/ProductsStorage.java\
В файле создайте класс ProductsStorage, который представляет собой склад 
товаров

Класс содержит следующие поля:

goodsQuantity — количество товара на складе\
maxCapacity — максимальная вместимость склада\
Реализуйте в классе конструктор со всеми полями и геттеры\

Реализуйте в классе следующие методы, которые меняют состояние объекта 
склада:

placeProducts() — добавляет новые товары на склад. Метод принимает в качестве параметра целое число — количество товара, 
которое нужно разместить на складе

takeProducts() — забирает товары со склада. Метод принимает в качестве параметра целое число — количество товара, 
которое мы изымаем со склада

Ваша задача — проследить за целостностью состояния объекта, чтобы оно не нарушалась. 
Правила такие: мы не можем загрузить на склад товаров больше, чем он может вместить. 
И не можем забрать больше, чем есть сейчас. При попытке сделать это методы должны вывести на экран сообщение о том, 
что действие не возможно выполнить, а состояние объекта не должно измениться. 
Содержание сообщения остается на ваше усмотрение
```
// Создаем новый объект склада с начальным количеством товара и максимальной вместимостью
var storage = new ProductsStorage(20, 50);

// Размещаем там товар
storage.placeProducts(20);
storage.getGoodsQuantity(); // 40

// Будет превышена максимальная вместимость
storage.placeProducts(60); // => Общее количество товара превысит максимальную вместимость
// Состояние склада не изменилось
storage.getGoodsQuantity(); // 40

// Забираем товары со склада
storage.takeProducts(30);
storage.getGoodsQuantity(); // 10

// Это больше, чем есть сейчас
storage.takeProducts(60); // => Такого количество товара нет на складе
storage.getGoodsQuantity(); // 10
```
###_____ Решение ____###
```
package io.hexlet.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProductsStorage {
private int goodsQuantity;
private int maxCapacity;

public void placeProducts(int quantityProducts) {
int balance = goodsQuantity + quantityProducts;

        if (balance <= maxCapacity) {
            goodsQuantity = balance;
        } else {
            System.out.println("Операция не выполнена!\n" +
                    "Количество товара превышает допустимое значение");
        }
    }

    public void takeProducts(int quantityProducts) {
        if (goodsQuantity >= quantityProducts) {
            goodsQuantity -= quantityProducts;
        } else {
            System.out.println("Операция не выполнена!\n" +
                    "Такого количества товара на складе нет.");
        }
    }
}
```
###_____ Решение Учителя ____###
```
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class ProductsStorage {
private int goodsQuantity;
private int maxCapacity;

    public void placeProducts(int quantity) {

        if ((goodsQuantity + quantity) > maxCapacity) {
            System.out.println("Общее количество товара превысит максимальную вместимость");
            return;
        }

        goodsQuantity += quantity;
    }

    public void takeProducts(int quantity) {

        if ((goodsQuantity - quantity) < 0) {
            System.out.println("Такого количество товара нет на складе");
            return;
        }

        goodsQuantity -= quantity;
    }
}
```
###_____ Задание ____###\
// №_7\
В этом упражнении мы создадим собственный класс для генерации случайных чисел

src/main/java/io/hexlet/MyRandom.java
В файле создайте класс MyRandom, который будет представлять собой наш 
собственный генератор чисел. Генератор предназначен для получения 
случайных чисел в в диапазоне от 1 до 100 включительно. 
Конфигурацию нашего генератора — верхнюю и нижнюю границы диапазона будем хранить в статических свойствах. 
Создайте в классе соответствующие статические свойства.

Реализуйте в классе публичный статический метод generate(), который будет 
возвращать случайное число типа int в диапазоне, указанном в конфиге класса

MyRandom.generate(); // Целое число в диапазоне от 1 до 100
Подсказки
Случайное число можете получить любым удобным вам способом. 
Возможно, вам пригодится метод [Math.random()](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#random--)

###_____ Решение ____###
```
public class MyRandom {
public static int minValue = 1;
public static int maxValue = 100;

    public static int generate() {
        return minValue + (int)(Math.random() * (maxValue - minValue) + 1);
    }
}
```
###_____ Решение Учителя ____###
```
class MyRandom {
public static final int MIN = 1;
public static final int MAX = 100;

    public static int generate() {
        return (int) Math.floor(Math.random() * (MAX - MIN + 1)) + MIN;
    }
}
```
//===========================================================================\
###_____ Java: Списки ____###\
// №_8\
###_____ Задание ____###\
У списков в Java есть метод get(), который возвращает элемент списка по 
указанному индексу. А в случае, если такого индекса нет, выбрасывает исключение. 
Вам предстоит создать свой собственный вариант такого метода, но с небольшим 
отличием в поведении

src/main/java/io/hexlet/App.java
В классе App реализуйте публичный статический метод getOrDefault(), 
который принимает на вход три параметра:

исходная коллекция элементов, список строк List<String>
индекс элемента, который мы хотим получить, целое число
дефолтное значение, строка
Метод должен вернуть элемент списка по указанному индексу. 
Но, в отличие от стандартного метода списков, в случае, если такого индекса 
нет, наш метод должен вернуть дефолтное значение, а не выбрасывать исключение

var capitals = List.of("london", "berlin", "tokio");

App.getOrDefault(capitals, 1, ""); // "berlin"
App.getOrDefault(capitals, 2, ""); // "tokio"
App.getOrDefault(capitals, 5, ""); // ""
App.getOrDefault(capitals, -2, ""); // ""
Подсказки\
Изучите [документацию](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html#get(int))
на метод get(). Посмотрите, в каком случае он 
считает, 
что индекс не существует. Используйте это в собственном методе для 
проверки существования индекса

###_____ Решение ____###
```
public static String getOrDefault(List<String> listStr, int index, String def) {

try {
return listStr.get(index);
} catch (IndexOutOfBoundsException e) {
return def;
}
}
```
###_____ Решение Учителя ____###
```
import java.util.List;

class App {

public static String getOrDefault(List<String> items, int index, String defaultValue) {
if (index >= items.size() || index < 0) {
return defaultValue;
}
        return items.get(index);
    }    
}
```

№_\
###_____ Задание ____###\
###_____ Решение ____###\
###_____ Решение Учителя ____###\
###_____ Страница модуля ____###\
j