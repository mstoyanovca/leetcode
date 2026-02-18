package leet_code_75.bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumFlipsTest {
    private final MinimumFlips minimumFlips = new MinimumFlips();

    @Test
    void example1() {
        assertEquals(3, minimumFlips.minFlips(2, 6, 5));
    }

    @Test
    void example2() {
        assertEquals(1, minimumFlips.minFlips(4, 2, 7));
    }

    @Test
    void example3() {
        assertEquals(0, minimumFlips.minFlips(1, 2, 3));
    }
}
