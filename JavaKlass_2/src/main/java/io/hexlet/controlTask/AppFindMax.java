package io.hexlet.controlTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppFindMax {

//    public static <T> T findMax(List<T> obj) {
//
//        List<T> copy = new ArrayList<>(obj);
//        copy.sort(Collections.reverseOrder());
//
//        return copy.get(0);
//    }

    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
         if (list == null || list.isEmpty()) {
             return null;
         }

         T max = list.get(0);
         for (T item : list) {
             if (item.compareTo(max) > 0) {
                 max = item;
             }
         }
         return max;
    }
}
