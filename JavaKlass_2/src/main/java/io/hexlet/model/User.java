package io.hexlet.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 *№_12
 */
//public final class User {
//
//    private String name;
//    private List<User> friends;
//
//    public User(String name) {
//        this.name = name;
//        this.friends = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<User> getFriends() {
//        return friends;
//    }
//
//    public void addFriend(User friend) {
//        friends.add(friend);
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
//}
//    @Getter
//public class User {
//    private String name;
//    private LocalDate birthday;
//
//    public User(String name, LocalDate birthday) {
//        this.name = name;
//        this.birthday = birthday;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    @Override
//    public String toString() {
//        String all = name + " - " + birthday;
//        return all;
//
//    }
//}
/**
 *№_19
 */
//@AllArgsConstructor
//@Getter
//@EqualsAndHashCode
//@ToString
//public final class User {
//    private String name;
////    private LocalDate birthday;
//    private int age;
//}
/**
 *№_38
 */
@AllArgsConstructor
@Getter
public final class User {
    private long id;
    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public long getId() {
//        return id;
//    }


}
