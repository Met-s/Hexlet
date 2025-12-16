package hexlet.code.pattern;

/**
 * Структурные паттерны
 * Facade (Фасад)
 */
public class Client {

    private HostingImageLoader loader;

    public void loadImage(String filePath) {
        loader.loadImage(filePath);
    }
}
