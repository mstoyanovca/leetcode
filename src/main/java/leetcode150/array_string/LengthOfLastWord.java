package leetcode150.array_string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // this solution takes 2ms:
        // return Arrays.stream(s.trim().split(" ")).toList().getLast().length();
        String[] array = s.trim().split(" ");
        int n = array.length;
        return array[n - 1].length();
    }
}
