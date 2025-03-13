package io.hexlet.model;

import java.time.LocalDate;

//№_13
public final class Cars {
    private String made;
    private String model;
    private LocalDate manufacturedAt;

    public Cars(String made, String model, LocalDate manufacturedAt) {
        this.made = made;
        this.model = model;
        this.manufacturedAt = manufacturedAt;
    }

    public String getMade() {
        return made;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getManufacturedAt() {
        return manufacturedAt;
    }

    @Override
    public String toString() {
        return made + " " + model;
    }

}
