package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsInStringTest {

    @Test
    void isStingContainingOnlyDigits() {
        assertTrue(DigitsInString.isStringOnlyFromDigits("1234"));
        assertFalse(DigitsInString.isStringOnlyFromDigits("1234a"));
    }

    @Test
    void isStingContainingOnlyDigits2() {
        assertTrue(DigitsInString.hasDigits("1234"));
        assertFalse(DigitsInString.hasDigits("1234a"));
    }

}