package hexlet.code;

import hexlet.code.exercise1.Point;
import hexlet.code.exercise1.Segment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private LocalDate now;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(output));
        now = LocalDate.now();
    }

//    @Disabled
//    @Test
//    @DisplayName("Test App.main Hello World!")
//    public void testMain() {
//        App.main(null);
//        assertEquals("Hello World!",
//                output.toString(StandardCharsets.UTF_8).trim());
//    }

    @Disabled
    @Test
    @DisplayName("Test: Exercise1 Segment")
    public void testSegment1() {
        Point point1 = new Point(4, 3);
        Point point2 = new Point(6, 1);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        assertEquals(midPoint.getX(), 5);
        assertEquals(midPoint.getY(), 2);
        assertEquals(midPoint.getX(), 4);

    }


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
