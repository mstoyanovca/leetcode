package top_interview_150.dp_md;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            // odd length palindrome
            int left = i;
            int right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String temp = s.substring(left + 1, right);
            if (temp.length() > result.length()) result = temp;

            // even length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            temp = s.substring(left + 1, right);
            if (temp.length() > result.length()) result = temp;
        }

        return result;
    }
}
