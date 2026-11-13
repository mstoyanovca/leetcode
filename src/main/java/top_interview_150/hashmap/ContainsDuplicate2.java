package top_interview_150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // time complexity O(n)
        // space complexity O(n)
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (i - map.get(nums[i]) <= k) return true;
                else map.put(nums[i], i);
            }
        }

        return false;
    }
}
