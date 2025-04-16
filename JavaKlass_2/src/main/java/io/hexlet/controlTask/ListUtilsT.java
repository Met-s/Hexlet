package io.hexlet.controlTask;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *###_____ Испытания Java: Дженерики ____###
 * ###_____ Задание ____###
 * //№_1
 */
public class ListUtilsT {
//    public static List<?> uniq(List<?> list) {
//        List<?> result =
//                new ArrayList<>(new LinkedHashSet<>(list));
//
//        return result;
//    }

    public static <T> List<T> uniq(List<T> elements) {
        var result = new ArrayList<T>();

        for (T element : elements) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
