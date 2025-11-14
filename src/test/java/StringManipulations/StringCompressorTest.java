package StringManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressorTest {

    @Test
    void compressString() {
        assertEquals("a3b2a1", StringCompressor.stringCompressor("aaabba"));
        assertEquals("a1", StringCompressor.stringCompressor("a"));
        assertEquals("", StringCompressor.stringCompressor(""));
        assertEquals("a3b2c2d2", StringCompressor.stringCompressor("aaabbccdd"));
    }
}