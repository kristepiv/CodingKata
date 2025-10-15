package StringManipulations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseStringTest {

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("olleh", "hello"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("racecar", "racecar"),
                Arguments.of("dlrow olleh", "hello world"),
                Arguments.of("!321cba", "abc123!"),
                Arguments.of("gnimmargorP", "Programming")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "source")
    void reverseString(String expected, String value) {
        assertEquals(expected, ReverseString.reverseString(value));
    }

    @Test
    public void testNullInput() {
        assertNull(ReverseString.reverseString(null));
    }

}