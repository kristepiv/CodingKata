package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharInStringTest {

    @Test
    public void isDuplicateCharInString() {
        assertTrue(DuplicateCharInString.isDuplicateCharInString("apple"));
        assertFalse(DuplicateCharInString.isDuplicateCharInString("cake"));
        assertThrows(IllegalArgumentException.class, () -> DuplicateCharInString.isDuplicateCharInString(null));
        assertThrows(IllegalArgumentException.class, () -> DuplicateCharInString.isDuplicateCharInString(null));
    }

}