package leet_code_75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncreasingTripletSubsequenceTest {
    private final IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();

    @Test
    void example1() {
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void example2() {
        assertFalse(increasingTripletSubsequence.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void example3() {
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    @Test
    void example4() {
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
    }
}
