package io.hexlet.model;

import lombok.*;


@NoArgsConstructor
@EqualsAndHashCode(exclude = {"duration"}) // исключить из сравнеения на
// уровне класса
@Getter
@Setter
@AllArgsConstructor
public class Film {

    private String title;
    private String director;
    private int produced;
    private String genre;
    private String[] actors;
    private int duration;
}
