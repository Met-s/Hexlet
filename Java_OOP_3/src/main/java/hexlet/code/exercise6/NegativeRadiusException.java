package hexlet.code.exercise6;

public class NegativeRadiusException extends Exception {
    String message;

    public NegativeRadiusException(String message) {
        super(message);
        this.message = message;
    }
}
