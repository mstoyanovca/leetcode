package leetcode75;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    void example1() {
        assertTrue(Arrays.equals(productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6}));
    }

    @Test
    void example2() {
        assertTrue(Arrays.equals(productOfArrayExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0}));
    }
}
