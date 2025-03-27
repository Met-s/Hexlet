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



import io.hexlet.model.BinaryOperation;


public class App {
    public static void main(String[] args) {

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




/**
 * №_21
 */
        BinaryOperation add = (a, b) -> a + b;
        App.calculate(12, 5, add);

        BinaryOperation sub = (a, b) -> a - b;
        App.calculate(7, 5, sub);




    }

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
//    @FunctionalInterface
//    public interface BinaryOperation {
//        int result(int a, int b);
//
//    }

    public static int calculate(int a, int b, BinaryOperation fn) {
        int result = fn.binary(a, b);
        System.out.println(result);
        return result;
    }



}

/**
 * №_
 */
//###_____ Страница модуля ____###
// №_
