package leetcode75.sliding_window;

public class MaxNumberOfVowelsInSubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) max++;
        }

        int count = max;
        for (int i = 1; i < s.length() - k + 1; i++) {
            if (isVowel(s.charAt(i - 1))) count--;
            if (isVowel(s.charAt(i + k - 1))) count++;
            if (count > max) max = count;
        }


        return max;
    }

    private boolean isVowel(char c) {
        final String vowels = "aeiou";
        return vowels.indexOf(c) >= 0;
    }
}
