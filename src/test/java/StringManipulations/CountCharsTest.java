package StringManipulations;

import org.junit.jupiter.api.Test;

import static StringManipulations.CountChars.countVowelsAndConsonants;
import static org.junit.jupiter.api.Assertions.*;

class CountCharsTest {

    @Test
    public void countCharsTestForNullInput() {
        assertEquals(CountChars.Result.of(0, 0), countVowelsAndConsonants(null));
    }

    @Test
    public void countCharsTest() {
        assertEquals(CountChars.Result.of(2, 3), CountChars.countVowelsAndConsonants("hello"));
    }

    @Test
    public void countCharsTestWithEmptySpaces() {
        assertEquals(CountChars.Result.of(2, 3), CountChars.countVowelsAndConsonants(" h e l lo"));
    }

    @Test
    public void countCharsTestWithNumbers() {
        assertEquals(CountChars.Result.of(2, 3), CountChars.countVowelsAndConsonants("12300hello"));
    }

    @Test
    public void countCharsTestOnlyWithSymbols() {
        assertEquals(CountChars.Result.of(0, 0), CountChars.countVowelsAndConsonants("12300@#$%?"));
    }
}
