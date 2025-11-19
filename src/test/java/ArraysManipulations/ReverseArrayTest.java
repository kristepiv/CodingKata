package ArraysManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void reverseArray() {
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        int[] input = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedResult, ReverseArray.reverseArray(input));
    }
}