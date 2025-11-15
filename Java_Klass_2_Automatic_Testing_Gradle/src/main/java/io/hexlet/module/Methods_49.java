package io.hexlet.module;

import java.util.List;


public class Methods_49 {
    public static <T> void fill(List<T> coll, T element, int begin, int end) {

        int collSize = coll.size();


        if ((begin > collSize) || (begin < 0)) {
            begin = collSize;
        }

        if (end > collSize) {
            end = collSize;
        }

        for (int i = begin; i < end; i++) {
            coll.set(i, element);
        }
    }

    public static <T> void fill(List<T> coll, T element, int begin) {

        int end = coll.size();
        if ((begin < 0) || (begin > end)) {
            begin = end;
        }
        fill(coll, element, begin, end);
    }

    public static <T> void fill(List<T> coll, T element) {

        int begin = 0;
        int end = coll.size();
        fill(coll, element, begin, end);
    }
//###_____ Решение Учителя ____###

//    public static <T> void fill(List<T> coll, T element, int begin, int end) {
//        // BEGIN
//        var collLength = coll.size();
//        var normalizedBegin = begin > collLength ? end : begin;
//        var normalizedEnd = end > collLength ? collLength : end;
//
//        for (var i = normalizedBegin; i < normalizedEnd; i++) {
//            coll.set(i, element);
//        }
//        // END
//    }
//
//    public static <T> void fill(List<T> coll, T element, int begin) {
//
//        // BEGIN
//        fill(coll, element, begin, coll.size());
//        // END
//    }
//
//    public static <T> void fill(List<T> coll, T element) {
//
//        // BEGIN
//        fill(coll, element, 0, coll.size());
//        // END
//    }
}
