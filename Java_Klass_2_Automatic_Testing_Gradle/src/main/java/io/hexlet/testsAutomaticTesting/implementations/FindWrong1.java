package io.hexlet.testsAutomaticTesting.implementations;

import io.hexlet.testsAutomaticTesting.User;

import java.util.List;


public class FindWrong1 {
    public static List<User> findByName(List<User> users, String name) {
        if (users.isEmpty()) {
            return List.<User>of();
        }

        return List.of(users.getFirst());
    }
}

