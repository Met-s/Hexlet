package hexlet.code.exercise6;



import static java.lang.Math.PI;

public class Circle {
    private int radius;
    Point center;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() throws NegativeRadiusException {

        if (this.radius < 0) {
            throw new NegativeRadiusException("Radius cannot be negative");
        }
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {

        return PI * getRadius() * getRadius();
    }
}
