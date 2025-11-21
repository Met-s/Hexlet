package hexlet.code.exercise_2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class Department {
    private String title;
    private List<Employee> employees;

    public Department(String title) {
        this.title = title;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employee.setDepartment(this);
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employee.setDepartment(null);
        employees.remove(employee);
    }
}
