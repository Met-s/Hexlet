//package io.hexlet.implementations;
//
//public class Right {
//}


package io.hexlet.implementations;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public final class Right implements Validator {

    private List<Predicate> checks = new ArrayList<>();

    public Right() {
        this.addCheck(v -> v == null || v instanceof Integer);
    }

    private void addCheck(Predicate fn) {
        checks.add(fn);
    }

    public void required() {
        this.addCheck(v -> v != null && v instanceof Integer);
    }

    public void positive() {
        this.addCheck(v -> v == null || ((int) v) > 0);
    }

    public boolean isValid(Object value) {
        for (var check : checks) {
            if (!check.test(value)) {
                return false;
            }
        }

        return true;
    }
}
