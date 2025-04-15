package io.hexlet.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;


public class ListUtils<T> {

//    public List<T> merge(List<T> value, List<T> ar2) {
//        var result = new ArrayList<>(value);
//        result.addAll(ar2);
//
//        return result;
//    }
//
//    public static <T> List<T> filter(Collection<T> coll,
//                                      Predicate<T> fn) {
//        var result = new ArrayList<T>();
//        coll.forEach(item -> {
//            if (fn.test(item)) {
//                result.add(item);
//            }
//        });
//
//        return result;
//    }

    /**
     * №_30
      * @param humans
     * @param namePrefix
     * @return
     */
    public static Integer findFirstIndex(List<? extends Human> humans,
                                             String namePrefix ) {
        for (var human : humans) {
            if (human.getName().startsWith(namePrefix)) {
                 return humans.indexOf(human);
            }
        }
        return -1;
    }


}
