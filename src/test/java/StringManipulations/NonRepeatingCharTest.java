package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonRepeatingCharTest {
    @Test
    public void findFirstNonRepeatingChar() {
        assertEquals('i', NonRepeatingChar.findFirstNonRepeatingCharacter("heheiallooa"));
        assertEquals('1', NonRepeatingChar.findFirstNonRepeatingCharacter("heheiallooai1"));
    }
}