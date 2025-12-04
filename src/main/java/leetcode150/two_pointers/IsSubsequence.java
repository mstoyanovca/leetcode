package leetcode150.two_pointers;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;

        int subSeqPointer = 0;
        int stringPointer = 0;

        while (subSeqPointer < s.length()) {
            if (s.charAt(subSeqPointer) == t.charAt(stringPointer)) subSeqPointer++;
            if (subSeqPointer < s.length()) stringPointer++;
            if (stringPointer == t.length()) return false;
        }

        return true;
    }
}
