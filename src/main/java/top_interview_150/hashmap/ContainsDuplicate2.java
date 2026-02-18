package top_interview_150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // I assume:
        // time complexity O(n)
        // space complexity O(k)
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    // no point to keep nums out of the k-length window in the map;
                    // this is actually a sliding window problem, and no map is needed at all;
                    map.put(nums[i], i);
                }
            }
        }

        return false;
    }
}
