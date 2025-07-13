package io.hexlet.testsAutomaticTesting.implementations;

import io.hexlet.testsAutomaticTesting.User;

import java.util.List;


public class FindRight {
    public static List<User> findByName(List<User> users, String name) {
        return users.stream()
                .filter(user -> user.getFirstName().equals(name))
                .toList();
    }
}

