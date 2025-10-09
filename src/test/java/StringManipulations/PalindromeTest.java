package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("sos"));
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("raCecar"));
        assertTrue(Palindrome.isPalindrome("12321"));
        assertFalse(Palindrome.isPalindrome("123521"));
    }
}