package leet_code_75.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// problem 50:
public class SmallestInfiniteSetTest {
    @Test
    void example1() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(4, smallestInfiniteSet.popSmallest());
        assertEquals(5, smallestInfiniteSet.popSmallest());
    }
}
