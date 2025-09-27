package StringManipulations;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @org.junit.jupiter.api.Test
    void reverseString() {
        ReverseString rs = new ReverseString();

        // Test normal string
        assertEquals("olleh", rs.reverseString("hello"));

        // Test empty string
        assertEquals("", rs.reverseString(""));

        // Test single character
        assertEquals("a", rs.reverseString("a"));

        // Test palindrome
        assertEquals("racecar", rs.reverseString("racecar"));

        // Test string with spaces
        assertEquals("dlrow olleh", rs.reverseString("hello world"));

        // Test string with numbers and special characters
        assertEquals("!321cba", rs.reverseString("abc123!"));

        // Test null input
        assertNull(rs.reverseString(null));

        // Test longer string
        assertEquals("gnimmargorP", rs.reverseString("Programming"));
    }

}