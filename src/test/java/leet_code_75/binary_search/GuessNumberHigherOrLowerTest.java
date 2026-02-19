package leet_code_75.binary_search;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLowerTest {
    private final GuessNumberHigherOrLower guessNumber = new GuessNumberHigherOrLower();

    @Test
    @Disabled("adjust value in guess()")
    void example1() {
        assertEquals(6, guessNumber.guessNumber(10));
    }

    @Test
    void example2() {
        assertEquals(1, guessNumber.guessNumber(1));
    }

    @Test
    @Disabled("adjust value in guess()")
    void example3() {
        assertEquals(1, guessNumber.guessNumber(2));
    }

    @Test
    void example4() {
        assertEquals(2, guessNumber.guessNumber(2));
    }
}
