package hexlet.code.inheritance;

import lombok.Getter;

/**
 * * Java: ООП
 *  * ###_____ Наследование ____###
 *  Не Наследуемые
 */
@Getter
public class StudentFinal extends PersonFinal {

    public static final int STIP_AMOUNT = 2000;
    public int semesterNumber;

    public StudentFinal(String name, String surname, int age, int semesterNumber) {
        super(name, surname, age);
        this.semesterNumber = semesterNumber;
    }

    public int getSalary() {
        return STIP_AMOUNT;
    }


}
