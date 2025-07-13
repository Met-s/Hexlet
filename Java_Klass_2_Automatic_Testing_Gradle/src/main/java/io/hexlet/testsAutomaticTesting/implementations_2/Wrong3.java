package io.hexlet.testsAutomaticTesting.implementations_2;

import java.util.List;
import java.util.ArrayList;


public class Wrong3 {

    public static <T> List<T> slice(List<T> coll, int begin, int end) {

        var collLength = coll.size();

        if (coll.isEmpty()) {
            return new ArrayList<T>();
        }

        var normalizedBegin = begin;
        var normalizedEnd = end;

        if (normalizedBegin < 0) {
            if (-normalizedBegin <= collLength) {
                return coll.stream()
                        .skip(1)
                        .limit(collLength - 1)
                        .toList();
            }
        }

        if (normalizedEnd < 0) {
            if (-normalizedEnd > collLength) {
                normalizedEnd = collLength - 1;
            } else {
                normalizedEnd += collLength;
            }
        }

        var limit = normalizedEnd - normalizedBegin > 0 ? normalizedEnd - normalizedBegin : 0;

        return coll.stream()
                .skip(normalizedBegin)
                .limit(limit)
                .toList();
    }
}
