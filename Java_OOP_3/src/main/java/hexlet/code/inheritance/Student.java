package hexlet.code.inheritance;

/**
 * * Java: ООП
 *  * ###_____ Наследование ____###
 */
public class Student extends Person {

    public int semesterNumber;

    public Student(String name, String surname, int age, int semesterNumber) {

        super(name, surname, age);
        this.semesterNumber = semesterNumber;
    }
}
