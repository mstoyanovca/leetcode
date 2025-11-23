package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}
