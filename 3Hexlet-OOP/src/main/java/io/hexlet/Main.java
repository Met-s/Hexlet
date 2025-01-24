package io.hexlet;


import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import io.hexlet.geometry.Quadrate. *;
import io.hexlet.App;
import io.hexlet.geometry.Quadrate;
import static io.hexlet.App.enlargeQuadrate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
//№_1
//        System.out.println(App.getSquare(10, 10, 60));
//№_2
//        var point = App.getNewPoint();
//        System.out.println(point.getX());
//        System.out.println(point.getY());
//№_3
//        Circle circle = new Circle(1, 2, 10);
//        var result = App.getCircumference(circle);
//        System.out.println(result);

//№_4
//        var url = new Url("https://google.com");
//        System.out.println(App.checkSecurity(url));

//№_5
////        var u1 = new User("Igor", "Mon");
////        var u2 = u1;
////        u2.firstName = "Nina";
////        System.out.println(u1.firstName);
//        var u = new User("Igor", "Mon");
//        UserController.replaceName(u, "Nina");
//        System.out.println(u.firstName);
//№_6  class User.java
//        var user1 = new User(1, "Nick12");
//        var user2 = new User(1, "Nick1");
//
//        var result = user1.isEqual(user2);
//        System.out.println(result);
//№_7 Строки
//        String line[] = new String[] {"java", "javascript", "java", "aphp" };
//
//        System.out.println(App.hasDuplicates(line));
//№_8
//        App.calculateAverage(new Integer[] {1, 2, 3, 4}); // 2.5
//        App.calculateAverage(new Integer[] {}); // null
//        App.calculateAverage(new Integer[] {null}); // null
//        App.calculateAverage(new Integer[] {1, null, 3}); // null
//№_9
//        /**
//         * интерфейс
//         * class UserController, class SuperPasswordGenerator,
//         * class SimplePasswordGenerator, interface PasswordGenerator
//         */
//
//        // Создадим два разных генератора паролей, реализующих PasswordGenerator
//        PasswordGenerator simpleGenerator = new SimplePasswordGenerator();
//        PasswordGenerator superGenerator = new SuperPasswordGenerator();
//
//        UserController controller = new UserController();
//
//        // Сюда мы можем передать любой класс,
//        // Который реализует интерфейс PasswordGenerator
//        var simplePass = controller.create(simpleGenerator);
//        System.out.println("Простой пароль: " + simplePass);
//
//        var superPass = controller.create(superGenerator);
//        System.out.println("Супер пароль: " + superPass);
//№_10
//        Geometric quadrate = new Quadrate(5);
//        App.getFigureSquare(quadrate);
//
//        Geometric circle = new Circle(10);
//        App.getFigureSquare(circle);
//№_11_###_____ Код_из_модуля ____###
//        var path = "/path/to/file.txt";
//        try {
//            var content = readFile(path);
//            System.out.println("content " + content);
//        } catch (IOException e) {
//            System.out.println("Проверьте что файл ");
//        }
//        System.out.println("Код который идет тут, будет выполнен");
//    }
//
//    public static String readFile(String path) throws IOException {
//        var preparedPath = Paths.get(path);
//        var content = new String(Files.readAllBytes(preparedPath));
//        System.out.println("readFile: FORT");
//        return content;
//    }
//№_12
//        var figure1 = new Rectangle(-4, 5);
//        App.printSquare(figure1);

//№_13
//        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
//        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
//        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
//        System.out.println(noOfDaysBetween);
//
//        var x = RandomUtils.nextInt(1, 1000);
//        System.out.println(x);
//№_14
        var quadrate = new Quadrate(3);
        var enlargedQuadrate = App.enlargeQuadrate(quadrate);

        var reset1 = enlargedQuadrate.getSide();
        var reset = quadrate.getSide();


        System.out.println(enlargedQuadrate);
        System.out.println(reset);
        System.out.println(reset1);






    }
}






//№_15
//№_16
//№_17
//№_18
//№_19
//№_20
//№_
//№_ _###_____ Код_из_модуля ____###
// ###_____ Решение Учитуля ____###
