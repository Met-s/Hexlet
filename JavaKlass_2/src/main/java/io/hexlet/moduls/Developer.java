package io.hexlet.moduls;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Developer {
    private Integer id;
    private String name;
    private Integer age;
    private Integer salary;

}
