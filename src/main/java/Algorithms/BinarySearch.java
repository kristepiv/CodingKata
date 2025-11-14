package Algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static int findTarget(int target, int[] array) {
        int low = 0;
        int high = array.length - 1;

        Arrays.sort(array);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
