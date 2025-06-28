package io.hexlet.modul;

import org.junit.jupiter.api.Test;

import static io.hexlet.modul.Carts.makeCart;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CartTest_47 {
    /**
     *###_____ Решение ____###
     */
//    @Test
//    public void addItemCartTest() {
//        var cart = makeCart();
//
//        var car = new Good_47("car", 3);
//        var car2 = new Good_47("car2", 10);
//        cart.addItem(car, 2);
//        cart.addItem(car2, 1);
//
//        assertEquals(2, cart.getItems().size());
//        assertEquals(3, cart.getCount());
//        assertEquals(16, cart.getCost());
//    }
/**
 * ###_____ Решение Учителя ____###
  */
    @Test
    public void testCart() {
        var cart = makeCart();

        assertEquals(0, cart.getItems().size());

        var car = new Good_47("car", 3);
        cart.addItem(car, 5);

        assertEquals(15, cart.getCost());
        assertEquals(5, cart.getCount());

        var house = new Good_47("house", 10);
        cart.addItem(house, 2);
        assertEquals(35, cart.getCost());
        assertEquals(7, cart.getCount());
    }
}
