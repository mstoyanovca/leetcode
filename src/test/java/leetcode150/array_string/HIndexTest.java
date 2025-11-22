package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HIndexTest {
    @Test
    public void example1Test() {
        assertEquals(3, new HIndex().hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    public void example2Test() {
        assertEquals(3, new HIndex().hIndex(new int[]{3, 0, 6, 1, 5}));
    }
}
