package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HIndexTest {
    @Test
    public void example1Test() {
        // the highest h number of articles, which have been cited at least h or more times:
        assertEquals(3, new HIndex().hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new HIndex().hIndex(new int[]{1, 3, 1}));
    }

    @Test
    public void example3Test() {
        assertEquals(1, new HIndex().hIndex(new int[]{100}));
    }

    @Test
    public void example4Test() {
        assertEquals(0, new HIndex().hIndex(new int[]{0}));
    }

    @Test
    public void example5Test() {
        assertEquals(1, new HIndex().hIndex(new int[]{0, 0, 2}));
    }

    @Test
    public void example6Test() {
        assertEquals(1, new HIndex().hIndex(new int[]{1, 1}));
    }

    @Test
    public void example7Test() {
        assertEquals(2, new HIndex().hIndex(new int[]{2, 2, 2}));
    }
}
