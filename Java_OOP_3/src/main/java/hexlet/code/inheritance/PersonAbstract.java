package hexlet.code.inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * * Java: ООП
 *  * ###_____ Наследование ____###
 *  Абстрактные
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class PersonAbstract {
    private String name;
    private String surname;
    private int age;

    public abstract int getSalary();
}
