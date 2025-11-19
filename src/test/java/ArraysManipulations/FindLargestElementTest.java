package ArraysManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLargestElementTest {

    @Test
    void findLargestElement() {
        int[] nums = {2,3,5,6,0,1};
        assertEquals(6, FindLargestElement.findLargestElement(nums));
    }
}