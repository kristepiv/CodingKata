package Immutability;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    static ObjectMapper objectMapper = new ObjectMapper();
    @BeforeAll
    static void beforeAll(){
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

   @Test
    void testPersonImmutability() throws JsonProcessingException {

       List<String> hobbies = new ArrayList<>(Collections.singleton("run"));
       Person person = new Person(hobbies, Address.of("Oslo", "High"),
               "John");
       String initialPersonAsString = objectMapper.writeValueAsString(person);
       person.getHobbies().add("111");
        hobbies.add("aaa");
       //verify immutability
       String changedPersonAsString = objectMapper.writeValueAsString(person);
       assertEquals(initialPersonAsString, changedPersonAsString);

   }

}