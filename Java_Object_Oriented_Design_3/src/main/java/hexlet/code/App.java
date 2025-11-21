package hexlet.code;

import hexlet.code.exercise_2.Department;
import hexlet.code.exercise_2.Employee;
import hexlet.code.exercise_3.Car;
import hexlet.code.exercise_3.CarRide;
import hexlet.code.exercise_3.Customer;
import hexlet.code.objOrientedDesign3.Pizza1;
import hexlet.code.subject_area.Course;
import hexlet.code.subject_area.CourseMember;
import hexlet.code.subject_area.Lesson;
import hexlet.code.subject_area.User;

import java.time.LocalDate;
//import lombok.Builder;
//import lombok.Data;
//import lombok.Builder;


public class App {

// CHECKSTYLE:OFF: Javadoc comment

    public static void main(String[] args) {
//        System.out.println("Hello World!");
/**
Java: Объектно-ориентированный дизайн
###_____ Модуль Билдер (Builder) ____###
//№_1
*/

//        var car = new Car();
//        car.setModel("Mustang");
//        car.setEngine("3.6");
//        car.setInterior("Leather");
//        car.setHasSunroof(true);
//        car.setColor("Silver Metallic");
//
//        System.out.println(car);
//---------------------------------
//        var car = Car.builder()
//                .model("Mustang")
//                .engine("3.6")
//                .interior("Leather")
//                .hasSunroof(true)
//                .color("Silver Metallic")
//                .build();
//
//        System.out.println(car.toString());
//---------------------------------
//        var pizza = App.getPizza();
//
//        var size = pizza.notify();
//        var size = pizza.getSize();
//
//        System.out.println(pizza.getClass());
//        System.out.println(size);
/**
 Java: Объектно-ориентированный дизайн
 ###_____ Моделирование предметной области ____###
 //№_2
 */
//        var course = new Course("Java ООП");
////        course.getLessons().add(new Lesson("Builder", course));
//        course.getLessons().add(new Lesson("Singleton", course));
//
////        course.forEach(System.out::println);
//        for (var lesson : course.getLessons()) {
//            System.out.println(lesson.getName());
//        }
//        var course = new Course("Java ООП");
//        // Добавление
//        var lesson = new Lesson("Builder", course);
//        course.getLessons().add(lesson);
//
//        // Удаление
////        course.getLessons().remove(lesson);
//        lesson.setCourse(null);

//        var course = new Course("Java ООП");
//        var lesson = new Lesson("Builder");
//
//        course.addLesson(lesson);
//        course.addLesson(new Lesson("Singleton"));
////        course.removeLesson(lesson);
//
//        for (var lesson1 : course.getLessons()) {
//            System.out.println(lesson1.getName());
//        }
//
//        System.out.println(course.getName());
/**
###_____ Задачка. Как бы вы реализовали указание порядка уроков в курсе? ____###
*/
//        var course = new Course("Java Hexlet");
//
//        course.addLesson(new Lesson(1,"Builder"));
//        course.addLesson(new Lesson(2,"Java"));
//        course.addLesson(new Lesson(3,"XML"));
//
//
//        for (var lesson : course.getLessons()) {
//            System.out.println(lesson.getId() + " " + lesson.getName());
//        }
/**
 Java: Объектно-ориентированный дизайн
 ###_____ Связь многие ко многим ____###
 //№_3
 */
//        var course = new Course("Java ООП");
//        var user = new User("Mila");
//
//        var member = new CourseMember();
//        member.setCourse(course);
//        member.setUser(user);
//        member.setStartedAt(LocalDate.now());
//
//        System.out.println("Cours Name: " + member.getCourse().getName()
//                + "\nStudent Name: " + member.getUser().getName()
//                + "\nStarted At: " + member.getStartedAt());















/**
 Java: Объектно-ориентированный дизайн
 ###_____ Задание ____###
 //№_2
 */
//        var department = new Department("construction");
//        var employee = new Employee("Mike Arts", "architect");
//        department.addEmployee(employee);
//        department.removeEmployee(employee);
/**
 Java: Объектно-ориентированный дизайн
 ###_____ Задание ____###
 //№_3
 */
        var car = new Car("audi a4", "1FTEX1E81AF746863");
        var customer = new Customer("Ann");

        var ride = App.getRide(customer, car);

        System.out.println("Customer Name: " + ride.getCustomer().getName()
                + "\nCar Model: " + ride.getCar().getModel()
                + "\nCar Vin: " + ride.getCar().getVin()
                + "\nCar Ride Started At" + ride.getStartedAt());









    }
/**
Java: Объектно-ориентированный дизайн
###_____ Модуль Билдер (Builder) ____###
№_1
*/
//    public static Pizza1 getPizza() {
//
//        var margarita = Pizza1.builder()
//
//                .size("big")
//                .dough("thin")
//                .cheeseTopping("mozzarella")
//                .sauce("tomato")
//                .vegetableTopping("basil")
//                .build();
//
//        return margarita;
//    }

/**
 Java: Объектно-ориентированный дизайн
 ###_____ Задание ____###
 //№_3
 */
    public static CarRide getRide(Customer customer, Car car) {
        var carRide = new CarRide();
        carRide.setCustomer(customer);
        carRide.setCar(car);
        carRide.setStartedAt(LocalDate.now());

        customer.addCarRide(carRide);
        car.addCarRide(carRide);

        return carRide;
    }

//        var course = new Course("Java ООП");
//        var user = new User("Mila");
//
//        var member = new CourseMember();
//        member.setCourse(course);
//        member.setUser(user);
//        member.setStartedAt(LocalDate.now());


}


/**
 АвтоТесты: JUnit
 ###_____ Задание ____###
 //№_
 */

//---------------------------------
// CHECKSTYLE:ON: Javadoc comment
