package io.hexlet.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ProductsStorage {
    private int goodsQuantity;
    private int maxCapacity;
// №_6
    public void placeProducts(int quantityProducts) {
        int balance = goodsQuantity + quantityProducts;

        if (balance <= maxCapacity) {
            goodsQuantity = balance;
        } else {
            System.out.println("Операция не выполнена!\n" +
                    "Количество товара превышает допустимое значение");
        }
    }

    public void takeProducts(int quantityProducts) {
        if (goodsQuantity >= quantityProducts) {
            goodsQuantity -= quantityProducts;
        } else {
            System.out.println("Операция не выполнена!\n" +
                    "Такого количества товара на складе нет.");
        }
    }
}
