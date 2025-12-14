package leetcode150.intervals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummaryRangesTest {
    @Test
    public void example1Test() {
        assertEquals(List.of("0->2", "4->5", "7"), new SummaryRanges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of("0", "2->4", "6", "8->9"), new SummaryRanges().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}
