package io.hexlet;

public class User {
//№_5
//    public String firstName;
//    public String lastName;
//
//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//№_6
    /**
     * Конструктор User (id, name)
     * Метод isEqual() сравнивает id пользователей, если одинаковые -
     * возвращает True если нет то False
     */
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public boolean isEqual(User user) {
        return User.this.id == user.id;
    }
// ###_____ Решение Учитуля ____###
//    private int id;
//    private String name;
//
//    User(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isEqual(User anotherUser) {
//        return id == anotherUser.getId();
//    }

//№_
//№_
//№_


}
