package io.hexlet;
import org.apache.commons.collections4.CollectionUtils;
import io.hexlet.dto.CustomerDTO;
import io.hexlet.model.*;
import io.hexlet.moduls.Employee;
import io.hexlet.moduls.OrderDTO;
import io.hexlet.moduls.Post;
import io.hexlet.util.TextUtils;
import javax.print.attribute.standard.RequestingUserName;
import io.hexlet.moduls.User;
import java.util.ArrayList;
import java.util.Arrays;
import io.hexlet.util.Change;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
// №_1
//        int result2 = TextUtils.getWordsCount("  Hello, WoRlD!   ");
//        System.out.println(result2);
//------

//        var user = new User("Mike");
//        System.out.println(user);
//        Object obj = new User("Nina");
//        System.out.println(obj);
// №_2
//        var book = new Book("First Folio", "William Shakespeare", 1623);
//        System.out.println(book);
//------
//        var u1 = new User("Mike", 22);
//        var u2 = new User("Mike", 22);
//        boolean b = u1.equals(u2);
//        System.out.println(b);
//        System.out.println(u1);
//// №_3
//        var car = new Car("Lotus", "Exige", 2006);
//        var car1 = new Car("Lotus", "Exige", 2006);
//        Car[] cars = {
//                new Car("Aston Martin", "V8 Vantage", 2011),
//                new Car("Ford", "VWindstar", 1998),
//                new Car("Lotus", "Exige", 2006)
//        };
//        boolean result = car.equals(car1);
//        System.out.println(result);
//        boolean result1 = App.contains(cars, car);
//        System.out.println(result1);
//// №_3
//    public static boolean contains(Car[] cars, Car car ) {
//        int length = cars.length;
//        for (int i = 0; i < length; i++) {
//            System.out.println(cars[i]);
//            if (cars[i].equals(car)) {
//
//                return true;
//            }
//        }
//        return false;
//    }
//------
//        var post = new User("Frenk", 25, "debian@set.ve");
//        System.out.println(post);
// №_4
//        var film = new Film(
//               "Man Who Sleeps",
//               "John Doe",
//               1998,
//               "action",
//               new String[] {"Jack Jones", "Anna S"},
//               123
//        );
//        boolean result = film.getTitle().equals("Man Who Sleeps");
//        boolean result1 = film.getActors()[0].equals("Jack Jones");
//
//        System.out.println(result);
//        System.out.println(result1);
//------
//        OrderDTO order1 = new OrderDTO(12345, "Alice Smith", 250.0);
//        OrderDTO order2 = new OrderDTO(67890, "Bob Johnson", 450.5);
//        OrderDTO order1 = new OrderDTO(12345, "Alice Smith", 250.0);
//        OrderDTO order2 = new OrderDTO(67890, "Bob Johnson", 450.5);
//
//        System.out.println("Order ID: " + order1.id());
//        System.out.println("Order ID: " + order2.id());
// №_5
// CustomerDTO.java
//        var customerDTO = new CustomerDTO("Anna", "Smith", "anna@gmail.com");
//        System.out.printf("First name: %s\nLast name: %s",
//                customerDTO.getFirstName(), customerDTO.getLastName());
//------
//        var company = "Simens";
//        var employee = new Employee("Mike", company);
// Напрямую
//        var result = company.Change("LG");
//        employee.getCompany().contains("MAK");
//        var change = changeString("Win");
//        System.out.println(change);
// №_6
//        var storage = new ProductsStorage(20, 50);
//
//        storage.placeProducts(20);
//        storage.takeProducts(30);
////        storage.setGoodsQuantity(40);
//        int quantity = storage.getGoodsQuantity();
//        int maxCapacity = storage.getMaxCapacity();
//        System.out.println(quantity);
//        System.out.println(maxCapacity);
// №_7
//        int result = MyRandom.generate();
//        System.out.println(result);
//###_____ ArrayList ____###
//        var items = new ArrayList<String>();
//        items.add("Sun");
//        items.add("Mars");
//        System.out.println(items);                  //[Sun, Mars]
//        System.out.println(items.contains("Sun"));  //true
//        System.out.println(items.get(1));           // Mars
//        System.out.println(items.size());           //2
// Предположим что у нас есть класс User
//        var users = new ArrayList<User>();
//        users.add(new User(/* параметры */));
//        String e = "Stran";
//        var items = new ArrayList<String>();
//        items.add("Mars");
//        CollectionUtils.addIgnoreNull(items, e);
//        System.out.println(items);
// №_8
        var capitals = List.of("london", "berlin", "tokio");

        String result = App.getOrDefault(capitals, 2, " ");
        System.out.println(result);



    }
// №_8
    public static String getOrDefault(List<String> listStr, int index,
                                      String def) {
        try {
            return listStr.get(index);
        } catch (IndexOutOfBoundsException e) {
            return def;
        }
    }



}












// №_9
// №_10
//###_____ Страница модуля ____###
// №_