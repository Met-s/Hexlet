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









###_____ Модуль ____###

###_____ Решение ____###

###_____ Решение Учителя ____###

==============================================================================\
###_____ Подготовка данных ____###

###_____ Дополнительные материалы ____###
