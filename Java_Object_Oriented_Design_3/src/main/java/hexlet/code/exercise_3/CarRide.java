package hexlet.code.exercise_3;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class CarRide {
    private Car car;
    private Customer customer;
    @Setter
    private LocalDate startedAt;
    @Setter
    private LocalDate finishedAt;

    public void setCar(Car car) {
        this.car = car;
        car.addCarRide(this);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.addCarRide(this);
    }
}
