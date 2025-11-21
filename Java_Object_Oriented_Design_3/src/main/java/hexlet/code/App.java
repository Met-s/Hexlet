package hexlet.code;

import hexlet.code.exercise_2.Department;
import hexlet.code.exercise_2.Employee;
import hexlet.code.objOrientedDesign3.Pizza1;
import hexlet.code.subject_area.Course;
import hexlet.code.subject_area.Lesson;
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
 //№_3
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
 ###_____ Задание ____###
 //№_2
 */
        var department = new Department("construction");
        var employee = new Employee("Mike Arts", "architect");
        department.addEmployee(employee);
        department.removeEmployee(employee);







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
АвтоТесты: JUnit
###_____ Задание ____###
//№_
*/

//---------------------------------
// CHECKSTYLE:ON: Javadoc comment
}
