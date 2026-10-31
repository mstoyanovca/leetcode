package top_interview_150.two_pointers;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = 0;

        // time complexity O(m + n)
        // space complexity O(1)
        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                if (left == s.length() - 1) {
                    return true;
                }
                left++;
                right++;
            } else {
                right++;
            }
        }

        return false;
    }
}
