package leetcode75;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int sPointer = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sPointer) == t.charAt(i)) sPointer++;
            if (sPointer == s.length()) return true;
        }

        return false;
    }
}
