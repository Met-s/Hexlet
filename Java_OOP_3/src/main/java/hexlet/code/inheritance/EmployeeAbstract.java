package hexlet.code.inheritance;

import lombok.Getter;

/**
 * * Java: ООП
 *  * ###_____ Наследование ____###
 *  Абстрактные
 */
@Getter
public class EmployeeAbstract extends PersonAbstract {

    public String title;

    public EmployeeAbstract(String name, String surname, int age, String title) {

        super(name, surname, age);
        this.title =title;
    }

    public int getSalary() {
        return 2500 + getAge() + 1000;
    }
}
