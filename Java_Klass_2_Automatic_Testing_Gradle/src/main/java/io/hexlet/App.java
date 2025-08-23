package io.hexlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


import static io.hexlet.module.Methods_46.add;
import static io.hexlet.module.Methods_48.indexOf;
import static io.hexlet.module.Methods_49.fill;
import static io.hexlet.module.Methods_50.toHtmlList;
import static io.hexlet.testsAutomaticTesting.Methods_2.slice;

import io.hexlet.testsAutomaticTesting.Book_5;
import io.hexlet.testsAutomaticTesting.Formatters_4;
import io.hexlet.testsAutomaticTesting.User;
import net.datafaker.Faker;
import static io.hexlet.testsAutomaticTesting.Methods_3.generatePassword;
import static io.hexlet.testsAutomaticTesting.TestUtils_3.containsUpperCase;

import static io.hexlet.testsAutomaticTesting.Libraries_5.makeLibrary;




public class App {
    public static void main(String[] args) throws Exception {
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

//        List<Integer> coll = Arrays.asList(1, 2, 3, 4, 5, 6);

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
//        List<Integer> result = Arrays.asList(1, 2, 3, 4);

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
//        var cart = makeCart();

//        var car = new Good_47("car", 3);
//        var house = new Good_47("house", 10);
//
//        cart.addItem(car, 5);
//        cart.addItem(house, 2);
//
//        cart.getItems().size();
//        cart.getCost();
//        cart.getCount();
/**
 *  ###_____ Задание ____###
 *      №_48
 */
//        var coll = List.of(1, 2, 3, 2, 5);

//        var result = indexOf(coll, 2, 2); // 3
//        var result1 = indexOf(coll, 0,-3); // -1]]
//        var result2 = indexOf(coll, 2, -2); // 3
//        var result3 = indexOf(coll, 5); // 4
//        var result4 = indexOf(coll, 7); // -1

//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
/**
 *  ###_____ Задание ____###
 *      №_49
 */
//        var coll = Arrays.asList("a", "b", "c", "d");
//        fill(coll, "*", 1, 3);
//
//        System.out.println(coll);
/**
 *  ###_____ Страница модуля ____###
 *  Фикстуры
 *  Fixture
 */
//        String example = "<a href=\"/users/6\">Улугбек Туйчиев</a></div></div></div></div></div>";
//        String result = example.substring(example.lastIndexOf("href=") + 5,
//                example.lastIndexOf("\">"));
//        System.out.println(result);
/**
 *  ###_____ Задание ____###
 *      №_50
 */
//        var html1 = toHtmlList("/path/to/yaml/file");
//        var html2 = toHtmlList("path/to/json/file"); // работает этот путь

//        var html = toHtmlList("src/test/resources/fixtures/list.yaml");
//        System.out.println(html);
/**
 *  ###_____ испытания Автоматическое Тестирование ____###
 *   ###_____ Задание ____###
 *   №_1
 */
//        Faker faker = new Faker();
////        String name = faker.name().fullName();
//        String firstName = faker.name().firstName();
//        String lastName = faker.name().lastName();
//        String email = faker.internet().emailAddress();
//
//        List<User> users = new ArrayList<>();
//
//        int i = 0;
//        while (i < 15) {
//            users.add(new User(firstName, lastName, email));
//            i++;
//        }
//
//        System.out.println(users);
/**
 * ###_____ Задание ____###
 * №_2
  */
//        var number = List.of(1, 2, 3, 4, 5);
//        var numZero = List.of();
//
//        var slice1 = slice(number, 1, 4);
//        System.out.println(slice1);//=> [2, 3, 4]
//
//        var slice2 = slice(number, -4, -2);
//        System.out.println(slice2);//=> [2, 3]
//
//        var slice3 = slice(number, -8, 8);
//        System.out.println(slice3); //=> [1, 2, 3, 4, 5]
//
//        var slice4 = slice(numZero, 8, 8);
//        System.out.println(slice4);
/**
 * ###_____ Задание ____###
 * №_3
 */
//        var password = generatePassword(5, true, true, true);
//        var password2 = generatePassword(6, true, false, false);
//        var password3 = generatePassword();
//        System.out.println(password);//=> V0#j~
//        System.out.println(password2);//=> VjwWHw
//        System.out.println(password3);//=> gajkz
//
//        System.out.println(containsUpperCase(password));
/**
 * ###_____ Задание ____###
 * №_4
 */
//        var coll = List.of("apple", "lemon", "pear");
//
//        var json = Formatters_4.format(coll, "json");
//        var yml = Formatters_4.format(coll, "yml");
//
//        System.out.println(json);
//        System.out.println(yml);
/**
 * ###_____ Задание ____###
 * №_5
 */
//        var library = makeLibrary();
//        library.addBook(new Book_5("Law Abiding Citizen",
//                "Lawton MacParlan"));
//        library.addBook(new Book_5("Aliens", "Tye Brighouse"));
//
//        var result = library.findBook("Aliens"); //=> Book_5(title=Aliens, author=Tye Brighouse)
//        System.out.println(result);
//
//        // Книга с таким названием существует
////        library.addBook(new Book_5("Aliens", "Tye Brighouse")); //=> UnsupportedOperationException
//
//        library.removeBook("Aliens"); //=> true
//        var result1 = library.findBook("Aliens"); //=> null
//        System.out.println(result1);

        // Такой книги нет
//        library.removeBook("Not existed"); //=> NoSuchElementException
//        Exception in thread "main" java.util.NoSuchElementException








    }



}

/**
 *  ###_____ Задание ____###
 *      №_49
 */
