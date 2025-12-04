package leetcode150.two_pointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String filtered = s.chars().mapToObj(c -> (char) c).filter(c -> Character.isAlphabetic(c) || Character.isDigit(c)).map(Character::toLowerCase).toString();
        String reversed = new StringBuilder(filtered).reverse().toString();

        return true;
    }
}
