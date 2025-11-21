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
//=================================================================================

###_____ Связь многие ко многим ____###


###_____ Дополнительные материалы ____###

1. [Виды связи мужду классами](https://ru.wikipediaorg/wiki/Информационное_моделирование_предметных_областей#Типы_взаимосвязей_между_объектами)	

###_____ Задание ____###\
№_3

Представьте, что мы разрабатываем приложение по прокату автомобилей. В нашем приложении есть автомобили и пользователи. Автомобили связаны с пользователем связью многие-ко-многим. Пользователь может совершить поездку на множестве автомобилей. С другой стороны один автомобиль берут в прокат разные пользователи. Связь между сущностями реализована через третью сущность — поездку. Поездка содержит дополнительные данные — дату ее начала и завершения

Структура классов в нашем приложении отображена на диаграмме:
````
+-------------------+
|     Customer      |
+-------------------+
| - name: String    |
| - rides: List     |
+-------------------+
| + addRide()       |
| + getName()       |
| + setName()       |
| + getRides()      |
+-------------------+
^ 1
|
| *
+-------------------------+
|      CarRide            |
+-------------------------+
| - customer: Customer    |
| - car: Car              |
| - startedAt: LocalDate  |
| - finishedAt: LocalDate |
+-------------------------+
| + getCustomer()         |
| + setCustomer  ()       |
| + getCar()              |
| + setCar()              |
| + getStartedAt()        |
| + setStartedAt()        |
| + getFinishedAt()       |
| + setFinishedAt()       |
+-------------------------+
| *
|
v 1
+-------------------+
|       Car         |
+-------------------+
| - model: String   |
| - vin: String     |
| - rides: List     |
+-------------------+
| + addRide()       |
| + getModel()      |
| + getVin()        |
| + getRides()      |
+-------------------+
````
src/main/java/io/hexlet/model/Car.java\
В классе Car допишите необходимый метод, который будет добавлять поездку в сущность автомобиля, ориентируясь на диаграмму классов

src/main/java/io/hexlet/model/Customer.java\
В классе Customer допишите необходимый метод, который будет добавлять поездку в сущность пользователя, ориентируясь на диаграмму классов

src/main/java/io/hexlet/model/CarRide.java\
В файле создайте класс CarRide, который будет представлять собой поездку на автомобиле. Этот класс будет связывать сущности пользователя и автомобиля. Добавьте в класс все необходимые свойства и методы, ориентируясь на диаграмму классов

src/main/java/io/hexlet/App.java\
В классе App реализуйте публичный статический метод getRide(), который будет создавать новую поездку. Метод принимает два параметра:

Пользователь, который совершает поездку, объект класса Customer
Автомобиль, на котором совершается поездка, объект класса Car
Метод должен вернуть созданную поездку CarRide. В качестве даты начала поездки установите текущую дату
````
var car = new Car("audi a4", "1FTEX1E81AF746863");
var customer = new Customer("Ann");

var ride = App.getRide(customer, car);
````
Подсказки
Перед началом работы загляните в тесты

###_____ Решение ____###
````
package io.hexlet;

import io.hexlet.model.Car;
import io.hexlet.model.CarRide;
import io.hexlet.model.Customer;

import java.time.LocalDate;

class App {
// BEGIN (write your solution here)
public static CarRide getRide(Customer customer, Car car) {
var carRide = new CarRide();
carRide.setCustomer(customer);
carRide.setCar(car);
carRide.setStartedAt(LocalDate.now());

        return carRide;
    }
    // END
}
````

````
package io.hexlet.model;

import lombok.Setter;
import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

@Setter
@Getter
public final class Car {
private final String model;
private final String vin;

    private List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        rides = new ArrayList<>();
    }

    // BEGIN (write your solution here)
        public void addCarRide(CarRide ride) {
        rides.add(ride);
    }

    public void removeCarRide(CarRide ride) {
        rides.remove(ride);
    }
    // END
}
````

````
package io.hexlet.model;

// BEGIN (write your solution here)
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class CarRide {
private Car car;
private Customer customer;
@Setter
private LocalDate startedAt;
@Setter
private LocalDate finishedAt;

    public void setCar(Car car) {
        this.car = car;
        car.addCarRide(this);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.addCarRide(this);
    }
}
// END
````

````
package io.hexlet.model;



import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Customer {

    private String name;
    private List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }

    // BEGIN (write your solution here)
        public void addCarRide(CarRide ride) {
        rides.add(ride);
    }

    public void removeCarRide(CarRide ride) {
        rides.remove(ride);
    }
    // END
}
````
###_____ Решение Учителя ____###
````
package io.hexlet;

import io.hexlet.model.Car;
import io.hexlet.model.CarRide;
import io.hexlet.model.Customer;

import java.time.LocalDate;

class App {
// BEGIN
public static CarRide getRide(Customer customer, Car car) {

        var ride = new CarRide();
        ride.setCustomer(customer);
        ride.setCar(car);
        ride.setStartedAt(LocalDate.now());

        customer.addRide(ride);
        car.addRide(ride);

        return ride;
    }
    // END
}
````

````
package io.hexlet.model;


import lombok.Getter;

import java.util.List;
import java.util.ArrayList;

@Getter
public final class Car {
private final String model;
private final String vin;

    private List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        rides = new ArrayList<>();
    }

    // BEGIN
    public void addRide(CarRide ride) {
        rides.add(ride);
    }
    // END
}
````

````
package io.hexlet.model;

// BEGIN
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public final class CarRide {
private Customer customer;
private Car car;
private LocalDate startedAt;
private LocalDate finishedAt;
}
// END
````

````
package io.hexlet.model;

import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Customer {

    private String name;
    private List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }

    // BEGIN
    public void addRide(CarRide ride) {
        rides.add(ride);
    }
    // END
}
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
