package hexlet.code.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<int[]> getPoints() {
        List<int[]> points = new ArrayList<>();
        points.add(new int[] {x, y});
        return points;
    }
}
