package io.hexlet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

// №_5
@AllArgsConstructor
@Getter
public class CustomerDTO {
    private final String firstName;
    private final String lastName;
    private final String email;
}
