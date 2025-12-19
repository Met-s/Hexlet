//=================================================================================\
###_____ Java: ООП ____###
//=================================================================================
###_____ Модуль ____###

###_____ Классы и объекты ____###

###_____ Дополнительные материалы ____###

1. Язык моделирования [UML](https://ru.wikipedia.org/wiki/UML)

###_____ Задание ____###\
№_1

src/main/java/io/hexlet/Point.java
Точка — графический примитив на координатной плоскости, который описывается двумя координатами по оси X и по оси Y.

Создайте класс Point. Внутри класса реализуйте конструктор, который принимает два целых числа — координаты точки по осям x и y. В классе определите следующие методы:

getX() — возвращает координату точки по оси x.
getY() — возвращает координату точки по оси y.
````
Point point = new Point(4, 3);
int x = point.getX(); // 4
int y = point.getY(); // 3
````
src/main/java/io/hexlet/Segment.java
Отрезок - еще один графический примитив, который определяется двумя точками — началом и концом отрезка.

Создайте класс Segment. Внутри класса реализуйте конструктор, который принимает две точки — начало и конец отрезка. Точка — это объект класса Point. В классе определите следующие методы:

getBeginPoint() — возвращает начальную точку отрезка.
getEndPoint() — возвращает конечную точку отрезка.
getMidPoint() — возвращает новую точку — середину отрезка.
````
Point point1 = new Point(4, 3);
Point point2 = new Point(6, 1);

Segment segment = new Segment(point1, point2);
Point midPoint = segment.getMidPoint();
midPoint.getX(); // 5
midPoint.getY(); // 2
````
###_____ Решение ____###
````
// BEGIN (write your solution here)
import java.util.ArrayList;
import java.util.List;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<int[]> getPoints() {
        List<int[]> points = new ArrayList<>();
        points.add(new int[] {x, y});
        return points;
    }
}
// END
````
````
// BEGIN (write your solution here)
public class Segment {

    private final Point beginPoint;
    private final Point endPoint;


    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;

    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {

        int x = (beginPoint.getX() + endPoint.getX()) / 2;
        int y = (beginPoint.getY() + endPoint.getY()) / 2;

        return new Point(x, y);

    }
}
// END
````
###_____ Решение Учителя ____###
````
// BEGIN
class Point {
private int x;
private int y;

    Point(int coordinateX, int coordinateY) {
        this.x = coordinateX;
        this.y = coordinateY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
// END
````
````
// BEGIN
class Segment {
private Point beginPoint;
private Point endPoint;

    Segment(Point point1, Point point2) {
        this.beginPoint = point1;
        this.endPoint = point2;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getMidPoint() {
        int newX = (beginPoint.getX() + endPoint.getX()) / 2;
        int newY = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(newX, newY);
    }
}
// END
````
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    void testPoint() throws Exception {
        Point point = new Point(2, 3);
        assertThat(point.getX()).isEqualTo(2);
        assertThat(point.getY()).isEqualTo(3);
    }

    @Test
    void testSegment() throws Exception {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);
        Segment segment = new Segment(point1, point2);
        assertThat(segment.getBeginPoint()).isEqualTo(point1);
        assertThat(segment.getEndPoint()).isEqualTo(point2);
    }

    @Test
    void testGetMidPoint() throws Exception {
        Point point1 = new Point(-4, -4);
        Point point2 = new Point(2, 6);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        assertThat(midPoint.getX()).isEqualTo(-1);
        assertThat(midPoint.getY()).isEqualTo(1);
    }
}
````
###_____ Интерфейсы ____###

###_____ Дополнительные материалы ____###

1. [Создание интерфейсов](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)	
2. [Метод isEmpty() интерфейса List](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html#isEmpty())	
3. [Методы по умолчанию](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)	

###_____ Задание ____###

№_2

src/main/java/io/hexlet/Home.java

Реализуйте интерфейс Home для работы с недвижимостью. Этот интерфейс содержит два метода:
````
getArea() — предназначен для получения общей площади объекта недвижимости.
compareTo() — Служит для сравнения двух объектов недвижимости по их площади.
````
src/main/java/io/hexlet/Flat.java

Реализуйте класс Flat(), который представляет объект недвижимости — квартиру. Класс должен реализовывать интерфейс Home. Конструктор класса принимает на вход три параметра:
````
area — жилая площадь квартиры, число типа double
balconyArea — площадь балкона, число типа double
floor — этаж, на котором расположена квартира
````
Общая площадь квартиры складывается из жилой площади и площади балкона.

Метод toString() должен возвращать представление квартиры в виде строки формата "Квартира площадью 56 метров на 5 этаже".

Метод compareTo(Home another) в качестве аргумента принимает другой объект недвижимости и сравнивает их по площади. Метод должен вернуть 1, если площадь текущего объекта больше площади переданного; -1, если площадь текущего объекта меньше площади переданного и 0, если площади равны.
````
Home flat = new Flat(54.5, 4, 3);
double area = flat.getArea(); // 58.5
flat.toString(); // "Квартира площадью 58.5 метров на 3 этаже"
src/main/java/io/hexlet/Cottage.java
````
Реализуйте класс Cottage(), который представляет еще один объект недвижимости — коттедж. Класс должен реализовывать интерфейс Home. Конструктор класса принимает на вход два параметра:
````
area — Общая площадь коттеджа, число типа double
floorCount — количество этажей

Метод toString() должен возвращать представление коттеджа в виде строки формата "2 этажный коттедж площадью 120.5 метров".
````
Метод compareTo(Home another) работает аналогично методу в классе Flat
````
Home cottage = new Cottage(135, 2);
double area = cottage.getArea(); // 135
cottage.toString(); // "2 этажный коттедж площадью 135 метров"
````
src/main/java/io/hexlet/App.java

Создайте класс App с публичным статическим методом buildApartmentsList(). Метод принимает в качестве первого аргумента список List объектов недвижимости, реализующих интерфейс Home. Метод сортирует объекты по площади по возрастанию, берет первые n элементов и возвращает строковые представления этих объектов в виде списка List. Количество n элементов передаётся в метод buildApartmentsList() вторым параметром.
````
List<Home> apartments = new ArrayList<>(List.of(
new Flat(41, 3, 10),
new Cottage(125.5, 2),
new Flat(80, 10, 2),
new Cottage(150, 3)
));

List<String> result = App.buildApartmentsList(apartments, 3);
System.out.println(result); // =>
// [
//     Квартира площадью 44.0 метров на 10 этаже,
//     Квартира площадью 90.0 метров на 2 этаже,
//     2 этажный коттедж площадью 125.5 метров
// ]
````
###_____ Решение ____###

__interface Home
````
package io.hexlet.model;

// BEGIN (write your solution here)
public interface Home {
double getArea();
int compareTo(Home another);
}
// END
````
____class Flat
````
package io.hexlet.model;

// BEGIN (write your solution here)
public class Flat implements Home {

    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;

    }

    @Override
    public double getArea() {

        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {

        return Double.compare(getArea(), another.getArea());
    }

    public String toString() {

        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }

}
// END
````
___class Cottage
````
// BEGIN (write your solution here)
public class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }


    @Override
    public double getArea() {

        return area;
    }

    @Override
    public int compareTo(Home home) {

        return Double.compare(getArea(), home.getArea());
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
````
___class App
````
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.List;
import java.util.stream.Collectors;

import io.hexlet.model.Home;

// BEGIN (write your solution here)
public class App {
public static List<String>  buildApartmentsList(List<Home> listHouses, int quantetyHouses) {

        List<String> apartmentsList = new ArrayList<>();

        listHouses.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .forEach(house -> {
                    apartmentsList.add(house.toString());
                });

        return apartmentsList.stream().limit(quantetyHouses).toList();
    }
}
// END
````
___class AppTest
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import io.hexlet.model.Home;
import io.hexlet.model.Flat;
import io.hexlet.model.Cottage;

class AppTest {

    @Test
    void testBuildApartmentsList1() {
        List<Home> apartments = new ArrayList<>(List.of(
            new Flat(41, 3, 10),
            new Cottage(125.5, 2),
            new Flat(80, 10, 2),
            new Cottage(150, 3)
        ));

        List<String> expected = new ArrayList<>(List.of(
            "Квартира площадью 44.0 метров на 10 этаже",
            "Квартира площадью 90.0 метров на 2 этаже",
            "2 этажный коттедж площадью 125.5 метров"
        ));

        List<String> result = App.buildApartmentsList(apartments, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testBuildApartmentsList2() {
        List<Home> apartments = new ArrayList<>(List.of(
            new Cottage(100, 1),
            new Flat(190, 10, 2),
            new Flat(180, 30, 5),
            new Cottage(250, 3)
        ));

        List<String> expected = new ArrayList<>(List.of(
            "1 этажный коттедж площадью 100.0 метров",
            "Квартира площадью 200.0 метров на 2 этаже",
            "Квартира площадью 210.0 метров на 5 этаже",
            "3 этажный коттедж площадью 250.0 метров"
        ));

        List<String> result = App.buildApartmentsList(apartments, 4);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void testBuildApartmentsList3() {
        List<Home> apartments = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> result = App.buildApartmentsList(apartments, 10);
        assertThat(result).isEqualTo(expected);
    }
}
````
###_____ Решение Учителя ____###
````
// BEGIN
public interface Home {
int compareTo(Home home);

    double getArea();
}
// END
````

````
// BEGIN
public class Flat implements Home {
private double area;
private int floor;
private double balconyArea;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return this.area + balconyArea;
    }

    public String toString() {
        return String.format("Квартира площадью %s метров на %d этаже", getArea(), floor);
    }

    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }

        if (this.getArea() > another.getArea()) {
            return 1;
        }

        return -1;
    }
}
// END
````
````
// BEGIN
public class Cottage implements Home {
private double area;
private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public String toString() {
        return String.format("%d этажный коттедж площадью %s метров", floorCount, getArea());
    }

    public int compareTo(Home another) {
        if (area == another.getArea()) {
            return 0;
        }

        if (area > another.getArea()) {
            return 1;
        }

        return -1;
    }
}
// END
````
````
import java.util.List;
import java.util.stream.Collectors;

import io.hexlet.model.Home;

// BEGIN
class App {

    // new
    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
        return apartments.stream()
            .sorted(Home::compareTo)
            .limit(count)
            .map(Home::toString)
            .toList();
    }
    // old
    public static List<String> buildApartmentsList2(List<Home> apartments, int count) {
        int normalizedCount = Math.min(count, apartments.size());
        apartments.sort(Home::compareTo);
        List<Home> sublist = apartments.subList(0, normalizedCount);
        return sublist.stream()
            .map(appartment -> appartment.toString())
            .collect(Collectors.toList());
    }
}
// END
````
###_____ Полиморфизм ____###

###_____ Дополнительные материалы ____###

1. [Полиморфизм подтипов](https://ru.wikipedia.org/wiki/Полиморфизм_(информатика)#Полиморфизм_подтипов)

###_____ Задание ____###

№_3

В программировании, для некоторых задач распространены key-value базы данных. Внешне они работают по принципу словарей, но живут как отдельные программы и умеют делать много полезного: например, сохранять данные на диск, переносить данные между машинами в сети и тому подобное.

В целях тестирования бывает полезно иметь реализацию такой базы данных с таким же интерфейсом, но которая хранит данные в памяти, а не во внешнем хранилище. Это позволяет легко сбрасывать состояние между тестами и не замедлять их. В этом упражнении вам предстоит реализовать такую базу данных.

src/main/java/io/hexlet/InMemoryKV.java
Задачи
Реализуйте класс InMemoryKV, который представляет собой in-memory key-value хранилище. Данные внутри него хранятся в обычном словаре Map. Класс должен реализовывать интерфейс KeyValueStorage. Конструктор класса принимает на вход словарь Map, который становится начальным значением базы данных. Ключи и значения в словаре представлены строками. Интерфейс этого класса вы можете посмотреть в файле

main/java/exercise/KeyValueStorage.java.
Реализуйте в классе следующие интерфейсные методы:

• set() — добавляет в словарь новое значение по указанному ключу (или меняет значение, если ключ уже существует).

• unset() — удаляет из словаря значение по переданному ключу

• get() — возвращает значение по указанному ключу. Если такого ключа в словаре нет, возвращает значение по умолчанию.

• toMap() — возвращает базу данных в виде словаря Map.
````
KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
// Получение значения по ключу
storage.get("key", "default"); // "10"
storage.get("unknown", "default"); // "default"
// Установка нового значения
storage.set("key2", "value2");
storage.get("key2", "default"); // "value2"
// Удаление ключа
storage.unset("key2");
storage.get("key2", "default"); // "default"
// Получение всех данных из базы
Map<String, String> data = storage.toMap();
System.out.println(data); // => {key=10};
````
src/main/java/io/hexlet/App.java

Создайте класс App с публичным статическим методом swapKeyValue(). Метод принимает на вход объект базы данных и меняет в нём ключи и значения местами. swapKeyValue() — полиморфный метод, он может работать с любой реализацией базы данных, реализующей интерфейс KeyValueStorage.
````
KeyValueStorage storage = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
App.swapKeyValue(storage);
storage.get("key", "default"); // "default"
storage.get("value", "default"); // "key"

System.out.println(storage.toMap()); // => {value=key, value2=key2}
````
Подсказка

Изучите тесты

###_____ Решение ____###

class InMemoryKV
````
class InMemoryKV implements KeyValueStorage {

    private Map<String, String> data = new HashMap<>();

    InMemoryKV(Map<String, String> initial) {
        data.putAll(initial);
    }

    public void set(String key, String value) {
        data.put(key, value);
    }

    public void unset(String key) {
        data.remove(key);
    }

    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
````
class App
````
public static void swapKeyValue (KeyValueStorage date) {
Map<String, String> map = date.toMap();

        Set<Entry<String, String>> set = map.entrySet();

        for (Entry<String, String> entry : set) {
            date.unset(entry.getKey());
            date.set(entry.getValue(), entry.getKey());
        }
    }
    
````
interface KeyValueStorage
````
import java.util.Map;

interface KeyValueStorage {
void set(String key, String value);
void unset(String key);
String get(String key, String defaultValue);
Map<String, String> toMap();
}
````
class AppTest
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Map;

class AppTest {
@Test
void testSwapKV() {
KeyValueStorage storage = new InMemoryKV(Map.of("key", "value"));
storage.set("key2", "value2");
App.swapKeyValue(storage);

        assertThat(storage.get("key3", "default")).isEqualTo("default");
        assertThat(storage.get("value", "")).isEqualTo("key");
        assertThat(storage.get("value2", "")).isEqualTo("key2");
    }

    @Test
    void testSwapKV2() {
        KeyValueStorage storage = new InMemoryKV(Map.of("foo", "bar", "bar", "zoo"));
        App.swapKeyValue(storage);
        Map<String, String> expected = Map.of("bar", "foo", "zoo", "bar");
        assertThat(storage.toMap()).isEqualTo(expected);
    }
}
````
class InMemoryKVTest
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Map;
import java.util.HashMap;


class InMemoryKVTest {

    @Test
    void inMemoryKVTest() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
        assertThat(storage.get("key2", "default")).isEqualTo("default");
        assertThat(storage.get("key", "default")).isEqualTo("10");

        storage.set("key2", "value2");
        storage.set("key", "value");

        assertThat(storage.get("key2", "default")).isEqualTo("value2");
        assertThat(storage.get("key", "default")).isEqualTo("value");

        storage.unset("key");
        assertThat(storage.get("key", "def")).isEqualTo("def");
        assertThat(storage.toMap()).isEqualTo(Map.of("key2", "value2"));

    }

    @Test
    void mustBeImmutableTest() {
        Map<String, String> initial = new HashMap<>();
        initial.put("key", "10");

        Map<String, String> clonedInitial = new HashMap<>();
        clonedInitial.putAll(initial);

        KeyValueStorage storage = new InMemoryKV(initial);

        initial.put("key2", "value2");
        assertThat(storage.toMap()).isEqualTo(clonedInitial);

        Map<String, String> map = storage.toMap();
        map.put("key2", "value2");
        assertThat(storage.toMap()).isEqualTo(clonedInitial);
    }
}
````
###_____ Решение Учителя ____###

class App
````
// BEGIN
class App {
public static void swapKeyValue(KeyValueStorage storage) {
Map<String, String> data = storage.toMap();
Set<Entry<String, String>> entries = data.entrySet();
entries.forEach(entry -> storage.unset(entry.getKey()));
entries.forEach(entry -> storage.set(entry.getValue(), entry.getKey()));
}
}
// END
````
class InMemoryKV
````
// BEGIN
class InMemoryKV implements KeyValueStorage {

    private Map<String, String> data = new HashMap<>();

    InMemoryKV(Map<String, String> initial) {
        data.putAll(initial);
    }

    public void set(String key, String value) {
        data.put(key, value);
    }

    public void unset(String key) {
        data.remove(key);
    }

    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
````

###_____ Паттерны ____###

###_____ Дополнительные материалы ____###

1. [Рефакторинг.Гуру](https://refactoring.guru/ru)

###_____ Задание ____###

№_4

В этом задании мы будем работать с HTML-тегами. Каждый класс, реализующий интерфейс TagInterface, представляет собой тег HTML. Единственный метод render() этого интерфейса позволяет получить текстовое представление тега:
````
TagInterface tag = new InputTag("submit", "Save");
tag.render(); // <input type="submit" value="Save">
````
Предположим, что эта система нужна для генерации разных кусков верстки, которая может быть очень разнообразной. Попробуйте ответить на вопрос, сколько понадобится классов для представления всех возможных комбинаций тегов?

Если создавать по классу на каждый возможный вариант верстки, то классов будет бесконечно много и смысла в такой реализации очень мало. Но вместо этого лучше использовать композицию. Создать класс для каждого индивидуального тега (в html5 их около 100 штук), а затем путем комбинирования получить все возможные варианты верстки.

src/main/java/io/hexlet/TagInterface.java

Реализуйте интерфейс TagInterface. В интерфейсе есть один метод render(), который возвращает строковое представление тега

src/main/java/io/hexlet/InputTag.java

Реализуйте класс InputTag, который реализует интерфейс TagInterface. Класс представляет собой HTML-тег
`<input>`. 
Этот тег определяет поле ввода, в которое пользователь может вводить данные. Конструктор класса принимает два строковых параметра: значения атрибутов type и value
````
TagInterface tag = new InputTag("submit", "Save");
tag.render(); // <input type="submit" value="Save">
````
src/main/java/io/hexlet/LabelTag.java

Реализуйте класс LabelTag, который реализует интерфейс TagInterface и умеет оборачивать другие теги. Конструктор класса принимает два параметра: текстовое значение тега в виде строки и дочерний тег - любой объект, реализующий TagInterface
````
TagInterface inputTag = new InputTag("submit", "Save");
TagInterface labelTag = new LabelTag("Press Submit", inputTag);
labelTag.render();
// <label>Press Submit<input type="submit" value="Save"></label>
````
Подсказки

• [Паттерн Декоратор](https://ru.wikipedia.org/wiki/Декоратор_(шаблон_проектирования))\
• [Тег `<label>`](https://developer.mozilla.org/ru/docs/Web/HTML/Element/label)\
• [Тег `<input>`](https://developer.mozilla.org/ru/docs/Web/HTML/Element/input)

###_____ Решение ____###

class InputTag
````
// BEGIN (write your solution here)
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InputTag implements TagInterface {

    private String type;
    private String value;

    @Override
    public String render() {
        return "<input type=\"" + type + "\" value=\"" + value + "\">";
    }
}
// END
````
class LabelTag
````
// BEGIN (write your solution here)
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LabelTag implements TagInterface {

    private String teg;
    private TagInterface childTag;

    @Override
    public String render() {

        return "<label>" + teg + childTag.render() + "</label>";
    }
}
// END
````
interface TagInterface
````
// BEGIN (write your solution here)
public interface TagInterface {
String render();
}
// END
````
AppTest
````
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeAll;


class AppTest {

    private static String expectedInput;
    private static String expectedLabel;

    @BeforeAll
    public static void beforeAll() throws Exception {
        expectedInput = readFixture("input.html");
        expectedLabel = readFixture("label.html");
    }

    @Test
    void testInput()  {
        TagInterface inputTag = new InputTag("submit", "Save");
        var actual = inputTag.render();

        assertThat(actual).isEqualTo(expectedInput);
    }

    @Test
    void testLabel()  {
        TagInterface inputTag = new InputTag("submit", "Save");
        TagInterface labelTag = new LabelTag("Press Submit", inputTag);
        var actual = labelTag.render();

        assertThat(actual).isEqualTo(expectedLabel);
    }

    private static Path getFixturePath(String fileName) {
        return Paths.get("src", "test", "resources", "fixtures", fileName)
            .toAbsolutePath().normalize();
    }

    private static String readFixture(String fileName) throws Exception {
        Path filePath = getFixturePath(fileName);
        return Files.readString(filePath).trim();
    }
}
````
input.html
````
<input type="submit" value="Save">
````
label.html
````
<label>Press Submit<input type="submit" value="Save"></label>
````
###_____ Решение Учителя ____###

class InputTag
````
// BEGIN
class InputTag implements TagInterface {

    private String type;
    private String value;

    InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String render() {
        return "<input type=\"" + this.type + "\" value=\"" + this.value + "\">";
    }

    @Override
    public String toString() {
        return render();
    }
}
// END
````
class LabelTag
````
// BEGIN
class LabelTag implements TagInterface {

    private String text;
    private TagInterface child;

    LabelTag(String text, TagInterface child) {
        this.text = text;
        this.child = child;
    }

    public String render() {
        return "<label>" + text + child.render() + "</label>";
    }
}
// END
````
interface TagInterface
````
// BEGIN
interface TagInterface {
String render();
}
````
Java: ООП\
###_____ Наследование ____###

###_____ Дополнительные материалы ____###

1. Наследование - документация [Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)

###_____ Задание ____###\
№_5

Чтобы браузер при отображении документа понимал, что имеет дело с элементом форматирования, применяются теги. Общий вид тегов следующий:
````
<тег атрибут1="значение1" атрибут2="значение2">
<тег атрибут1="значение1" атрибут2="значение2">...</тег>
````
Теги бывают двух видов — одиночные и парные. Одиночный тег используется самостоятельно, а парный может включать внутри себя другие теги (детей) или текст (тело тега). У тегов могут быть различные атрибуты, которые разделяются между собой пробелом. Значение атрибута заключено в кавычки.

В этом задании вам предстоит реализовать упрощенную версию html тегов.

src/main/java/io/hexlet/Tag.java\
Создайте класс Tag, который описывает html тег. Реализуйте базовый класс так, чтобы он содержал в себе общую логику классов-наследников.

src/main/java/io/hexlet/SingleTag.java\
Создайте класс SingleTag, который наследуется от класса Tag и описывает одиночный html тег. Конструктор класса принимает два аргумента:

Имя тега в виде строки
Атрибуты тега, которые представлены словарём Map со строковыми ключами и значениями.
В классе реализуйте публичный метод toString(), который возвращает текстовое представление тега в виде строки.
````
Tag img = new SingleTag("img", Map.of("class", "v-10", "id", "wop"));
img.toString(); // <img class="v-10" id="wop">
````
src/main/java/io/hexlet/PairedTag.java\
Создайте класс PairedTag, который наследуется от класса Tag и описывает парный html тег. Конструктор класса принимает четыре аргумента:

Имя тега в виде строки
Атрибуты тега, которые представлены словарём Map со строковыми ключами и значениями.
Тело тега, строка
Список List детей. В этом задании детьми могут быть только одиночные теги.
В классе реализуйте публичный метод toString(), который возвращает текстовое представление тега в виде строки.
````
Tag p = new PairedTag(
"p",
Map.of("id", "abc"),
"Text paragraph",
new ArrayList<Tag>()
);

p.toString(); // <p id="abc">Text paragraph</p>

Tag div = new PairedTag(
"div",
Map.of("class", "y-5"),
"",
List.of(
new SingleTag("br", Map.of("id", "s")),
new SingleTag("hr", Map.of("class", "a-5"))
)
)

div.toString(); // <div class="y-5"><br id="s"><hr class="a-5"></div>
````
Подсказки
Сформировать итоговую строку из разных частей можно разными способами. Выбирайте тот, который вам более удобен. Возможно, для этого вам пригодится метод [String.format().](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#format-java.lang.String-java.lang.Object...-)
Вот [пример](https://www.baeldung.com/string/format#example) его использования	

###_____ Решение ____###

class PairedTag
````
import java.util.Map;
import java.util.List;
// import java.util.stream.Collectors;

// BEGIN (write your solution here)
public class PairedTag extends Tag{

    private String bodyTag;
    private List<Tag> singleTags;

    public PairedTag(String nameTag,
                     Map<String, String> attributesTag,
                     String bodyTag,
                     List<Tag> singleTags) {
        super(nameTag, attributesTag);
        this.bodyTag = bodyTag;
        this.singleTags = singleTags;
    }

    public String toString(){

        if (super.getAttributesTag().isEmpty() && bodyTag.isEmpty() && singleTags.isEmpty()){
            return String.format("<%s></%s>", super.getNameTag(), super.getNameTag());
        }
        if (singleTags.isEmpty()){

            return String.format("<%s %s>%s</%s>",
                    super.getNameTag(),
                    valueTeg(super.getAttributesTag()),
                    bodyTag,
                    super.getNameTag());
        }

        return String.format("<%s %s>%s%s</%s>",
                super.getNameTag(),
                valueTeg(super.getAttributesTag()),
                singleTags.get(0),
                singleTags.get(1),
                super.getNameTag());
    }

}
// END
````
class SingleTag
````
import java.util.Map;

// BEGIN (write your solution here)
public class SingleTag extends Tag {

    public SingleTag(String nameTag, Map<String, String> attributesTag) {
        super(nameTag, attributesTag);
    }

    public String toString() {
        if (super.getAttributesTag().isEmpty()) {
            return String.format("<%s>", super.getNameTag());
        }
        return String.format("<%s %s>",
                super.getNameTag(),
                valueTeg(super.getAttributesTag()));
    }
}
// END
````
class Tag
````
// import java.util.stream.Collectors;
import java.util.Map;

// BEGIN (write your solution here)
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;


@Getter
@Setter
public class Tag {

    private String nameTag;
    private Map<String, String> attributesTag;

    public Tag(String nameTag, Map<String, String> attributesTag) {
        this.nameTag = nameTag;
        this.attributesTag = attributesTag;
    }

    public String valueTeg(Map<String, String> attributes) {

        String result = "";

        Iterator<Map.Entry<String, String>> iterator = attributes.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            result += entry.getKey() + "=\"" + entry.getValue() + "\"";
            if (iterator.hasNext()) {
                result += " ";
            }
        }
        return result;
    }
}
// END
````
###_____ Решение Учителя ____###

class PairedTag
````
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {

    private String body;
    private List<Tag> children;

    PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        String attributes = stringifyAttributes();
        String name = getName();
        String value = children.stream()
            .map(Object::toString)
            .collect(Collectors.joining(""));

        return String.format("<%s%s>%s%s</%s>", name, attributes, body, value, name);
    }
}
// END
````
class SingleTag
````
import java.util.Map;

// BEGIN
class SingleTag extends Tag {

    SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    public String toString() {
        return String.format("<%s%s>", getName(), stringifyAttributes());
    }
}

// END
````
class Tag
````
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {

    private String name;
    private Map<String, String> attributes;

    Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String stringifyAttributes() {
        return attributes.keySet().stream()
            .map(key -> {
                String value = attributes.get(key);
                return String.format(" %s=\"%s\"", key, value);
            })
            .collect(Collectors.joining(""));
    }

    public String getName() {
        return name;
    }
}
// END
````
class TestExercise5
````
package hexlet.code;

import hexlet.code.exercise5.PairedTag;
import hexlet.code.exercise5.SingleTag;
import hexlet.code.exercise5.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestExercise5 {

    @Test
    void testSengleTag() {
        Map<String, String> attributes1 = new LinkedHashMap<>();
        attributes1.put("class", "w-75");
        attributes1.put("id", "wop");
        Tag img = new SingleTag("img", attributes1);
        String actual1 = img.toString();
        String expected1 = "<img class=\"w-75\" id=\"wop\">";

        assertEquals(expected1, actual1);
    }

    @Test
    void testSengleTag2() {
        Map<String, String> attributes2 = new LinkedHashMap<>();
        Tag hr = new SingleTag("hr", attributes2);
        String actual2 = hr.toString();
        String expected2 = "<hr>";
        assertEquals(expected2, actual2);
    }

    @Test
    void testPairedTag() {
        Map<String, String> attributes1 = new LinkedHashMap<>();
        attributes1.put("class", "m-10");
        attributes1.put("id", "10");
        attributes1.put("lang", "en");

        // List<Tag> children = new ArrayList<>();

        Tag p = new PairedTag("p", attributes1, "Text paragraph", new ArrayList<Tag>());
        String actual1 = p.toString();
        String expected1 = "<p class=\"m-10\" id=\"10\" lang=\"en\">Text paragraph</p>";

        assertEquals(expected1, actual1);
    }

    @Test
    void testPairedTag2() {
        Map<String, String> attributes2 = new LinkedHashMap<>();
        Tag span = new PairedTag("span", attributes2, "", new ArrayList<Tag>());
        String actual2 = span.toString();
        String expected2 = "<span></span>";

        assertEquals(expected2, actual2);
    }

    @Test
    void testPairedTagWithChildren() {
        Map<String, String> attributes = new LinkedHashMap<>();
        attributes.put("lang", "ru");
        attributes.put("id", "abc");

        List<Tag> children = List.of(
                new SingleTag("br", Map.of("id", "s")),
                new SingleTag("hr", Map.of("class", "a-5"))
        );

        Tag div = new PairedTag("div", attributes, "", children);
        String actual = div.toString();
        String expected = "<div lang=\"ru\" id=\"abc\"><br id=\"s\"><hr class=\"a-5\"></div>";

        assertEquals(expected, actual);
    }
}
````

Java: ООП\
###_____ Ошибки ____###
Exception
###_____ Дополнительные материалы ____###

1. [Коды возврата и исключения](https://habr.com/ru/articles/131212/)

###_____ Задание ____###
№_6

src/main/java/io/hexlet/Circle.java
Круг — графический примитив на плоскости. Чтобы определить круг, достаточно задать точку — центр круга и его радиус.

Создайте класс Circle, описывающий круг. Конструктор класса принимает в качестве аргумента точку Point и радиус в виде целого числа. В классе определите публичные методы:

getRadius() — возвращает радиус круга.
getSquare() — возвращает площадь круга. Если радиус круга меньше нуля, метод должен выбросить исключение NegativeRadiusException.
````
Point point = new Point(3, 4);
Circle circle = new Circle(point, 1);
circle.getRadius(); // 1
circle.getSquare(); // 3.1415...
````
src/main/java/io/hexlet/NegativeRadiusException.java

Реализуйте класс исключения NegativeRadiusException, который наследуется от Exception, базового класса исключений.

src/main/java/io/hexlet/App.java

Реализуйте класс App и публичный статический метод printSquare(), который принимает в качестве аргумента круг Circle и печатает на экран его площадь, округленную до целого числа. Если в процессе вычисления площади возникло исключение, метод должен вывести на экран фразу "Не удалось посчитать площадь". В конце на экран должна выводиться фраза "Вычисление окончено".
````
Point point = new Point(5, 7);
Circle circle = new Circle(point, 4);
App.printSquare(circle);
// => "50"
// => "Вычисление окончено"

Circle circle1 = new Circle(point, -2);
App.printSquare(circle1);
// => "Не удалось посчитать площадь"
// => "Вычисление окончено"
````
###_____ Решение ____###

class Circle
````
// BEGIN (write your solution here)
import static java.lang.Math.PI;

public class Circle {
private int radius;
Point center;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() throws NegativeRadiusException {

        if (radius < 0) {
            throw new NegativeRadiusException("");
        }
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {

        return PI * getRadius() * getRadius();
    }
}
// END
````
class App
````
// BEGIN (write your solution here)
public class App {
    public static void printSquare(Circle circle) {
        try {
            if (circle.getRadius() < 0) {
                throw new NegativeRadiusException("");
            }
            int areaCircle = (int) Math.round(circle.getSquare());
            System.out.println(areaCircle);
        }  catch (Exception e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
````
class NegativeRadiusException
````
// BEGIN (write your solution here)
public class NegativeRadiusException extends Exception {
String message;

    public NegativeRadiusException(String message) {
        super(message);
        this.message = message;
    }
}
// END
````
###_____ Решение Учителя ____###

class Circle
````
// BEGIN
class Circle {

    private Point cirlleCenter;
    private int circleRadius;

    Circle(Point center, int radius) {
        this.cirlleCenter = center;
        this.circleRadius = radius;
    }

    public int getRadius() {
        return this.circleRadius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (this.getRadius() < 0) {
            throw new NegativeRadiusException("Radius can not be negative");
        }

        return Math.PI * Math.pow(circleRadius, 2);
    }
}
// END
````
class App
````
// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            double square = circle.getSquare();
            System.out.println(Math.round(square));
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
````
class NegativeRadiusException
````
// BEGIN
class NegativeRadiusException extends Exception {
    NegativeRadiusException(String msg) {
        super(msg);
    }
}
// END
````
class AppTest
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class AppTest {
@Test
    void testPrintSquare() throws Exception {
        Circle circle = new Circle(new Point(2, 3), 5);
        String result = tapSystemOut(() -> {
            App.printSquare(circle);
        });
        assertThat(result.trim()).isEqualTo("79\nВычисление окончено");

        Circle circle1 = new Circle(new Point(2, 3), -5);
        String result1 = tapSystemOut(() -> {
            App.printSquare(circle1);
        });
        assertThat(result1.trim()).isEqualTo("Не удалось посчитать площадь\nВычисление окончено");
    }
}
````
class CircleTest
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;

class CircleTest {
    @Test
    void testException() {
        Circle circle = new Circle(new Point(1, 2), -2);
        assertThatThrownBy(() -> {
            circle.getSquare();
        }).isInstanceOf(NegativeRadiusException.class);
    }

    @Test
    void testCircle() throws NegativeRadiusException {
        Circle circle = new Circle(new Point(1, 2), 10);
        int radius = circle.getRadius();
        assertThat(radius).isEqualTo(10);

        double square = circle.getSquare();
        assertThat(square).isCloseTo(314.159, within(0.01));

        Circle circle1 = new Circle(new Point(1, 2), 0);
        double square1 = circle1.getSquare();
        assertThat(square1).isEqualTo(0);
    }
}
````
ErrorTest
````
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ErrorTest {
    @Test
    void negativeRadiusException() {
        var error = new NegativeRadiusException("");
        assertThat(error).isInstanceOf(Exception.class);
    }
}
````


###_____ Модуль ____###

###_____ Решение ____###

###_____ Решение Учителя ____###

==============================================================================\
###_____ Подготовка данных ____###

###_____ Дополнительные материалы ____###
