package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    public void example3Test() {
        assertArrayEquals(new int[]{0, 0}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{0, 0}));
    }

    @Test
    public void example4Test() {
        assertArrayEquals(new int[]{0, -18, 0}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{9, 0, -2}));
    }

    @Test
    public void example5Test() {
        assertArrayEquals(new int[]{0, 1}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 0}));
    }
}
