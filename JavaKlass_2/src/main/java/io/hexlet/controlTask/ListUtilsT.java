package io.hexlet.controlTask;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ListUtilsT {
    public static List<?> uniq(List<?> list) {
        List<?> result =
                new ArrayList<>(new LinkedHashSet<>(list));

        return result;
    }
}
