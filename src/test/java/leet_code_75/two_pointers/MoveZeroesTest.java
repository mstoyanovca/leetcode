package leet_code_75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {
    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void example1() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, input);
    }

    @Test
    void example2() {
        int[] input = new int[]{0};
        moveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{0}, input);
    }
}
