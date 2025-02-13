package leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    void example1() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, productOfArrayExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}
