package io.hexlet.moduls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class PairUtils {
    public static <L, R> SimplePair<L, R> getPair(L left, R right) {
        var pair = new SimplePair<>(left, right);
//        pair.setLeft(left);
//        pair.setRight(right);
        return pair;
    }
/**
 * ###_____ Испытания Java: Дженерики ____###
 * ###_____ Задание Пары ____###
 * //№_3
 */
    public static <L, R> Map<Object, Object> fromPairs(List<Pair<L, R>> pairs) {

        var result = new HashMap<>();

        pairs.forEach(pair -> result.put(pair.getLeft(), pair.getRight()));

        return result;
    }

    public static <L, R> List<Pair<L, R>> toPairs(Map<L, R> map) {
        var result = new ArrayList<Pair<L, R>>();

        map.forEach((key, value) -> result.add(getPair(key, value)));

        return result;
    }

}
