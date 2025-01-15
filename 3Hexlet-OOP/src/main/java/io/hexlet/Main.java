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
//        var u1 = new User("Igor", "Mon");
//        var u2 = u1;
//        u2.firstName = "Nina";
//        System.out.println(u1.firstName);
        var u = new User("Igor", "Mon");
        UserController.replaceName(u, "Nina");
        System.out.println(u.firstName);

    }
//№_6
//№_7
//№_8
//№_9
//№_10
//№_11

}

//№_
//№_
//№_
//№_
//№_