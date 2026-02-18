package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomizedSetTest {
    @Test
    public void example1Test() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(1));
        assertFalse(randomizedSet.remove(2));
        assertTrue(randomizedSet.insert(2));
        int temp = randomizedSet.getRandom();
        assertTrue(temp == 1 || temp == 2);
        assertTrue(randomizedSet.remove(1));
        assertFalse(randomizedSet.insert(2));
        assertEquals(2, randomizedSet.getRandom());
    }
}
