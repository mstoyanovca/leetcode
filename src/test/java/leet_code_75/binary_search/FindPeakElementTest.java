package leet_code_75.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    private final FindPeakElement findPeakElement = new FindPeakElement();

    @Test
    void example1() {
        assertEquals(2, findPeakElement.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    void example2() {
        assertEquals(5, findPeakElement.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}
