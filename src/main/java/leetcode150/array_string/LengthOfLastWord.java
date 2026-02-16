package leetcode150.array_string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // this solution takes 2ms, but it passes:
        // return Arrays.stream(s.trim().split(" ")).toList().getLast().trim().length();
        // this one takes 1ms:
        // I assume:
        // time complexity O(n)
        // space complexity O(1)
        String[] a = s.trim().split(" ");
        int n = a.length;
        return a[n - 1].trim().length();
    }
}
