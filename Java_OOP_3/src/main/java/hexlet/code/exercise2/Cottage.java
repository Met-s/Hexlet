package hexlet.code.exercise2;

public class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }


    @Override
    public double getArea() {

        return area;
    }

    @Override
    public int compareTo(Home home) {

        return Double.compare(getArea(), home.getArea());
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
