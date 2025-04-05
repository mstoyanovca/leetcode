package leetcode75.dp_1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DominoTrominoTilingTest {
    private final DominoTrominoTiling dominoTiling = new DominoTrominoTiling();

    @Test
    void example1() {
        assertEquals(5, dominoTiling.numTilings(3));
    }

    @Test
    void example2() {
        assertEquals(1, dominoTiling.numTilings(1));
    }

    @Test
    void example3() {
        assertEquals(11, dominoTiling.numTilings(4));
    }

    @Test
    void example4() {
        assertEquals(24, dominoTiling.numTilings(5));
    }

    @Test
    void example5() {
        assertEquals(312342182, dominoTiling.numTilings(30));
    }
}
