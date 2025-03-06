package io.hexlet.moduls;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Objects;



@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private String firstName;
    private int age;
    private String email;




//    public User(String firstName, int age) {
//        this.firstName = firstName;
//        this.age = age;
//    }

//    @Override
//    // Должен работать для любых объектов, которые передаются во внутрь
//    // поэтому тип входного параметра Object
//    public boolean equals(Object obj) {
//        // Если объект сравнивается сам с собой
//        if (this == obj) {
//            return true;
//        }
//        // Проверяем что объект того же класса
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        // Приводим тип к нужному, в данном случае User
//        User person = (User) obj;
//        // Сравниваем нужные поля
//        return firstName.equals(person.firstName) && age == person.age;
//    }
//// Если переопределяется equals(), то должен переопределяться hashCode().
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, age);
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "User [ name = " + getFirstName() + " " + getAge() + " ]";
//    }


}
