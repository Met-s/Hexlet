package io.hexlet.module.implementations_48;

import java.util.List;

public class Wrong2 {
    public static <T> int indexOf(List<T> coll, T value, int fromIndex) {
        var collLength = coll.size();

        if (collLength == 0) {
            return -1;
        }

        var normalisedIndex = fromIndex;

        if (normalisedIndex < 0) {
            if (-normalisedIndex > collLength) {
                return -1;
            } else {
                normalisedIndex += collLength;
            }
        }

        var index = -1;

        for (int i = normalisedIndex; i < collLength; i++) {
            var current = coll.get(i);
            if (current.equals(value)) {
                return i;
            }
        }

        return index;
    }

    public static <T> int indexOf(List<T> coll, T value) {
        return coll.indexOf(value);
    }
}
