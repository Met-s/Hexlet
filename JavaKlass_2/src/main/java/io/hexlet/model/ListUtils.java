package io.hexlet.model;

import java.util.ArrayList;
import java.util.List;


public class ListUtils<T> {

    public List<T> merge(List<T> value, List<T> ar2) {
        var result = new ArrayList<>(value);
        result.addAll(ar2);

        return result;
    }
}
