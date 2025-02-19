package leetcode75.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovingStarsFromStringTest {
    private final RemovingStarsFromString removingStars = new RemovingStarsFromString();

    @Test
    void example1() {
        assertEquals("lecoe", removingStars.removeStars("leet**cod*e"));
    }

    @Test
    void example2() {
        assertEquals("", removingStars.removeStars("erase*****"));
    }
}
