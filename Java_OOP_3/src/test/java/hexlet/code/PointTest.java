package hexlet.code;

import hexlet.code.exercise1.Point;
import hexlet.code.exercise1.Segment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointTest {

    @Test
    void testPoint() throws Exception {
        Point point = new Point(2, 3);
        assertEquals(point.getX(), 2);
        assertEquals(point.getY(), 3);
    }

    @Test
    void testSegment() throws Exception {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);
        Segment segment = new Segment(point1, point2);

        assertEquals(segment.getBeginPoint().toString(), point1.toString());
        assertEquals(segment.getEndPoint().toString(),point2.toString());
    }

    @Test
    void testGetMidPoint() throws Exception {
        Point point1 = new Point(-4, -4);
        Point point2 = new Point(2, 6);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        assertEquals(midPoint.getX(), -1);
        assertEquals(midPoint.getY(), 1);
//        assertThat(midPoint.getX()).isEqualTo(-1);
//        assertThat(midPoint.getY()).isEqualTo(1);
    }







}
