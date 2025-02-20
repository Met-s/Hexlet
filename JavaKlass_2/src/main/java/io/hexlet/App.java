package io.hexlet;
import io.hexlet.util.TextUtils;

import javax.print.attribute.standard.RequestingUserName;
import io.hexlet.moduls.User;
import io.hexlet.model.Book;



public class App {
    public static void main(String[] args) {
// №_1
//        int result2 = TextUtils.getWordsCount("  Hello, WoRlD!   ");
//        System.out.println(result2);
//------

//        var user = new User("Mike");
//        System.out.println(user);
//        Object obj = new User("Nina");
//        System.out.println(obj);
// №_2
//        var book = new Book("First Folio", "William Shakespeare", 1623);
//        System.out.println(book);
//------
        var u1 = new User("Mike", 22);
        var u2 = new User("Mike", 22);
        boolean b = u1.equals(u2);
        System.out.println(b);
        System.out.println(u1);

    }
}






// №_3
// №_4
// №_5
// №_6
// №_7
// №_8
// №_9
// №_10
// №_