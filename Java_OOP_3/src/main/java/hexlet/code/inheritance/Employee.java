package hexlet.code.inheritance;

/**
 * * Java: ООП
 *  * ###_____ Наследование ____###
 */
public class Employee extends Person {

    public String title;

    public Employee(String name, String surname, int age, String title) {

        super (name, surname, age);
        this.title = title;
    }

    public String getName() {
        return super.getName();
    }
}
