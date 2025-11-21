package hexlet.code.exercise_3;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public final class Customer {
    private String name;
    private List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }

    public void addCarRide(CarRide ride) {
        rides.add(ride);
    }

    public void removeCarRide(CarRide ride) {
        rides.remove(ride);
    }
}
