package hexlet.code.objOrientedDesign3;

public class Singleton {
    // Инстанс класса
    private static Singleton instance;
    // Приватный конструктор
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // Другие методы класса
}

//Singleton::getInstance();
