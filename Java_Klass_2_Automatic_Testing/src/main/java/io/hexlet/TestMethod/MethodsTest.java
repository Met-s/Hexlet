package io.hexlet.TestMethod;

//import io.hexlet.model.Methods;
import java.util.Arrays;
import static io.hexlet.modul.Methods.take;

public class MethodsTest {

//    public static void testGet() {
//
//        String[] strings = new String[]{"hello", "world"};
//
//        if (!"hello".equals(Methods.get(strings, 0, "value"))) {
//            throw new AssertionError("Метод работает неверно!");
//        }
//
//        if (!"value".equals(Methods.get(strings, 3, "value"))) {
//            throw new AssertionError("Метод работает неверно!");
//        }
//
//        if (!"value".equals(Methods.get(strings, -1, "value"))) {
//            throw new AssertionError("Метод работает неверно!");
//        }
//        System.out.println("Все тесты пройдены!");
//    }
/**
 * ###_____ Решение Учителя ____###
 */
//    public static void testGet() {
//        String[] strings = {"zero", "one", "two", "three"};
//        var defaultValue = "value";
//
//        var actual1 = Methods.get(strings, 0, defaultValue);
//        if (!actual1.equals(strings[0])) {
//            throw new AssertionError("actual1");
//        }
//
//        var actual2 = Methods.get(strings, 2, defaultValue);
//        if (!actual2.equals(strings[2])) {
//            throw new AssertionError("actual2");
//        }
//
//        var actual3 = Methods.get(strings, 8, defaultValue);
//        if (!defaultValue.equals(actual3)) {
//            throw new AssertionError("actual3");
//        }
//
//        var actual4 = Methods.get(strings, -2, defaultValue);
//        if (!defaultValue.equals(actual4)) {
//            throw new AssertionError("actual4");
//        }
//        }


/**
* №_41
*/
    public static void testTake() {

        assert Arrays.equals(take(new int[] {1, 2, 3}, 5), new int[] {1, 2, 3}) : "AssertionError: actual1";

        assert Arrays.equals(take(new int[] {}, 2), new int[] {}) : "AssertionError: actualNul2";

        assert Arrays.equals(take(new int[] {1, 2, 3}, 0), new int[] {}) : "AssertionError: actual3";

        assert Arrays.equals(take(new int[] {1, 2, 3}, 1), new int[] {1}) : "AssertionError: actual4";

        assert Arrays.equals(take(new int[] {1, 2, 3}, -2), new int[] {}) : "AssertionError: actual5";

        assert Arrays.equals(take(null, 3), null);

    }
}
