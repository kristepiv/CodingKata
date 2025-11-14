package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    int[] array = {10, 7, 33, 42, 45, 46};
    @Test
    public void findTargetIndex() {
        assertEquals(3, BinarySearch.findTarget(42, array));
        assertEquals(-1, BinarySearch.findTarget(77, array));
    }

}