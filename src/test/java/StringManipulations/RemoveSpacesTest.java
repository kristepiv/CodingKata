package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSpacesTest {
    RemoveSpaces removeSpaces = new RemoveSpaces();
    @Test
    void removeSpaces() {
        assertEquals("helloworld", removeSpaces.removeSpace("hello world"));
    }

}