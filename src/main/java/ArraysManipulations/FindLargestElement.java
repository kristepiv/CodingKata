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

    public static int findLargestElementOnePass(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}
