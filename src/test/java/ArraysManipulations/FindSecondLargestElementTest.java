package ArraysManipulations;

import org.junit.jupiter.api.Test;

import static ArraysManipulations.FindSecondLargestElement.findSecondLargestElement;
import static org.junit.jupiter.api.Assertions.*;

class FindSecondLargestElementTest {


    @Test
    void findSecondLargestElementBruteForce() {
        int[] nums = {897, -12, 0, 2};
        assertEquals(2, findSecondLargestElement(nums));
    }

    @Test
    void findSecondLargestElementSinglePass() {
        int[] nums = {12, 0, 2};
        assertEquals(2, FindSecondLargestElement.findSecondLargestElementSinglePass(nums));
    }

    @Test
    void testAllSameElements() {
        int[] nums = {5, 5, 5, 5};
        assertThrows(IllegalArgumentException.class,
                () -> FindSecondLargestElement.findSecondLargestElementSinglePass(nums));
    }

    @Test
    void testTwoElements() {
        int[] nums = {10, 3};
        assertEquals(3, findSecondLargestElement(nums));
    }

    @Test
    void testWithNegativeNumbers() {
        int[] nums = {-1, -5, -3, -2, -5};
        assertEquals(-2, findSecondLargestElement(nums));
    }

    @Test
    void testLargestAtBeginning() {
        int[] nums = {100, 1, 2, 3, 4};
        assertEquals(4, findSecondLargestElement(nums));
    }

    @Test
    void testSecondLargestIsDuplicate() {
        int[] nums = {10, 8, 8, 5, 3};
        assertEquals(8, findSecondLargestElement(nums));
    }
}