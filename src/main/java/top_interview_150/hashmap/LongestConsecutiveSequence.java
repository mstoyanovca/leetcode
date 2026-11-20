package top_interview_150.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // I assume:
    // time complexity O(N * logN)
    // space complexity O(N)
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        Arrays.sort(nums);

        for (int num : nums) {
            if (!set.isEmpty() && !set.contains(num) && !set.contains(num - 1)) set.clear();
            set.add(num);
            longest = Math.max(longest, set.size());
        }

        return longest;
    }
}
