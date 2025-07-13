package io.hexlet.testsAutomaticTesting.implementations;

import io.hexlet.testsAutomaticTesting.User;

import java.util.List;


public class FindWrong2 {
    public static List<User> findByName(List<User> users, String name) {
        if (users.isEmpty()) {
            return null;
        }

        return users.stream()
                .filter(user -> user.getFirstName().equals(name))
                .toList();
    }
}

