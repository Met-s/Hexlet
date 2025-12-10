package hexlet.code.polymorphism;

public class Circle implements Shape{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
