package leetcode150.hashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        // if an int counter is used, space complexity becomes O(1):
        Map<Integer, Integer> map = new HashMap<>();

        // I assume:
        // time complexity O(N * logN)
        // space complexity O(N)
        for (int i = 0; i < nums.length; i++) {
            // remove duplicates:
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (!map.containsKey(nums[i] - 1)) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i] - 1) + 1);
            }
        }

        return Collections.max(map.values());
    }
}
