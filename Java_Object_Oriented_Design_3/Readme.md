//=================================================================================
###_____ Java: Объектно-ориентированный дизайн____###\
//=================================================================================
###_____  Билдер (Builder) ____###\
№_1 

###_____ Дополнительные материалы ____###
1. [Builder Lombok](https://projectlombok.org/features/Builder)	

###_____ Задание ____###\
№_1\
Еще один пример использования паттерна Builder — сборка собственного варианта пиццы при заказе на сайте пиццерии. Вы можете выбрать различные варианты теста, соуса, начинки. При этом не все параметры являются обязательными. Например, вегетарианский вариант не содержит мясную начинку. А кто-то, наоборот, не любит овощи

src/main/java/io/hexlet/model/Pizza.java
В файле создайте класс Pizza. Класс содержит следующие поля:
````
size — размер пиццы, строка\
dough — тип теста, строка\
sauce — соус, строка\
meatTopping — мясная начинка, строка\
vegetableTopping — овощная начинка, строка\
cheeseTopping — сорт сыра, строка
````
Сделаем класс иммутабельным. Реализуйте в классе билдер и геттеры для всех полей

src/main/java/io/hexlet/App.java\
Потренируемся в создании объекта при помощи билдера. В классе App реализуйте публичный статический метод getPizza(), который сконструирует и вернет пиццу "Маргарита" большого размера (big) на тонком тесте (thin) и сыром Моцарелла (mozzarella). Соус у пиццы томатный (tomato), а в качестве овощной начинки используем базилик (basil)
````
var pizza = App.getPizza();

pizza.getSize(); // big\
pizza.getDough(); // thin\
pizza.getSauce(); // tomato\
pizza.getVegetableTopping(); // basil\
pizza.getCheeseTopping(); // mozzarella
````
Подсказки\
Как сделать класс [иммутабельным](https://ru.hexlet.io/qna/java/questions/kak-sozdat-immutable-klass-java)

###_____ Решение ____###

class App
````
package io.hexlet;

import io.hexlet.model.Pizza;

class App {
// BEGIN
public static Pizza getPizza() {
var pizza = Pizza.builder()
.size("big")
.dough("thin")
.sauce("tomato")
.vegetableTopping("basil")
.cheeseTopping("mozzarella")
.build();

        return pizza;
    }
    // END
}
````
// ---------

class Pizza
````
package io.hexlet.model;

// BEGIN
import lombok.Getter;
import lombok.Builder;

@Builder
@Getter
public final class Pizza {
private String size;
private String dough;
private String sauce;
private String meatTopping;
private String vegetableTopping;
private String cheeseTopping;
}
// END
````
###_____ Моделирование предметной области  ____###\
связь называется один ко многим (one to many, o2m)
###_____ UML ____###
Язык моделирования [UML](https://ru.wikipedia.org/wiki/UML)	
№_2

В этом упражнении вам предстоит смоделировать предметную область нашего приложения, которое работает с кадрами в компании, ориентируясь на диаграмму классов

+---------------------+
|    Department       |
+---------------------+
| - title: String     |
| - employees: List   |
+---------------------+
| + addEmployee()     |
| + removeEmployee()  |
| + getTitle()        |
| + setTitle()        |
| + getEmployees()    |
+---------------------+
| 1
|
|
v 0..*
+--------------------------+
|        Employee          |
+--------------------------+
| - fullName: String       |
| - position: String       |
| - department: Department |
+--------------------------+
| + getFullName()          |
| + setFullName()          |
| + getPosition()          |
| + setPosition()          |
| + getDepartment()        |
| + setDepartment()        |
+--------------------------+
src/main/java/io/hexlet/model/Department.java
В файле создайте класс Department, который будет представлять собой отдел в компании. Добавьте в класс все необходимые свойства и методы, ориентируясь на диаграмму классов

src/main/java/io/hexlet/model/Employee.java
В файле создайте класс Employee, который будет представлять собой сотрудника компании. Добавьте в класс все необходимые свойства и методы

var department = new Department("construction");
var employee = new Employee("Mike Arts", "architect");
department.addEmployee(employee);
department.removeEmployee(employee);


№_2
###_____ Задание ____###

В этом упражнении вам предстоит смоделировать предметную область нашего приложения, которое работает с кадрами в компании, ориентируясь на диаграмму классов
````
+---------------------+
|    Department       |
+---------------------+
| - title: String     |
| - employees: List   |
+---------------------+
| + addEmployee()     |
| + removeEmployee()  |
| + getTitle()        |
| + setTitle()        |
| + getEmployees()    |
+---------------------+
| 1
|
|
v 0..*
+--------------------------+
|        Employee          |
+--------------------------+
| - fullName: String       |
| - position: String       |
| - department: Department |
+--------------------------+
| + getFullName()          |
| + setFullName()          |
| + getPosition()          |
| + setPosition()          |
| + getDepartment()        |
| + setDepartment()        |
+--------------------------+
````
src/main/java/io/hexlet/model/Department.java\
В файле создайте класс Department, который будет представлять собой отдел в компании. Добавьте в класс все необходимые свойства и методы, ориентируясь на диаграмму классов

src/main/java/io/hexlet/model/Employee.java\
В файле создайте класс Employee, который будет представлять собой сотрудника компании. Добавьте в класс все необходимые свойства и методы
````
var department = new Department("construction");
var employee = new Employee("Mike Arts", "architect");
department.addEmployee(employee);
department.removeEmployee(employee);
````
###_____ Решение ____###
````
// BEGIN (write your solution here)
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class Department {
private String title;
private List<Employee> employees;

    public Department(String title) {
        this.title = title;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employee.setDepartment(this);
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employee.setDepartment(null);
        employees.remove(employee);
    }
}
// END
````
````
// BEGIN (write your solution here)
import lombok.Setter;
import lombok.Getter;


@Setter
@Getter
public class Employee {
private String fullName;
private String position;
private Department department;

    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }
}
// END
````
###_____ Решение Учителя ____###
````
// BEGIN
import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class Department {

    @Setter
    private String title;

    private List<Employee> employees;

    public Department(String title) {
        this.title = title;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employee.setDepartment(this);
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employee.setDepartment(null);
        employees.remove(employee);
    }
}
// END
````
````
// BEGIN
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public final class Employee {
private String fullName;
private String position;
private Department department;

    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }
}
// END
````





//=================================================================================\
###_____ Java: Объектно-ориентированный дизайн ____###
//=================================================================================

###_____ Билдер (Builder) ____###

###_____ Решение ____###

###_____ Решение Учителя ____###

==============================================================================\
###_____ Подготовка данных ____###

###_____ Дополнительные материалы ____###
