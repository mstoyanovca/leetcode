package top_interview_150.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IpoTest {
    @Test
    public void example1Test() {
        assertEquals(4, new Ipo().findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(6, new Ipo().findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}));
    }
}
