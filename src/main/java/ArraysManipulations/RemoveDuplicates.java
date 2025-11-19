package ArraysManipulations;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicatesWithStreams(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }
}
