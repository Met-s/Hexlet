//package io.hexlet.implementations;
//
//public class Validator {
//}



package io.hexlet.implementations;

public interface Validator {
    boolean isValid(Object value);
    void required();
    void positive();
}
