package hexlet.code.subject_area;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Course {
    private String name;
    private List<Lesson> lessons;

    public Course(String name) {
        this.name = name;
        lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        lesson.setCourse(this);
        lessons.add(lesson);
    }

    public void removeLesson(Lesson lesson) {
        lesson.setCourse(null);
        lessons.remove(lesson);
    }
}
