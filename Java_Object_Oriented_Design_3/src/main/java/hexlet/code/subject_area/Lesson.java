package hexlet.code.subject_area;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Lesson {
    private int id;
    private String name;
    private Course course;

    public Lesson(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}
