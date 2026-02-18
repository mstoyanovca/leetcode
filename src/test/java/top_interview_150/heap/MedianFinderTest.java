package top_interview_150.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianFinderTest {
    @Test
    public void example1Test() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian());
        medianFinder.addNum(3);
        assertEquals(2, medianFinder.findMedian());
    }

    @Test
    public void example2Test() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        assertEquals(-1.0, medianFinder.findMedian());
        medianFinder.addNum(-2);
        assertEquals(-1.5, medianFinder.findMedian());
        medianFinder.addNum(-3);
        assertEquals(-2, medianFinder.findMedian());
        medianFinder.addNum(-4);
        assertEquals(-2.5, medianFinder.findMedian());
        medianFinder.addNum(-5);
        assertEquals(-3, medianFinder.findMedian());
    }
}
