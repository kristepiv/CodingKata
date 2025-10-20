package StringManipulations;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CharOccurrencesCounterTest {

    @Test
    public void countCharsOccurrence() {
        assertEquals(Map.of('h',1, 'e',1, 'l', 2, 'o',1), CharOccurrencesCounter.charOccurrencesCounter("hello"));
        assertEquals(Map.of('h',1), CharOccurrencesCounter.charOccurrencesCounter("h"));
        assertNull(CharOccurrencesCounter.charOccurrencesCounter(null));
        assertNull(CharOccurrencesCounter.charOccurrencesCounter(""));

    }

}