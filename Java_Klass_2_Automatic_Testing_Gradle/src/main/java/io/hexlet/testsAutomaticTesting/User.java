package io.hexlet.testsAutomaticTesting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String email;
}
