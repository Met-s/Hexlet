package io.hexlet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
        /**
         * Интерфейс
         * class UserController, class SuperPasswordGenerator,
         * class SimplePasswordGenerator, interface PasswordGenerator
         */

        // Создадим два разных генератора паролей, реализующих PasswordGenerator
        PasswordGenerator simpleGenerator = new SimplePasswordGenerator();
        PasswordGenerator superGenerator = new SuperPasswordGenerator();

        UserController controller = new UserController();

        // Сюда мы можем передать любой класс,
        // Который реализует интерфейс PasswordGenerator
        var simplePass = controller.create(simpleGenerator);
        System.out.println("Простой пароль: " + simplePass);

        var superPass = controller.create(superGenerator);
        System.out.println("Супер пароль: " + superPass);




    }




//№_10
//№_11

}

//№_
//№_
//№_
//№_
//№_
// ###_____ Решение Учитуля ____###
