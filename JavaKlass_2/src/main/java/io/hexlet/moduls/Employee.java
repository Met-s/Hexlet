package io.hexlet.moduls;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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
