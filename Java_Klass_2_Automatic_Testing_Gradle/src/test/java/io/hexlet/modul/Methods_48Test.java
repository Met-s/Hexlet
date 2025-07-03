package io.hexlet.modul;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.module.Methods_48.indexOf;
import java.util.List;

public class Methods_48Test {

    @Test
    public void testIndexOf() {
        var coll = List.of(1, 2, 3, 2, 4);
        var actual = indexOf(coll, 2, 2);
        assertEquals(3, actual);

        // BEGIN (write your solution here)
        assertEquals(-1, indexOf(List.of(), 2));
        assertEquals(-1, indexOf(List.of(), 2, 2));
        assertEquals(-1, indexOf(List.of(), 2, -1));

        assertEquals(1, indexOf(coll, 2));
        assertEquals(1, indexOf(coll,2, -9));

        assertEquals(-1, indexOf(coll, 2, -1));
        assertEquals(-1, indexOf(coll, 2, 5));
        assertEquals(-1, indexOf(coll, 5, 2));
        // END
    }
}
// indexOf(coll, 2, -2)
//\\wsl$\Ubuntu\home\admint\Hexlet\Java_Klass_2_Automatic_Testing_Gradle\build\jacocoHtml\index.html