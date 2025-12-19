package hexlet.code;

import hexlet.code.exercise6.Circle;
import hexlet.code.exercise6.NegativeRadiusException;
import hexlet.code.exercise6.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;

public class TestExercise6 {

    @Test
    @DisplayName("TestCircle")
    void testCircle() throws NegativeRadiusException {

            Circle circle = new Circle(new Point(1, 2), 10);
            int radius = circle.getRadius();
            assertEquals(10, radius);


            double square = circle.getSquare();
            assertEquals(314.1592653589793, square);
//            assertThat(square).isCloseTo(314.159, within(0.01));

            Circle circle1 = new Circle(new Point(1, 2), 0);
            double square1 = circle1.getSquare();
            assertEquals(0, square1);
    }

    @Test
    void testException() {
        Circle circle = new Circle(new Point(1, 2), -2);

        assertThatThrownBy(() -> {
            circle.getSquare();
        }).isInstanceOf(NegativeRadiusException.class);
    }

}
