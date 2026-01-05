package leetcode150.hashmap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sum(n);
        }

        return n == 1;
    }

    // you have to know this, or you are screwed:
    public boolean isHappyFloydCycleDetection(int n) {
        // Floyd cycle detection algorithm:
        int slow = n;
        int fast = n;

        do {
            slow = sum(slow);
            fast = sum(sum(fast));
            if (slow == 1) return true;
        } while (slow != fast);

        return false;
    }

    private int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    /*
    first idea which comes to mind:
    step 1: break down n to digits
    step 2: calculate the sum of the squares of all digits
    repeat, possibly recursive function?
    */
    public boolean isHappyBruteForce(int n) {
        // you have to know this, or you are screwed:
        if (n == 1 || n == 7) return true;
        if (n < 10) return false;

        return recursive(n);
    }

    private boolean recursive(int n) {
        int[] digits = toDigits(n);
        if (digits.length == 1 && digits[0] == 1) {
            return true;
        } else {
            return recursive(sumOfSquares(digits));
        }
    }

    private int[] toDigits(int n) {
        Map<Character, Integer> map = Map.ofEntries(entry('0', 0), entry('1', 1), entry('2', 2), entry('3', 3), entry('4', 4), entry('5', 5), entry('6', 6), entry('7', 7), entry('8', 8), entry('9', 9));
        char[] chars = String.valueOf(n).toCharArray();
        int[] digits = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            digits[i] = map.get(chars[i]);
        }
        return digits;
    }

    private int sumOfSquares(int[] digits) {
        int result = 0;
        for (int d : digits) result += d * d;
        return result;
    }
}
