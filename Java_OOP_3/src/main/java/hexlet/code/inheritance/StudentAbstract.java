package hexlet.code.inheritance;

import lombok.Getter;

/**
 * * Java: ООП
 *  * ###_____ Наследование ____###
 *  Абстрактные
 */
@Getter
public class StudentAbstract extends PersonAbstract {

    public int semesterNumber;
    public StudentAbstract(String name, String surname, int age, int semesterNumber) {
        super (name, surname, age);
        this.semesterNumber = semesterNumber;
    }

    public int getSalary() {
        return 2000;
    }
}
