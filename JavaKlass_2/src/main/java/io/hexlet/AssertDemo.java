package io.hexlet;
import io.hexlet.model.Methods;
import java.util.Arrays;


public class AssertDemo {
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4};

            var actual1 = Methods.take(numbers, 2);
            int[] n = {1, 2};
            assert Arrays.equals(n, actual1) : "AssertionError: actual1";
            System.out.println(Arrays.toString(numbers));
    }
}
