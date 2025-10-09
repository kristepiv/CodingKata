package StringManipulations;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static StringManipulations.CountChars.countVowelsAndConsonants;
import static org.junit.jupiter.api.Assertions.*;

class CountCharsTest {

    @Test
    public void countCharsTestForNullInput() {
        assertNull(countVowelsAndConsonants(""));
    }

    @Test
    public void countCharsTestForEmptyInput() {
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Vowels", 0);
        expectedResult.put("Consonants", 0);
        assertEquals(expectedResult, CountChars.countVowelsAndConsonants(""));
    }

    @Test
    public void countCharsTest() {
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Vowels", 2);
        expectedResult.put("Consonants", 3);
        assertEquals(expectedResult, CountChars.countVowelsAndConsonants("hello"));
    }

    @Test
    public void countCharsTestWithEmptySpaces() {
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Vowels", 2);
        expectedResult.put("Consonants", 3);
        assertEquals(expectedResult, CountChars.countVowelsAndConsonants(" h e l lo"));
    }

    @Test
    public void countCharsTestWithNumbers() {
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Vowels", 2);
        expectedResult.put("Consonants", 3);
        assertEquals(expectedResult, CountChars.countVowelsAndConsonants("12300hello"));
    }

    @Test
    public void countCharsTestOnlyWithSymbols() {
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Vowels", 0);
        expectedResult.put("Consonants", 0);
        assertEquals(expectedResult, CountChars.countVowelsAndConsonants("12300@#$%?"));
    }
}
