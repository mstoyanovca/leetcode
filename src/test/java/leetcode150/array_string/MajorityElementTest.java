package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    @Test
    public void example1Test() {
        assertEquals(3, new MajorityElement().majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void example2Test() {
        assertEquals(2, new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
