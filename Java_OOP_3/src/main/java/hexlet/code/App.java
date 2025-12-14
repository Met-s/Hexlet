package hexlet.code;

import hexlet.code.exercise1.Point;
import hexlet.code.exercise1.Segment;
import hexlet.code.exercise2.Cottage;
import hexlet.code.exercise2.Flat;
import hexlet.code.exercise2.Home;
//import hexlet.code.exercise3.InMemoryKV;
import hexlet.code.exercise3.InMemoryKV;
import hexlet.code.exercise3.KeyValueStorage;
import hexlet.code.interfas.Device;
import hexlet.code.interfas.Laptop;
import hexlet.code.interfas.PC;
import hexlet.code.interfas.Screen;
import hexlet.code.polymorphism.Circle;
import hexlet.code.polymorphism.Rectangle;
import hexlet.code.polymorphism.Shape;
import hexlet.code.polymorphism.Square;
import java.util.Map.Entry;
import java.util.Map;

import java.util.Set;
import java.util.stream.Collectors;

//import java.util.*;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
/**
 * ###_____ Страница модуля ____###
 * №_1
 */
//        var person = new Person();
//        person.setName("Agata");
//        person.setAge(10);
//        System.out.println(person);
/**
*  ###_____ Задание ____###
 * №_1
*/

//        Point point1 = new Point(4, 3);
//        Point point2 = new Point(6, 1);
//
//        Segment segment = new Segment(point1, point2);
//        Point midPoint = segment.getMidPoint();
//        int x = midPoint.getX();  // 5
//        int y = midPoint.getY();  // 2
//
//        System.out.println("x = " + x + "\ny = " + y);
/**
 * ###_____ Страница модуля ____###
 * Интерфейсы
 * №_2
 */
//        Device pc1 = new PC();
//        PC pc2 = new PC();
//        pc1.getRam();   //=> PC.getRam
//        pc2.getRam();   //=> PC.getRam
//
//        pc2.getProcessor();  //=> PC.getProcessor
//
//        // Не доступен, так как в интерфейсе нет такого метода
////        pc1.getProcessor();
//
//        Screen laptop1 = new Laptop();
//        Device laptop2 = new Laptop();
//
//        getAvgRam(List.of(pc1, pc2, laptop1, laptop2));
//        //=> PC.getRam
//        //=> PC.getRam
//        //=> Laptop.getRam
//        //=> Laptop.getRam
//
//        // Вызов статического метода
//        System.out.println(Device.getInterfaceName());  //=> Device
//        // Обращение к статической переменной
//        System.out.println(Device.INTERFACE_NAME);  //=> Device
//        // Вызов дефолтных методов
//
//        // В самом классе Device этот метод не переопределен
//        // Вызывается дефолтная имплементация
//        pc1.getSsd();   //=> Device.getSsd
//
//        // В классе Laptop метод переопрелен
//        // Вызывается собственная имплементация
//        laptop1.getSsd();   //=> Laptop.getSsd
/**
 *  ###_____ Задание ____###
 * №_2
 */
//        Home flat = new Flat(54.5, 4, 3);
//        double area = flat.getArea();
//        String mes = flat.toString();
//
//        System.out.println("Area is " + area);
//        System.out.println(mes);
//
//        Home flat2 = new Flat(60.5, 4, 3);
//        double area2 = flat2.getArea();
//
//        System.out.println("Area is " + area2);
//
//        int result = flat.compareTo(flat2);
//
//        System.out.println("compareTo " + result);
//
//        Home cottage = new Cottage(135, 2);
//        double areaCottage = cottage.getArea(); // 135
//         // "2 этажный коттедж площадью 135 метров"
//        System.out.println("AreaCottage is " + areaCottage);
//        System.out.println("cottage.toString()" + cottage.toString());

//        List<Home> apartments = new ArrayList<>(List.of(
//                new Flat(41, 3, 10),
//                new Cottage(125.5, 2),
//                new Flat(80, 10, 2),
//                new Cottage(150, 3)
//        ));
//
//        List<String> resultSort = App.buildApartmentsList(apartments, 3);
//        System.out.println(resultSort);
/**
 * ###_____ Страница модуля ____###
 * Пщлиморфизм
 * №_3
 */
//        List<Shape> shapes = List.of(
//                new Square(2),
//                new Square(3),
//                new Rectangle(1, 2),
//                new Rectangle(1, 3),
//                new Circle(1)
//        );
//
//        System.out.println(getTotalArea(shapes));
/**
 *  ###_____ Задание ____###
 *  Пщлиморфизм
 * №_3
 */
//        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));

//        storage.get("key", "default");
//
//        Map<String, String> storageMap = new java.util.HashMap<>(Map.of("key", "value"));
//        storageMap.put("key1", "value1");
////        System.out.println(storage.toMap());
//        System.out.println(storageMap);
//
//        storage.set("key2", "value2");
////        System.out.println(storage);
////        storage.set()
//
//        App.swapKeyValue(storage);
//        System.out.println(storage.toMap());
//
//
////        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
////        App.swapKeyValue(storage);
//         // "default"
//         // "key"
//
//        System.out.println(storage.get("key", "default"));
//        System.out.println(storage.get("value", "default"));
//        System.out.println(storage.toMap()); // => {value=key, value2=key2}


    }
// --------
//    public static int getAvgRam(List <Device> devices) {
//        int result = 0;
//
//        for (Device device : devices) {
//            result += device.getRam();
//        }
//        return result / devices.size();
//    }
// --------
/**
 * ###_____ Интерфейсы ____###
 * №_2 к заданию
 */

//    public static List<String> buildApartmentsList(List<Home> listHouses, int quantetyHouses) {
//
//        List<String> apartmentsList = new ArrayList<>();
//
//        listHouses.stream()
//                .sorted(Comparator.comparing(Home::getArea))
//                .forEach(house -> {
//                    apartmentsList.add(house.toString());
//                });
//
//
//
//        return apartmentsList.stream().limit(quantetyHouses).toList();
//    }
/**
 * ###_____ Полиморфизм ____###
 * метод для подсчета площади
 */
//    public static double getTotalArea(List<Shape> shapes) {
//        double result = 0;
//
//        for (Shape shape : shapes) {
//            result += shape.getArea();
//        }
//        return result;
//    }
/**
 *  ###_____ Задание ____###
 *  Пщлиморфизм
 * №_3 к заданию
 */
    public static void swapKeyValue (KeyValueStorage date) {
        Map<String, String> map = date.toMap();

        Set<Entry<String, String>> set = map.entrySet();

        for (Entry<String, String> entry : set) {
            date.unset(entry.getKey());
            date.set(entry.getValue(), entry.getKey());
        }
    }
}
