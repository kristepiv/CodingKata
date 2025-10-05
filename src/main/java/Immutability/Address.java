package Immutability;


public class Address {
    private String city;
    private String street;



    public static Address from(Address address) {
        Address copy = new Address();
        copy.city = address.getCity();
        copy.street = address.getStreet();
        return copy;
    }



    public static Address of(String city, String street) {
        Address copy = new Address();
        copy.city = city;
        copy.street = street;
        return copy;
    }


    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
