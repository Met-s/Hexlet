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






###_____ Модуль ____###

###_____ Решение ____###

###_____ Решение Учителя ____###

==============================================================================\
###_____ Подготовка данных ____###

###_____ Дополнительные материалы ____###
