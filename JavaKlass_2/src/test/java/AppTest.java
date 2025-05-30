import io.hexlet.model.SimpleTriple;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;



//public class SimpleTest {
//
//    @Test
//    public void testNumberIsGraterThanFive() {
//        int actualNumber = 10;
//        assertThat(actualNumber);
//    }
//
//    private void assertThat(int actualNumber) {
//    }
//
//
//    @Test
//    public void testBoxWithString() {
//
//    }
//
//
//
//}

//import static org.assertj.core.api.Assertions.assertThat;
//
//public class AppTest {
//
//    @Test
//    public void testReverse1() {
//        var left = "word";
//        var middle = 1;
//        var right = 5.5;
//
//        var tr = new SimpleTriple(left, middle, right);
//        var reversed = tr.reverse();
//
//        var actualLeft = reversed.getLeft();
//        assertThat(actualLeft).isEqualTo(right);
//        assertThat(actualLeft).isInstanceOf(Double.class);
//
//        var actualMiddle = reversed.getMiddle();
//        assertThat(actualMiddle).isEqualTo(middle);
//        assertThat(actualMiddle).isInstanceOf(Integer.class);
//
//        var actualRight = reversed.getRight();
//        assertThat(actualRight).isEqualTo(left);
//        assertThat(actualRight).isInstanceOf(String.class);
//
//        assertThat(reversed).isNotSameAs(tr);
//    }
//
//    @Test
//    public void testReverse2() {
//        var left = true;
//        var middle = 'a';
//        var right = 1L;
//
//        var tr = new SimpleTriple(left, middle, right);
//        var reversed = tr.reverse();
//
//        var actualLeft = reversed.getLeft();
//        assertThat(actualLeft).isEqualTo(right);
//        assertThat(actualLeft).isInstanceOf(Long.class);
//
//        var actualMiddle = reversed.getMiddle();
//        assertThat(actualMiddle).isEqualTo(middle);
//        assertThat(actualMiddle).isInstanceOf(Character.class);
//
//        var actualRight = reversed.getRight();
//        assertThat(actualRight).isEqualTo(left);
//        assertThat(actualRight).isInstanceOf(Boolean.class);
//
//        assertThat(reversed).isNotSameAs(tr);
//    }
//
//    @Test
//    public void testEquals() {
//
//        var tr1 = new SimpleTriple<>(1, "s", true);
//        var tr2 = new SimpleTriple<>(1, "s", true);
//        var tr3 = new SimpleTriple<>(1, "str", true);
//
//        assertThat(tr1.isEqualTo(tr2)).isEqualTo(true);
//        assertThat(tr1.isEqualTo(tr3)).isEqualTo(false);
//    }
//}

