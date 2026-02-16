package leetcode150.two_pointers;

import java.util.stream.Collectors;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // time complexity O(n)
        // space complexity O(1)
        while (left <= right) {
            while (left < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (right > 0 && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (right > left && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;

            left++;
            right--;
        }

        return true;
    }

    public boolean isPalindromeBruteForce(String s) {
        String filtered = s.chars().mapToObj(c -> (char) c).filter(Character::isLetterOrDigit).map(Character::toLowerCase).map(String::valueOf).collect(Collectors.joining());
        String reversed = new StringBuilder(filtered).reverse().toString();
        return filtered.equals(reversed);
    }
}
