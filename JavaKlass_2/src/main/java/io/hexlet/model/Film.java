package io.hexlet.model;

import lombok.*;
import java.util.List;

//@NoArgsConstructor
//@EqualsAndHashCode(exclude = {"duration"}) // исключить из сравнеения на
//// уровне класса
//@Getter
//@Setter
//@AllArgsConstructor
//public class Film {
/**
*      №_4
*/
////    private String title;
////    private String director;
////    private int produced;
////    private String genre;
////    private String[] actors;
////    private int duration;
//}
/**
 *      №_37
 */
@Getter
@AllArgsConstructor
public final class Film {
    private String name;
    private List<String> genres;
}

