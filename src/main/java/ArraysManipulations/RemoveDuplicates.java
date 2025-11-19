package ArraysManipulations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int[] removeDuplicatesWithStreams(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }
}
