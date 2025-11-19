package ArraysManipulations;

public class ReverseArray {
    public static int[] reverseArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }
}
