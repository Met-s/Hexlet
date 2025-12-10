package hexlet.code.polymorphism;

public class Rectangle implements Shape{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        System.out.println("get Rectangle area");
        return sideA * sideB;
    }
}
