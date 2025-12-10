package hexlet.code.polymorphism;

public class Square implements Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        System.out.println("get square area");
        return side * side;
    }
}
