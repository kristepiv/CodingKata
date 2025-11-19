package ArraysManipulations;

import java.util.Arrays;

public class FindLargestElement {
    public static int findLargestElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}
