package leetcode75.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberCombinationsTest {
    private final PhoneNumberCombinations combinations = new PhoneNumberCombinations();

    @Test
    void example1() {
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), combinations.letterCombinations("23"));
    }

    @Test
    void example2() {
        assertEquals(new ArrayList<String>(), combinations.letterCombinations(""));
    }

    @Test
    void example3() {
        assertEquals(Arrays.asList("a", "b", "c"), combinations.letterCombinations("2"));
    }
}
