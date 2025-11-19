package ArraysManipulations;

import java.util.Arrays;

public class FindSecondLargestElement {

    public static int findSecondLargestElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length - 2];
    }

    public static int findSecondLargestElementSinglePass(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];

            }
        }
        if (secondLargest == largest || secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Second largest element was not found.");
        }

        return secondLargest;
    }
}
