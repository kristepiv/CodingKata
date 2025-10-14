package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreStringsAnagramsTest {

    @Test
    public void isAnagram(){
        assertTrue(AreStringsAnagrams.isAnagram("hello you", " ollehouy"));
        assertFalse(AreStringsAnagrams.isAnagram("a","aa"));
        assertThrows(IllegalArgumentException.class,() -> AreStringsAnagrams.isAnagram(null, "hi"));
    }

}