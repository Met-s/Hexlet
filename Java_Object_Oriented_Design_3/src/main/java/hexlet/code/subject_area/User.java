package hexlet.code.subject_area;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 Java: Объектно-ориентированный дизайн
 ###_____ Связь многие ко многим ____###
 //№_4
 */
@Setter
@Getter
public class User {
    private String name;
    private List<CourseMember> courseMembers;

    public User(String name) {
        this.name = name;
        courseMembers = new ArrayList<>();
    }

    public void addCourseMember(CourseMember courseMember) {
        courseMembers.add(courseMember);
    }

    public void removeCourseMember(CourseMember courseMember) {
        courseMembers.remove(courseMember);
    }
}
