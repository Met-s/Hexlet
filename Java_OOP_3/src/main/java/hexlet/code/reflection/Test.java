package hexlet.code.reflection;
/**
 * Java: ООП
 * ###_____ Рефлексия ____###
 * Reflection
 */
public class Test {
    private String value;

    private Test(String value){
        this.value = value;
    }

    public Test() {}

    public String getValue() {
        return value;
    }

    private void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return "Test{value='" + value + "'}";
    }
}
