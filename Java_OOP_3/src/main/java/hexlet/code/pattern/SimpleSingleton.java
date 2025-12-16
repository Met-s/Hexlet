package hexlet.code.pattern;
/**
 * Порождающие паттерны
 * Singleton (Одиночка)
 */
public class SimpleSingleton {

    private final static SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {

        return INSTANCE;
    }
}
