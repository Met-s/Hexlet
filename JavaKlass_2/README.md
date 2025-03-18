

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
случайных чисел в диапазоне от 1 до 100 включительно. 
Конфигурацию нашего генератора — верхнюю и нижнюю границы диапазона будем хранить в статических свойствах. 
Создайте в классе соответствующие статические свойства.

Реализуйте в классе публичный статический метод generate(), который будет 
возвращать случайное число типа int в диапазоне, указанном в конфиге класса

MyRandom.generate(); \
// Целое число в диапазоне от 1 до 100
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

Исходная коллекция элементов, список строк List<String>
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
№_9 \
###_____ Задание ____###\

src/main/java/io/hexlet/App.java\
В классе App реализуйте публичный статический метод replaceByZero(), 
который принимает в качестве парамера список List целых чисел. 
Метод должен вернуть новый список, в котором все отрицательные числа заменены на нули. 
Метод не должен менять исходный список
```
var items = List.of(1, -2, 3, -5);

var result = App.replaceByZero(items);
System.out.println(result); // => [1, 0, 3, 0]

// Исходный список не изменился
System.out.println(items); // => [1, -2, 3, -5]
```
###_____ Решение ____###
```
public static List<Integer> replaceByZero(List<Integer> numbers) {
var newNumbers = new ArrayList<Integer>();
for (var number : numbers) {
number = (number > 0) ? number : 0;
newNumbers.add(number);
}
return newNumbers;
}
```
###_____ Решение Учителя ____###
```
import java.util.List;
import java.util.ArrayList;

class App {
// BEGIN
public static List<Integer> replaceByZero(List<Integer> items) {
var result = new ArrayList<Integer>();

        for (var item : items) {
            var processedItem = item > 0 ? item : 0;
            result.add(processedItem);
        }

        return result;
    }
    // END
}
```
№_10\
src/main/java/io/hexlet/App.java\
В классе App реализуйте публичный статический метод getProductsByPrice(),
который фильтрует список товаров по цене. Метод принимает три параметра:

Список List<Product> товаров\
Минимальная цена товара, целое число\
Максимальная цена товара, целое число
Метод должен вернуть список названий тех товаров, цена которых 
укладывается в переданный диапазон, включая границы диапазона
```
var products = List.of(
new Product("bread", 5),
new Product("milk", 10),
new Product("fish", 30)
);

var result = App.getProductsByPrice(products, 10, 30);
System.out.println(result); // => ["milk", "fish"]
```
###_____ Решение ____###
```
class App {
// BEGIN (write your solution here)
public static List<String> getProductsByPrice(List<Product> products,
int minPrice, int maxPrice) {
var newProducts = new ArrayList<String>();
for (var product : products) {
if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
newProducts.add(product.getTitle());
}
}
return newProducts;
}
// END
}
```
###_____ Решение Учителя ____###
```
import java.util.List;
import java.util.ArrayList;
import io.hexlet.model.Product;

class App {
// BEGIN
public static List<String> getProductsByPrice(List<Product> products, int min, int max) {
var productTitles = new ArrayList<String>();

        for (var product : products) {
            var price = product.getPrice();

            if (price >= min && price <= max) {
                var title = product.getTitle();
                productTitles.add(title);
            }
        }

        return productTitles;
    }
    // END
}
```
###_____ Страница модуля ____###\
Списки в определении типов
[Интерфейс List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html)

###_____ Задание ____###\
№_11\
В этом упражнении мы лишний раз потренируемся обрабатывать списки, а заодно применим подход, рассмотренный в уроке.

src/main/java/io/hexlet/App.java\
В классе App реализуйте публичный статический метод countBooks(), который посчитает общее количество книг автора. Метод принимает три параметра

Список книг\
Имя автора, строка\
Жанр, строка\
Метод должен вернуть общее количество книг в библиотеке, написанных нашим автором в определенном жанре
```
var books = List.of(
new Book("Death on the Nile", "Agatha Christie", "Detective"),
new Book("Murder on the Orient Express", "Agatha Christie", "Detective"),
new Book("The Raven", "Edgar Allan Poe", "Poem")
);

App.countBooks(books, "Agatha Christie", "Detective"); // 2
```
Реализуйте метод так, чтобы он мог принимать в качестве списка книг любую реализацию интерфейса List

###_____ Решение ____###
```
public static int countBooks(List<BookS> books,
String nameAuthor, String genre) {
int quantityBooks = 0;
for (BookS book : books) {
if (nameAuthor.equals(book.getAuthorName()) && genre.equals(book.getGenre())) {
quantityBooks++;
}
}
return quantityBooks;
}
```
###_____ Решение Учителя ____###
```
import java.util.List;
import io.hexlet.model.Book;

class App {
// BEGIN
public static int countBooks(List<Book> books, String authorName, String genre) {

        var booksCont = 0;

        for (var book : books) {
            var bookAuthor = book.getAuthorName();
            var bookGenre = book.getGenre();

            if (bookAuthor.equals(authorName) && bookGenre.equals(genre)) {
                booksCont++;
            }
        }

        return booksCont;
    }
    // END
}
```
###_____ Задание ____###\
//№_12

Одно из типичных действий в социальных сетях - поиск общих друзей. В этом упражнении вам предстоит реализовать аналогичный функционал

src/main/java/io/hexlet/App.java
В классе App реализуйте публичный статический метод getCommonFriends(), который находит общих друзей у двух пользователей. Метод принимает два параметра - пользователей, у которых мы ищем общих друзей

Метод должен вернуть список List<User> друзей, которые являются общими для двух переданных пользователей
```
var user1 = new User("John");
user1.addFriend(new User("Ellery"));

var user2 = new User("Anna");
user2.addFriend(new User("Abey"));

// Общий друг двух пользователей
var friend = new User("Jacky");
user1.addFriend(friend);
user2.addFriend(friend);

List<User> commonFriends = App.getCommonFriends(user1, user2);
System.out.println(commonFriends); // => ["Jacky"]
```
Подсказки
Изучите класс User, который представляет собой пользователя нашей социальной сети. Посмотрите, как хранятся друзья пользователя
В упражнении доступна зависимость CollectionUtils. При желании можете импортировать и использовать ее

###_____ Решение ____###
```
package io.hexlet;

import java.util.List;
import io.hexlet.model.User;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;


class App {
// BEGIN (write your solution here)
public static List<User> getCommonFriends(User firstUser,
User secondUser) {
var firstUser1 = firstUser.getFriends() ;
var secondUser1 = secondUser.getFriends() ;
var commonFriends = new ArrayList<User>();
commonFriends = (ArrayList<User>)
CollectionUtils.intersection(firstUser1, secondUser1);
return commonFriends;
}
// END
}
```
###_____ Решение Учителя ____###
```
package io.hexlet;

import java.util.List;
import io.hexlet.model.User;
import java.util.ArrayList;

class App {
// BEGIN
public static List<User> getCommonFriends(User user1, User user2) {
var commonFriends = new ArrayList<>(user1.getFriends());
commonFriends.retainAll(user2.getFriends());
return commonFriends;
}
// END
}
```
###_____ Задание ____###\
//№_13

Представьте, что мы работаем с каталогом ретро автомобилей. В классе App реализуйте публичный статический метод getCars(), который будет искать в каталоге автомобили, выпущенные до определенного года

Каждый автомобиль в каталоге представлен классом Car, у которого есть марка, модель и год выпуска (дата LocalDate)

Метод принимает два параметра:

Каталог автомобилей, список List<Car>
Год выпуска, целое число
Метод должен вернуть список строк - названий автомобилей, выпущенных до указанного года. Каждое название - это марка + модель, например "Jaguar XK120". Список должен быть отсортирован по названиям автомобилей в прямом порядке без учета регистра
```
var cars = List.of(
new Car("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
new Car("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
new Car("Fiat", "600", LocalDate.of(1956, 1, 1))
);

var result = App.getCars(cars, 1960);
System.out.println(result); // => [Fiat 600, Jaguar XK120]
```
Подсказки
В классе Car реализован метод toString(), который возвращает текстовое представление автомобиля. Этот метод можно использовать для формирования названия

###_____ Решение ____###
```
public static ArrayList<String> getCars(List<Cars> cars, int year) {
var result = new ArrayList<String>();
for (var car : cars) {
LocalDate carYear = car.getManufacturedAt();
if (carYear.getYear() < year) {
result.add(car.toString());
}
}
Collections.sort(result, String.CASE_INSENSITIVE_ORDER);
return result;
}
```
###_____ Решение Учителя ____###
```
package io.hexlet;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import io.hexlet.model.Car;

class App {
// BEGIN
public static List<String> getCars(List<Car> cars, int before) {

        var filteredCars = new ArrayList<String>();


        for (var car : cars) {
            var yearOfManufacture = car.getManufacturedAt().getYear();

            if (yearOfManufacture < before) {
                filteredCars.add(car.toString());
            }
        }

        Collections.sort(filteredCars, String.CASE_INSENSITIVE_ORDER);

        return filteredCars;
    }
    // END
}
```

![img.png](img.png)

###_____ Задание ____###\
//№_14

В программировании часто встречаются задачи, связанные с обработкой строк. Одной из таких задач является проверка баланса скобок в строке. Вам предстоит создать метод, который будет проверять, сбалансированы ли скобки в переданной строке. Это означает, что каждая открывающая скобка имеет соответствующую закрывающую скобку в правильном порядке

src/main/java/io/hexlet/App.java
В классе App реализуйте публичный статический метод isBracketsBalanced(), который принимает на вход строку, состоящую только из открывающих и закрывающих скобок и проверяет баланс скобок. Если скобки в строке сбалансированы, метод должен вернуть true, Если же баланс нарушен, метод должен вернуть false

Примеры сбалансированных скобок: (), ((()())). Пустую строку тоже считаем сбалансированной

А эти скобки не сбалансированы: (, ((), )(
```
App.isBracketsBalanced("()"); // true
App.isBracketsBalanced("()()"); // true
App.isBracketsBalanced("(()())"); // true

App.isBracketsBalanced("("); // false
App.isBracketsBalanced("(()"); // false
App.isBracketsBalanced(")("); // false
```
Алгоритм
Для проверки баланса недостаточно просто посчитать количество скобок, важен так же порядок, в котором они идут. Один из способов решения этой задачи - это использование связанного списка LinkedList. Решать задачу можно так:

Проходим по строке и проверяем каждый символ

Если перед нами открывающий элемент, то заносим его в конец связанного списка
Если закрывающий, то достаем из связанного списка последний добавленный элемент. Если список пустой, то есть в нем нет открывающих скобок, значит строка не сбалансирована.
Если мы дошли до конца строки и связанный список пустой, то все хорошо. Если в нем остались элементы, то проверка не прошла. Такое может быть, если в начале строки были открывающие элементы, но в конце для них не было закрывающих
Как видите, по ходу работы нам приходится постоянно добавлять новые элементы в конец списка и удалять их оттуда. А вот произвольный доступ к элементам нам тут не нужен. Поэтому для решения этой задачи гораздо лучше подходит именно реализация LinkedList

Подсказки
Метод [pollLast()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html#pollLast()) - получает последний элемент связанного списка и 
удаляет его

###_____ Решение ____###\
```
public static boolean isBracketsBalanced(String input) {
var str = new LinkedList<String>();
char[] symbol = input.toCharArray();

        if (symbol.length % 2 != 0) {
            return false;
        }
        
        for (char s : symbol) {
            if (s == '(') {
                str.add("(");
            } else {
                str.poll();
            }
        }
        return str.isEmpty();
    }
```
###_____ Решение Учителя ____###
```
import java.util.LinkedList;

class App {
// BEGIN
public static boolean isBracketsBalanced(String expression) {

        var brackets = new LinkedList<Character>();

        for (var symbol : expression.toCharArray()) {

            if (symbol == '(') {
                brackets.add(symbol);

            } else if (symbol == ')') {
                var lastBracket = brackets.pollLast();

                if (lastBracket == null) {
                    return false;
                }
            }
        }

        return brackets.size() == 0;
    }
    // END
}
```

//=================================================================================
###_____ Jva: Maps ____###\
###_____ Задание ____###\
№_15

В классе App в переменной products находится каталог товаров магазина, представленный HashMap<String, Double>. Ключом в этом каталоге является название товара, а значением - его цена. Вам предстоит реализовать метод, который будет возвращать цену нужного товара с учетом скидки на него

src/main/java/io/hexlet/App.java
Реализуйте публичный статический метод getPriceWithDiscount(), который возвращает цену товара с учетом скидки. Метод принимает два параметра:

Карта сегодняшних скидок, Map<String, Double>. Ключ в этой карте - название товара, а значение - скидка на него в процентах
Название товара, цену на который мы ищем
Метод должен найти товар в каталоге products и вернуть число типа Double - цену на товар с учетом скидки. Если товара в каталоге нет, должно вернуться null. Если в карте сегодняшних скидок нет такого товара, должна вернуться полная цена из каталога
```
var products = Map.of(
"Coffee", 30.0,
"Bread", 10.0,
"Milk", 20.0
);

var discounts = Map.of(
"Bread", 10.0,
"Salmon", 20.0
);

// Скидка на хлеб 10 процентов
App.getPriceWithDiscount(discounts, "Bread"); // 9.0

// На молоко сегодня скидок нет
App.getPriceWithDiscount(discounts, "Milk"); // 20.0

App.getPriceWithDiscount(discounts, "Olives"); // null
```
###_____ Решение ____###
```
private static Map<String, Double> products = Data.getProducts();

    public static Double getPriceWithDiscount(Map<String, Double> discountProduct,
                                              String product) {

        var inProduct = products.get(product);
        var procentDiscount = discountProduct.getOrDefault(product, 0.0);

        if (inProduct == null) {
            return inProduct;
        }
        var result = (inProduct - inProduct * (procentDiscount / 100));
        return result;
    }
```    
###_____ Решение Учителя ____###
```
package io.hexlet;

import java.util.Map;

class App {
private static Map<String, Double> products = Data.getProducts();

    // BEGIN
    public static Double getPriceWithDiscount(Map<String, Double> discounts, String product) {

        if (!products.containsKey(product)) {
            return null;
        }

        var discount = discounts.getOrDefault(product, 0.0);

        var price = products.get(product);
        var priceWithDiscount = price * (100 - discount) / 100;

        return priceWithDiscount;
    }
    // END
}
```
###_____ Задание ____###\
//№_16\
В классе App реализуйте публичный статический метод getMostPopulatedCity(), 
который находит среди всех городов самый густонаселенный. Метод принимает в 
качестве параметра перечень городов Map<String, Integer>, где ключ - 
это название города, а значение - его население. Метод должен вернуть строку, 
название города с максимальным населением
```
var cities = Map.of(
"White River", 114958,
"Kashmor", 210451,
"Oxford", 152450
);

App.getMostPopulatedCity(cities); // Kashmor
```
###_____ Решение ____###
```
public static String getMostPopulatedCity(Map<String, Integer> cities) {
String city = null;
var maxValue = 0;
var keys = cities.keySet();
for (var key : keys) {
if (maxValue < cities.get(key)) {
maxValue = cities.get(key);
city = key;
}
}
return city;
}
```
###_____ Решение Учителя ____###
```
package io.hexlet;

import java.util.Map;

class App {

    // BEGIN
    public static String getMostPopulatedCity(Map<String, Integer> cities) {

        var maxPopulation = 0;
        String mostPopulatedCity = null;

        for (var city : cities.entrySet()) {
            var population = city.getValue();

            if (population > maxPopulation) {
                maxPopulation = population;
                mostPopulatedCity = city.getKey();
            }

        }

        return mostPopulatedCity;
    }
    // END
}
```

№_\
###_____ Задание ____###\
###_____ Решение ____###\
###_____ Решение Учителя ____###\
###_____ Страница модуля ____###\
