package ArraysManipulations;

import java.util.Arrays;

public class FindSmallestElement {

    public static int findSmallestElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[0];
    }


    public static int findSmallestElementOnePass(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }
}
