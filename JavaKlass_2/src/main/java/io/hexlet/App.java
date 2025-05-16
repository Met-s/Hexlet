package io.hexlet;

//import org.apache.commons.collections4.CollectionUtils;
//import io.hexlet.dto.CustomerDTO;
//import io.hexlet.model.*;
//import io.hexlet.moduls.Employee;
//import io.hexlet.moduls.OrderDTO;
//import io.hexlet.moduls.Post;
//import io.hexlet.util.TextUtils;
//import javax.print.attribute.standard.RequestingUserName;
//import io.hexlet.moduls.User;
//import java.util.ArrayList;
//import java.util.Arrays;
//import io.hexlet.util.Change;
//import java.util.ArrayList;
//import java.util.List;
//import static org.assertj.core.api.Assertions.assertThat;

//import java.util.*;

import io.hexlet.model.Methods;
import io.hexlet.testModel.MethodsTest;
import io.hexlet.testUtils.StringUtils;
import io.hexlet.testUtils.StringUtilsTest;
import org.apache.commons.lang3.ArrayUtils;


import java.util.*;
import java.util.stream.Collectors;


//import io.hexlet.controlTask.Converter.convert;

public class App {
    /**
     * ###_____ Страница модуля код из видеоролика ____###
     * 3_Лямбда-выражения в Java
     * ###_____ Примеры ____###
     */
//    public static final List<Developer> developers = new ArrayList<>();
//    static {
//        developers.add(new Developer(1, "Sasha", 18, 45000));
//        developers.add(new Developer(2, "Misha", 27, 65000));
//        developers.add(new Developer(3, "Alex", 24, 95000));
//        developers.add(new Developer(4, "Evgeny", 30, 78000));
//    }


    public static void main(String[] args) throws Exception {

/**
 * №_1
 */
//        int result2 = TextUtils.getWordsCount("  Hello, WoRlD!   ");
//        System.out.println(result2);
//------

//        var user = new User("Mike");
//        System.out.println(user);
//        Object obj = new User("Nina");
//        System.out.println(obj);
/**
 * №_2
 */
//        var book = new Book("First Folio", "William Shakespeare", 1623);
//        System.out.println(book);
//------
//        var u1 = new User("Mike", 22);
//        var u2 = new User("Mike", 22);
//        boolean b = u1.equals(u2);
//        System.out.println(b);
//        System.out.println(u1);
/**
 * №_3
 */
//        var car = new Car("Lotus", "Exige", 2006);
//        var car1 = new Car("Lotus", "Exige", 2006);
//        Car[] cars = {
//                new Car("Aston Martin", "V8 Vantage", 2011),
//                new Car("Ford", "VWindstar", 1998),
//                new Car("Lotus", "Exige", 2006)
//        };
//        boolean result = car.equals(car1);
//        System.out.println(result);
//        boolean result1 = App.contains(cars, car);
//        System.out.println(result1);
/**
 * №_3.1
 */
//    public static boolean contains(Car[] cars, Car car ) {
//        int length = cars.length;
//        for (int i = 0; i < length; i++) {
//            System.out.println(cars[i]);
//            if (cars[i].equals(car)) {
//
//                return true;
//            }
//        }
//        return false;
//    }
//------
//        var post = new User("Frenk", 25, "debian@set.ve");
//        System.out.println(post);
/**
 * №_4
 */
//        var film = new Film(
//               "Man Who Sleeps",
//               "John Doe",
//               1998,
//               "action",
//               new String[] {"Jack Jones", "Anna S"},
//               123
//        );
//        boolean result = film.getTitle().equals("Man Who Sleeps");
//        boolean result1 = film.getActors()[0].equals("Jack Jones");
//
//        System.out.println(result);
//        System.out.println(result1);
//------
//        OrderDTO order1 = new OrderDTO(12345, "Alice Smith", 250.0);
//        OrderDTO order2 = new OrderDTO(67890, "Bob Johnson", 450.5);
//        OrderDTO order1 = new OrderDTO(12345, "Alice Smith", 250.0);
//        OrderDTO order2 = new OrderDTO(67890, "Bob Johnson", 450.5);
//
//        System.out.println("Order ID: " + order1.id());
//        System.out.println("Order ID: " + order2.id());
/**
 * №_5
 */
// CustomerDTO.java
//        var customerDTO = new CustomerDTO("Anna", "Smith", "anna@gmail.com");
//        System.out.printf("First name: %s\nLast name: %s",
//                customerDTO.getFirstName(), customerDTO.getLastName());
//------
//        var company = "Simens";
//        var employee = new Employee("Mike", company);
// Напрямую
//        var result = company.Change("LG");
//        employee.getCompany().contains("MAK");
//        var change = changeString("Win");
//        System.out.println(change);
/**
 * №_6
 */
//        var storage = new ProductsStorage(20, 50);
//
//        storage.placeProducts(20);
//        storage.takeProducts(30);
////        storage.setGoodsQuantity(40);
//        int quantity = storage.getGoodsQuantity();
//        int maxCapacity = storage.getMaxCapacity();
//        System.out.println(quantity);
//        System.out.println(maxCapacity);
/**
 * №_7
 */
//        int result = MyRandom.generate();
//        System.out.println(result);
/**
 * ###_____ ArrayList ____###
 */
//
//        var items = new ArrayList<String>();
//        items.add("Sun");
//        items.add("Mars");
//        System.out.println(items);                  //[Sun, Mars]
//        System.out.println(items.contains("Sun"));  //true
//        System.out.println(items.get(1));           // Mars
//        System.out.println(items.size());           //2
// Предположим что у нас есть класс User
//        var users = new ArrayList<User>();
//        users.add(new User(/* параметры */));
//        String e = "Stran";
//        var items = new ArrayList<String>();
//        items.add("Mars");
//        CollectionUtils.addIgnoreNull(items, e);
//        System.out.println(items);
/**
 * №_8
 */
//        var capitals = List.of("london", "berlin", "tokio");
//
//        String result = App.getOrDefault(capitals, 2, " ");
//        System.out.println(result);
/**
 * №_9
 */
//        var items = List.of(1, -2, 3, -5);
//        var result = App.replaceByZero(items);
//        System.out.println(result);
//        System.out.println(items);
/**
 * ###_____ Страница модуля ____###
 */
//
//        var users = List.of(
//                new User(LocalDate.of(1999, 1, 1)),
//                new User(LocalDate.of(2010, 5, 8)),
//                new User(LocalDate.of(2008, 10, 11))
//        );
//        var ages = new ArrayList<Integer>();
//        var currentDate = LocalDate.now();
//
//        for (var user : users) {
//            var age = Period.between(user.getBirthday(), currentDate);
//            ages.add(age.getYears());
//        }
//        System.out.println(ages);
/**
 * №_10
 */
//        var products = List.of(
//                new Product("bread", 5),
//                new Product("milk", 10),
//                new Product("fish", 30)
//        );
//        var result = App.getProductsByPrice(products, 10, 30);
//        System.out.println(result);
/**
 * ###_____ Страница модуля ____###
 */
//        var user = new UserFriends();
//        var friends = new ArrayList<UserFriends>();
//        friends.add(new UserFriends());
//        friends.add(new UserFriends());
//        user.setUserFriends(friends);
/**
 * №_11
 */
//        var books = List.of(
//                new BookS("Death on the Nile", "Agatha Christie",
//                        "Detective"),
//                new BookS("Murder on the Orient Express", "Agatha Christie"
//                        , "Detective"),
//                new BookS("The Raven", "Edgar Allan Poe", "Poem")
//        );
//        int result = App.countBooks(books, "Agatha Christie", "Detective");
//        System.out.println(result);
/**
 * №_12
 */
//        var user1 = new User("John");
//        user1.addFriend(new User("Ellery"));
//
//        var user2 = new User("Anna");
//        user2.addFriend(new User("Abey"));
//
//        var friend = new User("Jacky");
//        user1.addFriend(friend);
//        user2.addFriend(friend);
//
//        List<User> commonFriends = App.getCommonFriends(user1, user2);
//        System.out.println(commonFriends);

//        var getUser1 = user1.getFriends();
//        var getUser2 = user2.getFriends();
//
//        var result = CollectionUtils.intersection(getUser1, getUser2);
//        System.out.println(result);
/**
 * №_13
 */
//        var cars = List.of(
//                new Cars("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
//                new Cars("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
//                new Cars("Fiat", "600", LocalDate.of(1956, 1, 1))
//        );
//
//        var result = App.getCars(cars, 1960);
//        System.out.println("Res: " + result);
/**
 * №_14
 */
//        App.isBracketsBalanced("");
//        App.isBracketsBalanced("()"); // true
//        App.isBracketsBalanced("()()"); // true
//        boolean result = App.isBracketsBalanced("(()())"); // true
//        App.isBracketsBalanced("())");
//        App.isBracketsBalanced("("); // false
//        App.isBracketsBalanced("(()"); // false
//        App.isBracketsBalanced(")("); // false
//        App.isBracketsBalanced("(()()");
//        System.out.println(result);
/**
 * ###_____ Java: Maps ____###
 */
//        var codes = new HashMap<String, Integer>();
//        codes.put("usa", 2);
//        codes.put("usa", 1);
//        codes.put("france", 33);
//        codes.put("germany", 49);
//
//        System.out.println(codes);
//        System.out.println(codes.containsKey("Usa"));
//        System.out.println(codes.containsKey("usa"));
//        System.out.println(codes.containsValue(1));
//        System.out.println(codes.get("usa"));
//        System.out.println(codes.get("spain")); // null
//        System.out.println(codes.getOrDefault("spain", 1));
//        System.out.println(codes.size());
//        System.out.println(codes.isEmpty());

//        var map = Map.of("usa", 1, "england", 44);
//        var codes = new HashMap<String, Integer>(map);
//        codes.put("france", 33);
//        codes.put("germany", 49);
//        System.out.println(codes);
//
//        var name = "hexlet";
//        System.out.println(name.hashCode());
//        System.out.println(codes.hashCode());
/**
 * №_15
 */
//        var products = Map.of(
//                "Coffee", 30.0,
//                "Bread", 10.0,
//                "Milk", 20.0
//        );

//        var discounts = Map.of(
//                "Bread", 10.0,
//                "Salmon", 20.0,
//                "List", 5.0 // null
//
//        );
//        System.out.println(products.get("Coffee")); // 22.0
//        System.out.println(products.get("Papaya"));

//        var product = "Tomatoes";
//        var discounts = Map.of(
//                "Chicken", 20.0,
//                "Salmon", 10.0,
//                "Tomatoes", 50.0,
//                "Bread", 10.0
//
//        );
//        Double res = App.getPriceWithDiscount(discounts, product);
//        System.out.println(res);
/**
 * ###_____ Страница модуля ____###
 */
//        var codes = new HashMap<String, Integer>();
//        codes.put("usa", 1);
//        codes.put("france", 33);
//        codes.put("germany", 49);
//        codes.forEach((key, value) -> {
//            System.out.println("key: " + key);
//            System.out.println("value: " + value);
//        });
/**
 * №_16
 */
//        var cities = Map.of(
//                "White River", 114958,
//                "Kashmor", 210451,
//                "Oxford", 152450
//        );
//        App.getMostPopulatedCity(cities);
/**
 * ###_____ Страница модуля ____###
 */
//        var text = "one two three two one one four";
//
//        var words = text.split(" ");
//
//        var wordsFrequency = new HashMap<String, Integer>();
//        for (var word : words) {
//            //----
//            if (wordsFrequency.containsKey(word)) {
//                var count = wordsFrequency.get(word);
//                wordsFrequency.put(word, count + 1);
//            } else {
//                wordsFrequency.put(word, 1);
//            }
//            //----
//            // тоже но без условных конструкций
////            var count = wordsFrequency.getOrDefault(word, 0);
////            wordsFrequency.put(word, count + 1);
//        }
//        System.out.println(wordsFrequency);
/**
 * ###_____ Страница модуля код из видеоролика ____###
 * Создание ХешМепа
 */
//        Map<String, String> map1 = new HashMap<>();
//        Map<String, String> map2 = new HashMap<>(64);// 64 длина
//        Map<String, String> map3 = new HashMap<>(32, 0.99f);
//        Map<String, String> map4 = new HashMap<>(map3);
//        Map<String,String> map = new HashMap<>();
//        map.put("4510775676", "Linus Torvalds");
//        map.put("4510775434", "Donald Knuth");
//        map.put("4510775222", "Larry Page");
//        map.put("4510775222", "Janes Gosling");
//        map.put(null, "Anders Hejlberg");
//        map.put("4510776225", null);
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.containsKey("4510775434"));
//        System.out.println(map.containsKey(null));
//        System.out.println(map.containsKey("4510776226"));
//        map.putIfAbsent("4510776226", "Sir Tim Bernes-Lee");
//        map.putIfAbsent("4510776226", "Brian Kernigan");
//        map.remove("4510775222");
//        System.out.println(map);

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        map.forEach((key, value) -> {
//            System.out.printf("%s : %s\n", key, value);
//
//        });
//        for (Map.Entry<String,String> entry : map.entrySet()) {
//            entry.setValue(entry.getValue().concat("-1023")); // дописывает к значению
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        Map<Gamer, String> hm = new HashMap<>();
//        Gamer gamer1 = new Gamer(1L, "Dinotrex", "password");
//        Gamer gamer2 = new Gamer(1L, "Dinotrex", "password");
//
//        hm.put(gamer1, "level1");
//        hm.put(gamer2, "level2");
//        System.out.println(gamer1.hashCode());
//        System.out.println(gamer2.hashCode());
//        System.out.println(gamer1.equals(gamer2));
//        System.out.println(hm);
/**
 * №_17
 */
//        var text = "id ornare imperdiet sapien urna pretium ut volutpat sapies arcu sed augue aliquam vislo";
//        var index = App.buildIndex(text);
//        System.out.println(index);
/**
* ###_____ Java: Функции ____###
 *
 * ###_____ Страница модуля ____###
*/
//        int number = 5;
//        int result = MathUtils.factorial(number);
//        System.out.println("Factorial of " + number + " is " + result);
/**
 * №_18
 */
//        var products = Map.of(
//                "Apple", 5,
//                "Lemon", 9,
//                "Pear", 15
//        );
//        App.printBalance(products, 10);
//###_____ Страница модуля ____###
//        var langs = new ArrayList<>(List.of("ruby", "php", "python",
//                "javascript"));
////        Collections.sort(langs);
//
////        langs.sort((v1, v2) -> Integer.compare(v1.length(), v2.length()));
//        langs.sort(Comparator.comparingInt((v) -> v.length()));
//        System.out.println(langs);
/**
 * №_19
 */
//        var users = new ArrayList<>(List.of(
//                new User("Salli", LocalDate.of(1990, 12, 15)),
//                new User("Gawen", LocalDate.of(2002, 10, 23)),
//                new User("Emmalee", LocalDate.of(1992, 9, 16)),
//                new User("Stacee", LocalDate.of(1974, 10, 25)),
//                new User("Lydia", LocalDate.of(1987, 5, 10)),
//                new User("Annabal", LocalDate.of(1970, 3, 22)),
//                new User("Tymon", LocalDate.of(1960, 8, 12)),
//                new User("Evania", LocalDate.of(1973, 4, 3))
//        ));
////        var oldestUser = App.getOldest(List.of());
//        var oldestUser = App.getOldest(users);
//        System.out.println(oldestUser);
////        users.sort(Comparator.comparing(User::getBirthday));
/**
 * ###_____ Страница модуля ____###
 */
//        var words = List.of("apple", "banana", "apple",
//                "orange", "banana", "apple");
//        var wordCount = new HashMap<String, Integer>();
//
//        words.forEach((word) -> {
//            wordCount.compute(word, (key, count) -> count == null ? 1 : count + 1);
//        });
//        System.out.println(wordCount);
//---------
// import java.io.hexlet.moduls.CacheExample.java
//        CacheExample.computeExpensiveOperation();
//// import java.io.hexlet.moduls.DiscountExample.java
//        DiscountExample.main();

//        public void testCommonCase2() {
//            var coll = List.of(-23, 43, 5, 9, 0, -2, 8, 0, -12);
//            var actual = App.countNumbers(coll);
//            var expected = Map.of(
//                    "positive", 4,
//                    "negative", 3,
//                    "zero", 2
//            );
/**
 * №_20
 */
//        var numbers1 = List.of(-2, -3, 4, 3, 8, 0, 0);
//        var result1 = App.countNumbers(numbers1);
//        System.out.println(result1);
//
//        var numbers2 = List.of(-2, -3,  -2);
//        var result2 = App.countNumbers(numbers2);
//        System.out.println(result2);
//
//        var coll = List.of(-23, 43, 5, 9, 0, 0, -2, 8, -12);
//        var result3 = App.countNumbers(coll);
//        System.out.println(result3);
//###_____ Страница модуля ____###
//        Transformer upperCaseTransformer = (input) -> input.toUpperCase();
//        var result = upperCaseTransformer.apply("hello");
//        System.out.println(result);

//        var result = App.transform((input) -> input.toUpperCase(), "hello");
//        System.out.println(result);
//
//        var result3 = transform((input) -> input + ", World!", "Hello");
//        System.out.println(result3); // Hello, World!
///**
// * №_21
// */
//        BinaryOperation add = (a, b) -> a + b;
//        App.calculate(12, 5, add);
//
//        BinaryOperation sub = (a, b) -> a - b;
//        App.calculate(7, 5, sub);
/**
 * №_22
 */
//        var books = new ArrayList<>(
//                List.of(
//
//                        new Book("Moby-Dick", "Herman Melville"),
//                        new Book("The Great Gatsby", "F. Scott Fitzgerald"),
//                        new Book("Assa", "Asimov Scot"),
//                        new Book("Dubliners", "James Joyce")
//                )
//        );
//        var sortedBooks = App.sortBooks(books);
//        System.out.println(sortedBooks);
/**
 * №_23
 */
//        var words = new ArrayList<String>();
//        words.add("Java");
//        words.add("Python");
//        words.add("PHP");
//
//        var result = App.map(words, String::toUpperCase);
//        var resultLover = App.map(words, String::toLowerCase);
//        System.out.println(result);
//        System.out.println(resultLover);
// ---------
//        result.forEach(System.out::println);
//        resultLover.forEach(System.out::println);

//        words.forEach(String::toUpperCase);


//        List<String> wordsCopy = new ArrayList<>(words);
//        Function <String, String> len = String::toUpperCase;
//        Function <String, String> fen = String::toLowerCase;
//        System.out.println(len.apply(String.valueOf(wordsCopy)));
//        System.out.println(fen.apply(String.valueOf(wordsCopy)));
//        System.out.println(words);
/**
 * ###_____ Страница модуля код из видеоролика ____###
 * 3_Лямбда-выражения в Java
 */
//        DoubleNumber number = new DoubleNumber() {
//            @Override
//            public double getValue() {
//                return 3.14;
//            }
//        };
//--------
//        DoubleNumber number = () -> 3.14;
//--------
//        System.out.println(number.getValue());
//        UnaryOperator<String> op = s -> s.toUpperCase();
//        System.out.println(op.apply("Hello"));
//        UnaryOperator<Integer> op2 = i -> i * 2;
//        System.out.println(op2.apply(5));
//--------
//        Predicate<Integer> inRange = n -> n > 0 && n < 100;
//        System.out.println(inRange.test(4));
//        System.out.println(inRange.test(400));
//--------
//        Consumer<String> printS = (s) -> System.out.println(s);
//        printS.accept("Hello Hexlet!");
//--------
//        Function<String, Integer> len = (s) -> s.length();
//        System.out.println(len.apply("Drink tea"));
//--------
//        Supplier<Gamer> createGam = () -> new Gamer(1L, "Nicita", "serOwin");
//        System.out.println(createGam.get());
//--------
/**
* ###_____ Объединение предикатов ____###
*/
//        Predicate<String> empty = s -> s.isEmpty();
//        Predicate<String> nonEmpty = s -> empty.negate();
//
//        Predicate<String> containsA = s -> s.contains("a");
//        Predicate<String> nonEmptyWithA = s -> nonEmpty.and(containsA);
//
//        Predicate<String> sLength8 = s -> s.length() == 8;
//        Predicate<String> hasAOrL8 = containsA.or(sLength8);
/**
 * ###_____ Объединение функций ____###
 */
//        Function<Integer, Integer> add = i -> i + 1;
//        Function<Integer, Integer> mult = i -> i * 2;
//        Function<Integer, Integer> ops = add.andThen(mult);
//        System.out.println(ops.apply(5));
//        Function<Integer, Integer> opsCompose = add.compose(mult);
//        System.out.println(opsCompose.apply(5));
/**
 * ###_____ Ссылки на методы ____###
 */
//        Predicate<String> empty = s -> s.isEmpty();
//        Predicate<String> imptyMethodRef = String::isEmpty;
//
//        Function<String, Integer> parseFunc = Integer::parseInt;
//        System.out.println(parseFunc.apply("123"));
//
//        Consumer<Integer> printNum = System.out::println;
//        printNum.accept(Integer.valueOf(1));
//
//        Gamer dev = new Gamer(1L, "Nicita", "jfjls");
//        Supplier<String> level = dev::getNickname;
//        System.out.println(level.get());
/**
 * ###_____ Примеры ____###
 */
//        Predicate<Integer> inRange = n -> n > 0 && n < 100;
//        Predicate<Integer> isPositive = (n) -> n > 0;
//        Predicate<Integer> isEvenNum = (n) -> n % 2 == 0;
//
//        List<Integer> nums = List.of(1, 3, 5, -5, 3,
//                18, 20, 4,  -4);
//
//        List<Integer> l1 = filterNums(nums, inRange); //1051- строка с filterNums()
//        List<Integer> l2 = filterNums(nums, isPositive.negate());
//        List<Integer> l3 = filterNums(nums, isPositive.and(isEvenNum));
//
////        l3.forEach(System.out::println);
//
//        List<Developer> devs = new ArrayList<>(developers);
//        devs.sort(new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getAge().compareTo(o2.getAge());
//            }
//        });
// Лямбда
//        devs.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
//
//        devs.sort(Comparator.comparingInt(Developer::getAge));
//
//        devs.sort(Comparator.comparing(d -> d.getAge()));
//
//
//        devs.forEach(System.out::println);



/**
 * ###_____ Испытания Функции ____###
 * №_1
 */
//        var words = List.of(
//                "java", "php", "ruby", "clojure",
//                "javascript", "lua");
//
//        var parts = App.partition(words, s -> s.startsWith("j"));
//        System.out.println(parts); // => [[clojure, javascript], [java, php, ruby, lua]]
/**
 * №_2
 */
//        var words = List.of("javascript", "java", "joker", "james");
//
//        boolean result1 = (App.every(words, s -> s.startsWith("j")));
//        boolean result2 = (App.every(words, s -> s.endsWith("a")));
//        System.out.println(result1);
//        System.out.println(result2);
/**
 * №_3
 */
//        var words = List.of("java", "javascript", "php",
//                "ruby", "lisp", "lua");
//
//        var result = App.groupBy(words, s -> Integer.toString(s.length()));
//        System.out.println(result);
/**
 * №_4
 */
//        var books = List.of(
//          new Book("Anna Karenina", "Leo Tolstoy", 1890, 543),
//          new Book("Crime and Punishment", "Fyodor Dostoevsky", 1864, 231),
//          new Book("The Lord of the Rings", "J. R. R. Tolkien", 1920, 1000),
//          new Book("The Adventures of Huckleberry Finn", "Nark Twain", 1901, 120),
//          new Book("Invisible Man", "Ralph Ellison", 1920, 1000),
//          new Book("Frankenstein", "Mary Shelley", 1920, 245)
//        );
//        // Так можно получить книгу, в которой меньше всего страниц
//        var shortestBook = App.getMinValueBy(books, Book::getPagesCount);
//        System.out.println(shortestBook); // => Book(title=The Adventures of Huckleberry Finn, author=Mark Twain, published=1901, pagesCount=120)
//        // А так книгу, написанную раньше остальных
//        var oldestBook = App.getMinValueBy(books, Book::getPublished);
//        System.out.println(oldestBook); // => Book(title=Crime and Punishment, author=Fyodor Dostoevsky, published=1864, pagesCount=231)
/**
 * №_5
 */
//        System.out.println(Fibonacci.fib(1));
//        System.out.println(Fibonacci.fib(2));
//        System.out.println(Fibonacci.fib(3));
//        System.out.println(Fibonacci.fib(7));
//
//        System.out.println();
//        System.out.println(Fibonacci.fib(7));
//        Fibonacci.fib(1); // 0
//        Fibonacci.fib(2); // 1
//        Fibonacci.fib(3); // 1
//        Fibonacci.fib(7); // 8

// При повторном вызове цепочки рекурсивных вызовов не происходит
// Результат сразу берется из кеша
/**
 * ###_____ Java: Дженерики ____###
 */
//        var items = new ArrayListOfObjects();
//        items.add("Sun");
//        var value = (String) items.get(0);
/**
 * №_24
 */
//        var box = new Box("word");
//        var value = box.getValue();
//        System.out.println(value);

//        var box = new Box(10);
//        var value = box.getValue();
//        System.out.println(value);

//        var box = new Box("not a number");
//        var value = (Integer) box.getValue();
//        System.out.println(value);
/**
 * ###_____ Страница модуля ____###
 */
//        Predicate<Integer> isGreaterThanFive = number -> number > 5;
//
//        System.out.println(isGreaterThanFive.test(10));
//        System.out.println(isGreaterThanFive.test(3));
//
//        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        var filteredNumbers = numbers.stream()
//                                .filter(isGreaterThanFive)
//                                .toList();
//
//        System.out.println(filteredNumbers);
/**
 * №_25
 */
//        var numbers = new ArrayList<>(List.of(2, 3, 5));
//        var result = App.duplicate(numbers);
//        System.out.println(result);
//        System.out.println(numbers == result);
//----------
/**
 * Один параметр типа
 */
//        var point =new SimplePair<Integer>();
//        point.setLeft(10);
//        point.setRight(20);
//
//        System.out.println(point.getLeft());
//        System.out.println(point.getRight());
/**
 * Два параметра типа
 */
//        var pair = new SimplePair<String, Integer>();
//        pair.setLeft("hexlet");
//        pair.setRight(100);
//
//        System.out.println(pair.getLeft()); // hexlet
//        System.out.println(pair.getRight()); // 100
//        System.out.println();
//
//        var point = new SimplePair<>(10, 20);
//        System.out.println(point.getLeft());
//        System.out.println(point.getRight());
/**
 * №_26
 */
//        var triple = new SimpleTriple("str", 1, true);
//
//        System.out.println(triple.getLeft());
//        System.out.println(triple.getRight());
//        System.out.println(triple.getMiddle());
/**
 * №_27
 */
//        var util = new ListUtils<Integer>();
//
//        var coll1 = new ArrayList<>(List.of(1, 2, 3));
//        var coll2 = new ArrayList<>(List.of(3, 4, 5));
//
//        var result = util.merge(coll1, coll2);
//        System.out.println(result);
/**
* ###_____ Страница модуля ____###
*/
//        var pair = new SimplePair<String, String>("hexlet", "google");
//        var pair2 = pair.copy();
//
//        System.out.println(pair2.getLeft());
//        System.out.println(pair2.getRight());
//----------
//        var pair = new SimplePair<String, String>("youtube", "chatgpt");
//        var pair2 = new SimplePair<String, String>("hexlet", "google");
//
//        pair.replaceWith(pair2);
//        System.out.println(pair.getLeft());
//        System.out.println(pair.getRight());
/**
 * №_28
 */
//        var triple = new SimpleTriple("str", 1, true);
//        var reversed = triple.reverse();
//
//        System.out.println(reversed.getLeft());
//        System.out.println(reversed.getMiddle());
//        System.out.println(reversed.getRight());
//
//        var triple1 = new SimpleTriple<>(1, "s", true);
//        var triple2 = new SimpleTriple<>(1, "s", true);
//        var triple3 = new SimpleTriple<>(1, "str", true);
//
////        assertThat(triple1.isEqualTo(triple2)).isEqualTo(true);
////        assertThat(triple1.isEqualTo(triple3)).isEqulTo(false);
//
//        System.out.println((triple1.isEqualTo(triple2)));
/**
 * ###_____ Страница модуля ____###
 */
//        var value = App.identity("hexlet");
//        System.out.println(value);
//
//        var pair = PairUtils.getPair("hexlet", 100);
//        System.out.println(pair.getLeft());
//        System.out.println(pair.getRight());
/**
 * №_29
 */
//        var languages   = new ArrayList<>(List.of("java",
//                "javascript", "php", "ruby"));
//        var result = ListUtils.filter(languages, l -> l.startsWith("j"));
//        System.out.println(result);
//
//        var numbers = new ArrayList<>(List.of(1, 2, 5,
//                0, 8, 3));
//        var result1 = ListUtils.filter(numbers, n -> n > 4);
//        System.out.println(result1);
/**
 * ###_____ Страница модуля ____### */
//        var numbers = List.of(1, 2, 3, 4, 5);
//        System.out.println(average(numbers));
//        System.out.println(averageJ(numbers));
//
//        var numbersA = new ArrayList<Number>();
//        addNumbers(numbersA);
//        System.out.println(numbersA);
/**
 * №_30
 * interface Human
 * class Man
 * class Woman
 * class ListUtils
 */
//        var people = new ArrayList<>(List.of(
//                new Man("John"),
//                new Man("Jack"),
//                new Man("Charlie"),
//                new Man("Chandler")
//        ));
//        var a = ListUtils.findFirstIndex(people, "J"); //).isEqualTo(0);
//        var b = ListUtils.findFirstIndex(people, "Ja"); //).isEqualTo(1);
//        var c = ListUtils.findFirstIndex(people, "Chan"); //).isEqualTo(3);
//        var d = ListUtils.findFirstIndex(people, "F"); //).isEqualTo(-1);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
/**
 * ###_____ Испытания: Java_Дженерики ____###
 * №_1
 */
//        var fruits = new ArrayList<>(List.of("mango", "apple",
//                "lemon", "apple", "pear", "mango"));
////        "mango", "apple", "lemon", "pear"
//        var result = ListUtilsT.uniq(fruits);
//        System.out.println(result);
//        var coll = new ArrayList<>(List.of(1, 3, 7, 5, 3, 7, 5, 8));
////        1, 3, 7, 5, 8
//        var posts = new ArrayList<Post>(List.of(
//                new Post("super post", "content"),
//                new Post("another post", "content"),
//                new Post("super post", "content")
//        ));
//         new Post("super post", "content"),
//            new Post("another post", "content")
/**
 * №_2
 */
//        var stack = new Stack<String>();
//
//        stack.push("a");
//        stack.push("b");
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());
//        System.out.println(stack);
//        stack.push("b");
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.isEmpty());
/**
 * №_3
 */
//        List<Pair<String, Integer>> coll = List.of(
//                new SimplePair("a", 1),
//                new SimplePair("b", 2)
//        );
//
//        var result = PairUtils.fromPairs(coll);
//        System.out.println(result);
//
////        Map<String, Integer> data = new LinkedHashMap();
////        data.put("a", 1);
////        data.put("b", 2);
//
//        var result1 = PairUtils.toPairs(result);
//        System.out.println(result1);
/**
 * №_4
 */
//        var coll1 = List.of("a", "b", "x", "h", "o");
//        System.out.println(AppFindMax.findMax(coll1));
//
//        var coll2 = List.of(1, 2, 3, 10, 4, 5, 6);
//        System.out.println(AppFindMax.findMax(coll2));
//
//        var coll = List.of(
//                LocalDate.of(2000, 1, 1),
//                LocalDate.of(2020, 2, 12),
//                LocalDate.of(2018, 5, 3)
//        );
//        System.out.println(AppFindMax.findMax(coll));
/**
 * №_5      НЕ ЗАВЕРШЕНО
 *
 */
//        var postData = Map.of(
//                "name", "tesst post",
//                "body", "test body"
//        );
//        Function<Map<String, String>, Post> func = data -> {
//            return new Post(
//                    data.get("name"),
//                    data.get("body")
//            );
//        };
//
//        var converter =
//                new FunctionConverter<Map<String, String>, Post>(func);
//        var post = converter.convert(postData);

/**
 * ###_____ Java: Стримы ____###
 *
 * Декларативное программирование
 */
//        var fruits = new ArrayList<>(List.of("Orange", "Apple",
//                "Banana", "Grapes", "Cherry"));
//
//        fruits.sort((v1, v2) -> v1.compareTo(v2));
//        System.out.println(fruits); // [Apple, Banana, Cherry, Grapes, Orange]

//        var users = List.of(
//                new User("Alice", 22),
//                new User("Bob", 17),
//                new User("Charlie", 24),
//                new User("Diana", 16)
//        );
//
//        var names = users.stream()
//                .filter(user -> user.getAge() > 18)
//                .map(User::getName)
//                .sorted()
//                .toList();
//
//        names.forEach(System.out::println);
//
//        String[] chars = {"h", "e", "x", "l", "e", "t"};
//        var stream = Arrays.stream(chars);
/**
 * №_31
 */

//        var fruits = List.of("lemon", "apple", "banana");
//        var result = App.sortWords(fruits);
//        System.out.println(result);
/**
 * ###_____ Страница модуля ____###
 *  Отображение (map)
 */
//        var numbers = List.of(1.2, 2.5, 3.7, 4.4, 5.9);
//        // Применение стрима для округления чисел и сбора их в новый список
//        var roundedNumbers = numbers.stream()
//                .map(number -> Math.round(number))
//                // или проще через передачу ссылки
//                // .map(Math::round)
//                .toList();
//        System.out.println(roundedNumbers);// Вывод: [1, 3, 4, 4, 6]

//        var solutions = List.of("hexlet", "chatgpt", "google", "youtube");
//
//        var result1 = solutions.stream()
//                .map(solution -> solution.toUpperCase())
//                // или
//                // .map(String::toUpperCase)
//                .toList();
//        System.out.println(result1); // [HEXLET, CHATGPT, GOOGLE, YOUTUBE]
//
//        var result2 = solutions.stream()
//                .map(String::length)
//                // тоже самое что и
//                // .map(solution -> solution.length())
//                .toList();
//        System.out.println(result2);    // [6, 7, 6, 7]
/**
 * №_32
 */
//        var emails = List.of("Mark@Gmail.com", " AnnA@mail.io ", "john" +
//                "@GMAIL.com");
//        var result = App.normalize(emails);
//        System.out.println(result);
/**
 * ###_____ Страница модуля ____###
 *      Фильтрация
 */
//        var numbers = List.of(1, 2, 3, 4, 5, 6);
//
//        var evenNumbers = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .toList();
//        System.out.println(evenNumbers);// Вывод: [2, 4, 6]
/**
 * №_33
 */
//        var people = new ArrayList(
//                List.of(
//                        new Person("John", 17),
//                        new Person("Anna", 24),
//                        new Person("Alex", 35)
//                )
//        );
//
//        var names = App.getAdultUserNames(people);
//        System.out.println(names);// => [Anna, Alex]
/**
 * ###_____ Страница модуля ____###
 *      Свертка (reduce)
 */
//        var numbers = List.of(1, 2, 3, 4, 5);
//
////        var sum = numbers.stream()
////                .reduce(0, (subtotal, element) -> subtotal + element);
////                // или используя Integer.sum(subtotal, element)
////                // .reduce(0, Integer::sum);
////        System.out.println(sum); // => Вывод чисел: 15
//
//        var maxNumber = numbers.stream()
//                .reduce(numbers.get(0), (a, b) -> a > b ? a : b);
////                .reduce(Integer::max); // или так
////                .max(Integer::compareTo).get(); // или так
//
//        System.out.println(maxNumber); // 5
//        var letters = List.of("h", "e", "x", "l", "e", "t");
//        var result = letters.stream()
//                .reduce("", (result1, element) -> result1 + element);
////                .reduce("", String::concat); // или так
//        System.out.println(result);
//        var products = List.of("Laptop: 800", "Headphones: 50",
//                "Smartphone: 500", "Mouse: 20");
//        var totalPrice = products.parallelStream()
//                .reduce(0,
//                        (sum, product) -> {
//                    var parts = product.split(": ");
//                    var price = Integer.parseInt(parts[1].trim());
//                    return sum + price;
//                        },
//                        Integer::sum);
//
//        System.out.println(totalPrice);

//        var words = List.of("java", "scala", "kotlin");
//
//        var totalLength = words.stream()
//                .reduce(0L,
//                        (sum, product) -> {
//                            long length = product.length();
//                            return sum + length;
//                        },
//                        Long::sum);
/**
 * №_34
 */
//        var people = new ArrayList(
//                List.of(
//                        new Person("John", 17),
//                        new Person("Anna", 24),
//                        new Person("Alex", 57),
//                        new Person("Jun", 32)
//                )
//        );
//        var people1 = new ArrayList(
//                List.of()
//        );
//        var result1 = App.getAverageAge(people);
//        var result = App.getAverageAge(people1);
//        System.out.println(result);
//        System.out.println(result1);
/**
 * ###_____ Страница модуля ____###
 *      Цепочка вызовов
 */
//        var products = List.of("Laptop: 800", "Headphones: 50",
//                "Smartphone: 500", "Mouse: 20");
//
//        var totalPrice = products.stream()
//                .map((product) -> {
//                    var parts = product.split(": ");
//                    var price = Integer.parseInt(parts[1].trim());
//                    return price;
//                })
//                .reduce(0, Integer::sum);
//
//        System.out.println(totalPrice);
//-----
//        var numbers = List.of(1, 2, 3, 4, 5);
//        var sum = numbers.stream()
//                .filter((number) -> number < 5)
//                .reduce(0, Integer::sum);
//        System.out.println(sum);
//-----
        // Предположим, что у нас есть класс Employee
        // Параметры конструктора: имя, департамент, зарплата
//        var employees = List.of(
//                new Employee("John", "IT", 70000),
//                new Employee("Jane Smith", "IT", 75000),
//                new Employee("Mike Wilson", "Marketing", 65000)
//        );
//
//        var totalItSalary = employees
//                .stream()
//                .filter(e -> "IT".equals(e.getDepartment()))
//                .map(Employee::getSalary)
//                .reduce(0, Integer::sum);
//        System.out.println(totalItSalary); // 145000
/**
 * №_35
 */
//        var products = List.of(
//                new Product("Smartphone", "electronics", 500),
//                new Product("Laptop", "electronics", 1000),
//                new Product("Headphones", "electronics", 100),
//                new Product("Smart Watch", "electronics", 300),
//                new Product("T-Shirt", "cloth", 20),
//                new Product("Sneakers", "shoes", 100),
//                new Product("Coffee Machine", "kitchen", 200),
//                new Product("Sunglasses", "accessories", 50),
//                new Product("Book", "books", 15),
//                new Product("Gaming Console", "electronics", 400)
//        );
//        var result = App.getTotalPrice(products);
//        System.out.println(result);
/**
 * ###_____ Страница модуля ____###
 *      Стандартные методы свертки (Collectors)
 */
//        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        var count = numbers.stream().collect(Collectors.counting());
//        System.out.println(count); // => 5
//
//        var sum = numbers.stream()
//                .collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(sum); // => 15

//        var employees = List.of(
//                new Employee("John Doe", "IT", 70000),
//                new Employee("Jane Smith", "IT", 75000),
//                new Employee("Mary Johnson", "IT", 60000),
//                new Employee("Mike Wilson", "Marketing", 65000)
//        );
//
//        var total = employees.stream()
//                .collect(Collectors.summingInt(Employee::getSalary));
//        System.out.println(total);
//
//        var average = employees.stream()
//                .collect(Collectors.averagingInt(Employee::getSalary));
//        System.out.println(average);
//
//        var min = employees.stream()
//                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getSalary)));
//
//        var max = employees.stream()
//                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));

//        var list = List.of("Apple", "Banana", "Cherry");
//        var result = list.stream()
//                .collect(Collectors.joining(": ", "[", "?"));
//        System.out.println(result);

//        List<Employee> employees = Arrays.asList(
//                new Employee("John Doe", "IT", 70000),
//                new Employee("Jane Smith", "IT", 75000),
//                new Employee("Mary Johnson", "IT", 60000),
//                new Employee("Mike Wilson", "Marketing", 65000)
//        );

//        var employeesByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(employeesByDepartment);
//        employees.forEach(System.out::println);

//        var words = Arrays.asList("apple", "banana", "apple", "orange",
//                "banana", "apple");
//        var wordCounts = words.stream()
//                .collect(Collectors.groupingBy(word -> word,
//                        Collectors.counting()));
//        System.out.println(wordCounts); // => {orange=1, banana=2, apple=3}
//
//        var groups = numbers.stream()
//                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        System.out.println(groups); // => {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
/**
 * №_36
 */
//        var emails = List.of(
//                "info@yandex.ru",
//                "mk@host.com",
//                "support@hexlet.io",
//                "sergey@gmail.com",
//                "vovan@gmail.com",
//                "vovan@hotmail.com"
//        );
//        emails.forEach(System.out::println);
//        System.out.println("-------");

//        var result = App.getFreeDomainsCount(emails);
//        System.out.println(result);
/**
 * ###_____ Страница модуля ____###
 *      Выравнивание данных (Flat Map)
 */
//        var listOfLists = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5, 6),
//                List.of(7, 8, 9)
//        );
//
//        var flattenedList = listOfLists.stream()
//                .flatMap(List::stream)
//                .toList();
//        System.out.println(flattenedList);
//
//
//        try (var lines = Files.lines(Path.of("README.md"))) {
//            var res =
//                    lines.flatMap(line -> Arrays.stream(line.trim().split(
//                            "\\s+")))
//                            .map(String::toLowerCase)
//                            .collect(Collectors.groupingBy(word -> word,
//                                    Collectors.counting()));
//            System.out.println(res);
//        }
/**
 * №_37
 */
//        var films = List.of(
//                new Film("Liquid Sky", List.of("thriller", "Action")),
//                new Film("Superman", List.of("Action", "fantasy", "thriller")),
//                new Film("Norwegian Ninja", List.of("THRILLER"))
//        );
//        var result = App.getGenres(films);
//        System.out.println(result);
/**
 * ###_____ Страница модуля ____###
 *      Поиск элементов (find)
 */
//        var fruits = List.of("Apple", "Banana", "Apricot",
//                "Orange", "Avocado");
//        var maybeFruit = fruits.stream()
//                .filter(s -> s.startsWith("C"))
//                .findFirst();
//                if (maybeFruit.isPresent()) {
//                    System.out.println(maybeFruit.get());
//                } else {
//                    System.out.println("Ничего не нашли");
//                }
//        System.out.println(maybeFruit);

//        var optional = Optional.of("Hello");
//        System.out.println(optional.isPresent());
//
//        var fruit1 = maybeFruit.orElse("Strawberry");
//        System.out.println(fruit1);
//        var friot2 = maybeFruit.orElseThrow(() -> new RuntimeException("Fruit not found"));
//        System.out.println(friot2);
/**
 * №_38
 */
//        var users = new ArrayList(
//                List.of(
//                        new User(1, "John"),
//                        new User(2, "Anna"),
//                        new User(3, "Alex")
//                )
//        );
//        var user = App.findUserById(users, 1);
//        user.getName();
//
//        System.out.println(user.getName());
/**
 * №_39
 */
//        var numbers = List.of(3, -5, 6, 1, 0, -2, 10);
//        App.getSecondBiggest(numbers); // 6
//        var result = App.getSecondBiggest(numbers);
//        System.out.println(result);
/**
 * //=======================================================================
 * ###_____ Java: Автоматическое тестирование ____###
 * Причины тестирования
 */
//        var result = StringUtils.capitalize("hello"); // "Hello"
//        System.out.println(result);
//
//        System.out.println(StringUtils.capitalizeNew("hello"));
//        System.out.println(StringUtils.capitalize("how are you"));
//        System.out.println(StringUtils.capitalizeNew(""));

//        StringUtilsTest.testCapitalize();
//        StringUtilsTest.testCapitalizeZero();
//        System.out.println(StringUtils.len("hexlet"));
//        System.out.println(StringUtils.len(null));

//        if (7 != App.sum(3, 4)) {
//            throw new AssertionError("Not Summary!");
//        }
/**
 * №_40
 */
        String[] strings = {"hello", "world"};
        String result = Methods.get(strings, 0, "value");   // "world"
        String result1 = Methods.get(strings, 5, "value");   // "value"
        String result2 = Methods.get(strings, -2, "value");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        MethodsTest.testGet();


    }


//-----
/**
 * //=======================================================================
 * №_8
 */
//    public static String getOrDefault(List<String> listStr, int index,
//                                      String def) {
//        try {
//            return listStr.get(index);
//        } catch (IndexOutOfBoundsException e) {
//            return def;
//        }
//    }
/**
 * №_9
 */
//    public static List<Integer> replaceByZero(List<Integer> numbers) {
//        var newNumbers = new ArrayList<Integer>();
//        for (var number : numbers) {
//            number = (number > 0) ? number : 0;
//            newNumbers.add(number);
//        }
//        return newNumbers;
//    }
/**
 * №_10
 */
//    public static List<String> getProductsByPrice(List<Product> products,
//                                                  int minPrice, int maxPrice) {
//        var newProducts = new ArrayList<String>();
//        for (var product : products) {
//            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
//                newProducts.add(product.getTitle());
//            }
//        }
//        return newProducts;
//    }
/**
 * №_11
 */
//    public static int countBooks(List<BookS> books,
//                                          String nameAuthor, String genre) {
//        int quantityBooks = 0;
//        for (BookS book : books) {
//            if (nameAuthor.equals(book.getAuthorName()) && genre.equals(book.getGenre())) {
//                quantityBooks++;
//            }
//        }
//        return quantityBooks;
//    }
/**
 * №_12
 */
//    public static List<User> getCommonFriends(User firstUser,
//                                              User secondUser) {
//        var firstUser1 = firstUser.getFriends() ;
//        var secondUser1 = secondUser.getFriends() ;
//        var commonFriends = new ArrayList<User>();
//        commonFriends = (ArrayList<User>)
//                CollectionUtils.intersection(firstUser1, secondUser1);
//        return commonFriends;
//    }
/**
 * №_13
 */
//    public static ArrayList<String> getCars(List<Cars> cars, int year) {
//        var result = new ArrayList<String>();
//        for (var car : cars) {
//            LocalDate carYear = car.getManufacturedAt();
//            if (carYear.getYear() < year) {
//                result.add(car.toString());
//            }
//        }
//        Collections.sort(result, String.CASE_INSENSITIVE_ORDER);
//        return result;
//    }
/**
 * №_14
 */
//    public static boolean isBracketsBalanced(String input) {
//        var str = new LinkedList<String>();
//        char[] symbol = input.toCharArray();
//        if (symbol.length % 2 != 0) {
//            return false;
//        }
//        for (char s : symbol) {
//            if (s == '(') {
//                str.add("(");
//            } else {
//                str.pollLast();
//            }
//        }
//        System.out.println(str);
//        return str.isEmpty();
//    }
/**
 * ###_____ Java: Maps ____###
 * №_15
 */
//    private static Map<String, Double> products = Data.getProducts();
//
//    public static Double getPriceWithDiscount(Map<String, Double> discountProduct,
//                                              String product) {
//
//        var inProduct = products.get(product);
//        var procentDiscount = discountProduct.getOrDefault(product, 0.0);
//
//        if (inProduct == null) {
//            return inProduct;
//        }
//        var result = (inProduct - inProduct * (procentDiscount / 100));
//        return result;
//    }
/**
 * №_16
 */
//    public static String getMostPopulatedCity(Map<String, Integer> cities) {
//        String city = null;
//        var maxValue = 0;
//        var keys = cities.keySet();
//        for (var key : keys) {
//            if (maxValue < cities.get(key)) {
//                maxValue = cities.get(key);
//                city = key;
//            }
//        }
//        return city;
//    }
/**
 * №_17
 */
//    public static HashMap<Character, List<String>> buildIndex(String text) {
//        var wordsIndex = new HashMap<Character, List<String>>();
//
//        if (text.isEmpty()) {
//            return wordsIndex;
//        }
//        var words = text.split(" ");
//        for (var word : words) {
//            var first = word.charAt(0);
//
//            if (!wordsIndex.containsKey(first)) {
//                wordsIndex.put(first, new ArrayList<>());
//            }
//            if (!wordsIndex.get(first).contains(word)) {
//                wordsIndex.get(first).add(word);
//            }
//        }
//        return wordsIndex;
//    }
//
/**
* ###_____ Java: Функции ____###
*/
/**
 * №_18
 */
//    public static void printBalance(Map<String, Integer> products,
//                                      int minQuantity) {
//
//        products.forEach((key, value) -> {
//
//            if (value < minQuantity) {
//                System.out.println(key);
//            }
//        });
//    }
/**
 * №_19
 */
//    public static Object getOldest(List<User> users) {
//        LocalDate date = LocalDate.now();
//        if (users.isEmpty()) {
//            return null;
//        }
//        final User[] userMin = {users.getFirst()};
//        users.forEach((user) -> {
//            int userMinAge = date.compareTo(userMin[0].getBirthday());
//            int userAge = date.compareTo(user.getBirthday());
//            if (userMinAge < userAge) {
//                userMin[0] = user;
//            }
//        });
//        return userMin[0];
//    }
////        users.sort(Comparator.comparing(User::getBirthday));
/**
 * №_20
 */
//var words = List.of("apple", "banana", "apple",
//        "orange", "banana", "apple");
//    var wordCount = new HashMap<String, Integer>();
//
//        words.forEach((word) -> {
//        wordCount.compute(word, (key, count) -> count == null ? 1 : count + 1);
//    });
//        System.out.println(wordCount);

//    public static HashMap<String, Integer> countNumbers(List<Integer> numbers) {
//
//       var result = new HashMap<String, Integer>(Map.of(
//                "positive", 0,
//                "negative", 0,
//                "zero", 0
//        ));
//
//        numbers.forEach((number) -> {
//            if (number > 0) {
//                result.computeIfPresent("positive", (key, value) -> value + 1);
//            }
//            if (number < 0) {
//                result.computeIfPresent("negative", (key, value) -> value + 1);
//            }
//            if (number == 0) {
//                result.computeIfPresent("zero", (key, value) -> value + 1);
//            }
//                });
//        return result;
//    }
//###_____ Страница модуля ____###
//    @FunctionalInterface
//    public interface Transformer {
//    // Имя метода может быть любым
//    // Количество параметров может быть любым
//        String apply(String input);
//    }
//    // Метод, который принимает лямбду как параметр
//    public static String transform(Transformer fn, String param) {
//        return fn.apply(param);
//    }
/**
 * №_21
 */
//    public static int calculate(int a, int b, BinaryOperation fn) {
//        int result = fn.binary(a, b);
//        System.out.println(result);
//        return result;
//    }
/**
 * №_22
 */
//    public static List<Book> sortBooks(List<Book> books) {
//
//        var sortBooks = new ArrayList<>(books);
//        sortBooks.sort(Comparator.comparing(Book::getTitle,
//                Comparator.reverseOrder()));
//
//        return sortBooks;
//    }
/**
 * №_23
 */
//    public static List<String> map(List<String> str,
//                                        Function<String, String> fn) {
//        var result = new ArrayList<String>(str.size());
//
//        str.forEach(s -> result.add(fn.apply(s)));
//
//        return result;
//    }
/**
* ###_____ Страница модуля код из видеоролика ____###
* 3_Лямбда-выражения в Java
* ###_____ Примеры ____###
*/
//    public static List<Integer> filterNums(List<Integer> nums,
//                                           Predicate<Integer> pr) {
//        List<Integer> result = new ArrayList<>();
//        for (Integer n : nums) {
//            if (pr.test(n)) {
//                result.add(n);
//            }
//        }
//        return result;
//    }
/**
 * ###_____ Испытания Функции ____###
 * №_1
 */
//    public static List<List<String>> partition(List<String> words,
//                                         Predicate<String> condition) {
//        var wordList = new ArrayList<List<String>>();
//        var firstList = new ArrayList<String>();
//        var secondList = new ArrayList<String>();
//        for (String word : words) {
//           if (condition.test(word)) {
//               firstList.add(word);
//           } else {
//               secondList.add(word);
//           }
//
//        }
//        wordList.add(firstList);
//        wordList.add(secondList);
//
//        return wordList;
//    }
/**
 * №_2
 */
//    public static boolean every(List<String> words,
//                                Predicate<String> condition) {
//        int result = 0;
//        for (String word : words) {
//            if (condition.test(word)) {
//                result += 1;
//            }
//        }
//        if (words.size() == result) {
//            return true;
//        }
//
//        return false;
//    }
/**
 * №_3
 */
//    public static Map<String, List<String>> groupBy(List<String> words,
//                               Function<String, String> func) {
//        var result = new HashMap<String, List<String>>();
//        for (String word : words) {
//            String i = func.apply(word);
//            var list = result.getOrDefault(i, new ArrayList<>());
//            list.add(word);
//            result.put(i, list);
//        }
//        return result;
//    }
/**
 * ###_____ Решение Учителя ____###
  */
//    public static Map<String, List<String>> groupBy(List<String> coll, Function<String, String> fn) {
//        var result = new HashMap<String, List<String>>();
//
//        coll.forEach((item) -> {
//            var key = fn.apply(item);
//
//            result.compute(key, (k, wordsGroup) -> {
//                wordsGroup = wordsGroup == null ? new ArrayList<>() : wordsGroup;
//                wordsGroup.add(item);
//                return wordsGroup;
//            });
//        });
//
//        return result;
//    }
/**
 * №_4
 */
//    public static Book getMinValueBy(List<Book> books, Function<Book,
//            Integer> fn) {
//
//        var booksCopy = new ArrayList<Book>(books);
//        booksCopy.sort(Comparator.comparing(fn));
//
//        return booksCopy.getFirst();
//    }
//-----------
/**
 * ###_____ Java: Дженерики ____###
 * №_25
 */
//    public static List<Integer> duplicate(List<Integer> numbers) {
//
//        var result = new ArrayList<Integer>();
//        UnaryOperator<Integer> mult = n -> n * 2;
//        numbers.forEach(n -> result.add(mult.apply(n)));
//
//        return result;
//    }
/**
 * ###_____ Страница модуля ____###
 */
//    public static <T> T identity(T value) {
//        return value;
//    }
/**
* ###_____ Java: Стримы ____###
 *
 * №_31
*/
//    public static List<String> sortWords(List<String> list) {
//        var listSort = list.stream()
//                .sorted()
//                .toList();
//
//        return listSort;
//    }
/**
* №_32
*/
//    public static List<String> normalize(List<String> emails) {
//        var result = emails.stream()
//                .map(String::trim)
//                .map(String::toLowerCase)
//                .toList();
//        return result;
//    }
/**
 * №_33
 */
//    public static List<String> getAdultUserNames(List<Person> people) {
//
//        var result = people.stream()
//                .filter(person -> person.getAge() >= 18)
//                .map(Person::getName)
//                .toList();
//        return result;
//    }
/**
 * №_34
 */
//    public static Double getAverageAge(List<Person> people) {
//
//        if (people.isEmpty()) {
//            return null;
//        }
//
//        var totalAge = people.stream()
//                .reduce(
//                        0.0,
//                        (sum, person) -> {
//                            var age = person.getAge();
//                            return sum + age;
//                        },
//                        Double::sum
//                );
//
//        return totalAge;

//         var result = people.stream()
//                .reduce(0, (sum, person) -> {
//                     Integer age = person.getAge();
//                     sum += age;
//
//                     return sum;
//                },
//                 Integer::sum);
//
//        return result.doubleValue() / people.size();
//    }
/**
 * №_35
 */
//    public static Integer getTotalPrice(List<Product> products) {
////        var totalCost = products.stream()
////                .filter(p -> "electronics".equals(p.getCategory()))
////                .mapToInt(Product::getPrice).sum();
//
//        var totalCost = products.stream()
//                .filter(p -> "electronics".equals(p.getCategory()))
//                .map(Product::getPrice)
//                .reduce(0, Integer::sum);
//        return totalCost;
//    }
/**
 * №_36
 */
//    private static final List<String> FREE_DOMAINS = List.of(
//        "gmail.com",
//        "yandex.ru",
//        "hotmail.com",
//        "yahoo.com"
//    );
//    public static Map<String, Long> getFreeDomainsCount(List<String> emails) {
//
////        var emailsCopy = new ArrayList<String>();
////        emails.forEach(email -> emailsCopy.add(email.substring(email.lastIndexOf('@') + 1)));
////
////        var result = emailsCopy.stream()
////                .filter(FREE_DOMAINS::contains)
////                .collect(Collectors.groupingBy(email -> email, Collectors.counting()));
//
////        var result = emails.stream()
////                .map(email -> email.substring(email.lastIndexOf('@') + 1))
////                .toList();
////
////         return result.stream()
////                 .filter(FREE_DOMAINS::contains)
////                 .collect(Collectors.groupingBy(email -> email,
////                         Collectors.counting()));
//
//        return emails.stream()
//                .map(email -> email.split("@")[1])
//                .filter(domain -> FREE_DOMAINS.contains(domain))
//                .collect(Collectors.groupingBy(domain -> domain,
//                        Collectors.counting()));
//    }
/**
 * №_37
 */
//    public static Map<String, Long> getGenres(List<Film> films) {
//
//        return films.stream()
//                .flatMap(genre -> genre.getGenres().stream())
//                .map(String::toLowerCase)
//                .collect(Collectors.groupingBy(genre -> genre,
//                        Collectors.counting()));
//    }
/**
 * №_38
 */
//    public static User findUserById(List<User> users, long id) {
//
//        return users.stream()
//                .filter(u -> u.getId() == id)
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("User not found"));
//    }
/**
 * №_39
 */
//    public static Integer getSecondBiggest(List<Integer> numbers) {
//        if (numbers.isEmpty() || numbers.size() < 2) {
//            return null;
//        }
//        return numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList()
//                .get(1);
//    }
/**
 * //=======================================================================
 * ###_____ Java: Автоматическое тестирование ____###
 * Причины тестирования
 */
//    public static int sum(int a, int b) {
//        return a + b;
//    }
/**
 * №_40
 */


}


/**
 * №_
 */

/**
 * ###_____ Страница модуля ____###
 */
//###_____ Страница модуля ____###
// №_
