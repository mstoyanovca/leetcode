package top_interview_150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    @Test
    public void example1Test() {
        assertEquals(2, new FindPeakElement().findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(5, new FindPeakElement().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new FindPeakElement().findPeakElement(new int[]{1}));
    }

    @Test
    public void example4Test() {
        assertEquals(1, new FindPeakElement().findPeakElement(new int[]{1, 2}));
    }
}
