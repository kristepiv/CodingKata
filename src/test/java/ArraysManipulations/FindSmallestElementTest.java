package ArraysManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestElementTest {

    @Test
    void findSmallestElement() {
        int[] nums = {2, 3, 5, 6, 0, 1};
        assertEquals(0, FindSmallestElement.findSmallestElement(nums));
    }

    @Test
    void findSmallestElementOnePass() {
        int[] nums = {2, 3, 5, 6, 0, 1};
        assertEquals(0, FindSmallestElement.findSmallestElementOnePass(nums));
    }
}