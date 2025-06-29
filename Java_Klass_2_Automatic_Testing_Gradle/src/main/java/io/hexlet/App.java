package io.hexlet;

import io.hexlet.modul.Good_47;
import io.hexlet.modul.Methods_46;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.hexlet.modul.Carts.makeCart;
import static io.hexlet.modul.Methods_45.without;
import static io.hexlet.modul.Methods_46.add;


public class App {
    public static void main(String[] args) {
        /**
         * АвтоТесты: JUnit
         * ###_____ Задание ____###
         * //№_45
         */
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        // исключаем из исходного массива числа 2 и 3
//        var result = without(numbers, 2, 3);
//        System.out.println(Arrays.toString(result));
//
//        int[] emptyNumbers = {};
//        var result1 = without(emptyNumbers, 3, 4, 5);
//        System.out.println(Arrays.toString(result1));
//
//        int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
//        var result2 = without(withDuplicateNumbers, 2);
//        System.out.println(Arrays.toString(result2));
//
//        var result3 = without(numbers, 8);
//        System.out.println(Arrays.toString(result3));
/**
* АвтоТесты: Подготовка данных
* ###_____ Задание ____###
* //№_46
*/
//        List<Integer> coll = Arrays.asList(1, 2, 3, 4);

//        add(coll, 5);
//        System.out.println(coll);

//        add(coll, 5, 1);
//        System.out.println(coll);
//
//        add(coll, 5, 4);
//        System.out.println(coll);

        List<Integer> coll = Arrays.asList(1, 2, 3, 4, 5, 6);

//        var result = coll.add(5);
//        System.out.println(result);

// Все вызовы нужно рассматривать, как независимые
//        var result = add(coll, 5); // true
//        System.out.println(result);

//        System.out.println(coll); // => [1, 2 ,3, 4, 5]
//
//        add(coll, 5, 1); // true
//        System.out.println(coll); // => [1, 5, 2 ,3, 4]
//
//        add(coll, 5, 4); // true
//        System.out.println(coll); // => [1, 2 ,3, 4, 5]
        List<Integer> result = Arrays.asList(1, 2, 3, 4);

//        Arrays.copyOf(resul);
//
//        System.out.println(add(result, 5));
//        List<Integer> coll1 = new ArrayList<> (coll);
//        add(coll1, 5, 2);
//
//        System.out.println(coll1);
//        System.out.println(add(coll1, 5));
/**
 *  ###_____ Задание ____###
 *      №_47
 */
        // Создаём новый объект корзины
        var cart = makeCart();

//        var car = new Good_47("car", 3);
//        var house = new Good_47("house", 10);
//
//        cart.addItem(car, 5);
//        cart.addItem(house, 2);
//
//        cart.getItems().size();
//        cart.getCost();
//        cart.getCount();
        System.out.println("Cart: " + cart);




    }

}