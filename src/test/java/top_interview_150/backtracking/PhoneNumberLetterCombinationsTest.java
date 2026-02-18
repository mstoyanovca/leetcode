package top_interview_150.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberLetterCombinationsTest {
    @Test
    public void example1Test() {
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), new PhoneNumberLetterCombinations().letterCombinations("23"));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of("a", "b", "c"), new PhoneNumberLetterCombinations().letterCombinations("2"));
    }
}
