package leetcode150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeakElementTest {
    @Test
    public void example1Test() {
        assertEquals(2, new PeakElement().findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(5, new PeakElement().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new PeakElement().findPeakElement(new int[]{1}));
    }

    @Test
    public void example4Test() {
        assertEquals(1, new PeakElement().findPeakElement(new int[]{1, 2}));
    }
}
