package Immutability;

import java.util.ArrayList;
import java.util.List;

public final class Person {

    private final List<String> hobbies;
    private final Address address;
    private final String name;


    public Person(List<String> hobbies, Address address, String name) {
        this.hobbies = new ArrayList<>(hobbies);
        this.address = Address.from(address);
        this.name = name;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(this.hobbies);
    }

    public Address getAddress() {
        return Address.from(address);
    }

    public String getName() {
        return name;
    }
}
