package io.hexlet.moduls;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
//    private String userName;
//    private String company;
    /**
     * ###_____ Страница модуля ____###
     *      Цепочка вызовов
     */
    private String name;
    private String department;
    private int salary;
}
