package hexlet.code;

import hexlet.code.objOrientedDesign3.Pizza1;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.AfterEach;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
//    private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

//    @BeforeEach
//    public void setUp() {
//        System.setOut(new PrintStream(output));
//    }

//    @Disabled
//    @Test
//    @DisplayName("Test App.main")
//    public void testMain() {
//        App.main(null);
//        assertEquals("Hello World!",
//                output.toString(StandardCharsets.UTF_8).trim());
//    }
//    =========================================================
// № 1
    @Test
    @DisplayName("Test: Pizza With All Params")
    public void testPizzaWithAllParams() {
        var pizza = Pizza1.builder()
                .size("big")
                .dough("thin")
                .sauce("tomato")
                .vegetableTopping("pepper")
                .meatTopping("ham")
                .cheeseTopping("cheddar")
                .build();
        String size = pizza.getSize();
        String dough = pizza.getDough();
        String sauce = pizza.getSauce();
        String vegetableTopping = pizza.getVegetableTopping();
        String meatTopping = pizza.getMeatTopping();
        String cheeseTopping = pizza.getCheeseTopping();

        assertEquals(size, "big");
        assertEquals(dough, "thin");
        assertEquals(sauce, "tomato");
        assertEquals(vegetableTopping, "pepper");
        assertEquals(meatTopping, "ham");
        assertEquals(cheeseTopping, "cheddar");
    }

    @Test
    @DisplayName("Test: Pizza With Out All Params")
    public void testPizzaWithoutAllParams() {
        var pizza = Pizza1.builder()
                .size("small")
                .dough("thin")
                .sauce("tomato")
                .cheeseTopping("cheddar")
                .build();

        String size = pizza.getSize();
        String dough = pizza.getDough();
        String sauce = pizza.getSauce();
        String cheeseTopping = pizza.getCheeseTopping();


        assertEquals(size, "small");
        assertEquals(dough, "thin");
        assertEquals(sauce, "tomato");
        assertEquals(cheeseTopping, "cheddar");
    }


    @Test
    @DisplayName("Test: Test: Get App")
    public void testGetApp() {
        var pizza = App.getPizza();

        assertEquals(pizza.getSize(), "big");
        assertEquals(pizza.getDough(), "thin");
        assertEquals(pizza.getSauce(), "tomato");
        assertEquals(pizza.getVegetableTopping(), "basil");
        assertEquals(pizza.getCheeseTopping(), "mozzarella");
    }
//    =========================================================




//    @AfterEach
//    public void tearDown() {
//        System.setOut(standardOut);
//    }

}
