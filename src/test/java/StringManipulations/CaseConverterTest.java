package StringManipulations;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseConverterTest {


    @Test
    void toUpperCase() {
        CaseConverter converter = new CaseConverter();

        assertEquals("HELLO", converter.toUpperCase("hello"));
        assertEquals("HELLO WORLD", converter.toUpperCase("hello world"));
        assertEquals("ABC123", converter.toUpperCase("abc123"));
        assertEquals("ALREADY UPPER", converter.toUpperCase("ALREADY UPPER"));
        assertEquals("", converter.toUpperCase(""));
        assertNull(converter.toUpperCase(null));
    }

    @Test
    void toLowerCase() {
        CaseConverter converter = new CaseConverter();
        assertEquals("hello", converter.toLowerCase("HELLO"));
        assertEquals("hello world", converter.toLowerCase("HELLO WORLD"));
        assertEquals("abc123", converter.toLowerCase("ABC123"));
        assertEquals("already lower", converter.toLowerCase("already lower"));
        assertEquals("", converter.toLowerCase(""));
        assertNull(converter.toLowerCase(null));
    }

    @Test
    void toggleCase() {
        CaseConverter converter = new CaseConverter();

        assertEquals("HELLO", converter.toggleCase("hello"));
        assertEquals("hello", converter.toggleCase("HELLO"));
        assertEquals("HeLLo WoRLd", converter.toggleCase("hEllO wOrlD"));
        assertEquals("aBc123XyZ", converter.toggleCase("AbC123xYz"));
        assertEquals("", converter.toggleCase(""));
        assertNull(converter.toggleCase(null));
    }
}