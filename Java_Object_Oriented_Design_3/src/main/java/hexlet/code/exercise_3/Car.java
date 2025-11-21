package hexlet.code.exercise_3;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public final class Car {
    private final String model;
    private final String vin;

    private List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        rides = new ArrayList<>();
    }

    public void addCarRide(CarRide ride) {
        rides.add(ride);
    }

    public void removeCarRide(CarRide ride) {
        rides.remove(ride);
    }

}
