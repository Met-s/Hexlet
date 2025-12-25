package hexlet.code.exercise7;

public class Address {
    // BEGIN (write your solution here)
    @NotNull
    // END
    private String country;

    // BEGIN (write your solution here)
    @NotNull
    // END
    private String city;

    // BEGIN (write your solution here)
    @NotNull
    // END
    private String street;

    // BEGIN (write your solution here)
    @NotNull
    // END
    private String houseNumber;

    private String flatNumber;

    public Address(String country, String city, String street, String houseNumber, String flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}

