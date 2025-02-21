23 (WSL) Oracle OpenJDK 23.0.1
###_____ Java: Классы ____###
Курсс_№_2

###_____ Задания ____###
№_1
App.java
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

import io.hexlet.util.TextUtils;

TextUtils.getWordsCount(""); // 0
TextUtils.getWordsCount("man in BlacK"); // 3
TextUtils.getWordsCount("  hello, world!  "); // 2

№_2
Book.java
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

var book = new Book("First Folio", "William Shakespeare", 1623);
System.out.println(book); //=> Book "First Folio" written by William Shakespeare published in 1623

№_3

Предположим, мы разрабатываем каталог автомобилей. Вам предстоит реализовать метод, который будет производить поиск автомобиля в этом каталоге

src/main/java/io/hexlet/App.java
В классе App создайте публичный статический метод contains(), который принимает два параметра:

Каталог автомобилей — массив Car[]
Автомобиль Car, который мы ищем.
Метод должен вернуть true, если такой же автомобиль есть в каталоге и false в ином случае

Car[] cars = {
new Car("Aston Martin", "V8 Vantage", 2011),
new Car("Ford", "VWindstar", 1998),
new Car("Lotus", "Exige", 2006)
};

var car1 = new Car("Lotus", "Exige", 2006);
App.contains(cars, car1); // true

var car2 = new Car("Lotus", "Exige", 2009);
App.contains(cars, car2); // false
src/main/java/io/hexlet/model/Car.java
В классе Car переопределите методы equals() и hashCode() так, чтобы сравнение двух объектов класса Car происходило по содержимому. Считаем, что автомобили идентичны, если у них совпадают марка, модель и год выпуска.

var car1 = new Car("bmv", "x5", 1998);
var car2 = new Car("bmv", "x5", 1998);
car1.equals(car2); // true

var car3 = new Car("bmv", "x5", 2000);
car1.equals(car3); // false
Методы equals() и hashCode() работают в связке, так что эти методы нужно переопределять парно
###_____ Решение Учителя ____###

package io.hexlet;

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

###_____  ____###
Project Lombok  https://projectlombok.org/# 


Project Lombok - это библиотека java, которая автоматически подключается 
к вашему редактору и инструментам сборки, придавая пикантность вашей java.
Никогда больше не пишите другой метод getter или equals, с одной аннотацией 
ваш класс имеет полнофункциональный конструктор, автоматизирующий ведение 
журнала переменных и многое другое.

№_

