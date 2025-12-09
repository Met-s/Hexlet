package hexlet.code;

public class Car {
    // Поля
    private String name;
    private String model;
    // Конструктор
    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }
    // Методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
