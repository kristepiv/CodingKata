package ArraysManipulations;

import java.util.HashMap;
import java.util.Map;

public class FindPairsThatSumToTarget {
    public static int[] findPair(int[] nums, int target) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Wrong input.");
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            } else map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not found");

    }
}
