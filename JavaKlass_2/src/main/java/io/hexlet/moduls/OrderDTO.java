package io.hexlet.moduls;

//public class OrderDTO {
//    private final int id;
//    private final String customerName;
//    private final double orderAmount;
//
//    public OrderDTO(int id, String customerName, double orderAmount) {
//        this.id = id;
//        this.customerName = customerName;
//        this.orderAmount = orderAmount;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public double getOrderAmount() {
//        return orderAmount;
//    }
//}
//Поэтому основным способом по-прежнему является создание обычных классов.
// И Lombok делает этот процесс достаточно простым.

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//
//@Getter
//@AllArgsConstructor
//public class OrderDTO {
//    private final int id;
//    private final String customerName;
//    private final double orderAmount;
//}

public record OrderDTO(int id, String customerName, double orderAmount) {

}








