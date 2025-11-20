package ArraysManipulations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairsThatSumToTargetTest {

    @Test
    void findPair1() {
        int[] nums = {2, 7, 11, 15};
        int[] expected = {0, 1};
        assertArrayEquals(expected, FindPairsThatSumToTarget.findPair(nums, 9));
    }

    @Test
    void findPair2() {
        int[] nums = {2, 33, -10, 7, 11, 15};
        int[] expected = {2, 3};
        assertArrayEquals(expected, FindPairsThatSumToTarget.findPair(nums, -3));
    }
}