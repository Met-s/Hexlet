package io.hexlet;
import io.hexlet.util.TextUtils;


public class App {
    public static void main(String[] args) {


        int result = TextUtils.getWordsCount("");
        int result1 = TextUtils.getWordsCount("hi");
        int result2 = TextUtils.getWordsCount("Man in black");
        int result3 = TextUtils.getWordsCount("semper sapien a libero "
                + "nam dui proin");
        int result4 = TextUtils.getWordsCount("hello, world!");
        int result5 = TextUtils.getWordsCount("  Hello, WoRlD!   ");

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
