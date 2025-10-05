package Immutability;

import java.util.ArrayList;
import java.util.List;

public record PersonRecord (List<String> hobbies, Address address, String name) {

    public PersonRecord(List<String> hobbies, Address address, String name) {
        this.hobbies = new ArrayList<>(hobbies);
        this.address = Address.from(address);
        this.name = name;
    }

    @Override
    public Address address() {
        return Address.from(address);
    }

    @Override
    public List<String> hobbies() {
        return new ArrayList<>(hobbies);
    }
}
