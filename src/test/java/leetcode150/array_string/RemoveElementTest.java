package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    @Test
    public void example1Test() {
        assertEquals(2, new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void example2Test() {
        assertEquals(0, new RemoveElement().removeElement(new int[]{}, 0));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new RemoveElement().removeElement(new int[]{1}, 1));
    }

    @Test
    public void example4Test() {
        assertEquals(0, new RemoveElement().removeElement(new int[]{3, 3}, 3));
    }

    @Test
    public void example5Test() {
        assertEquals(1, new RemoveElement().removeElement(new int[]{4, 5}, 5));
    }
}
