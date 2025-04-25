package io.hexlet.controlTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *###_____ Испытания Java: Дженерики ____###
 * ###_____ Задание ____###
 * //№_1
 */
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class Post {
    private String title;
    private String content;
}
