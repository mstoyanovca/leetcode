package top_interview_150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {
    @Test
    public void example1Test() {
        assertTrue(new HappyNumber().isHappy(19));
    }

    @Test
    public void example2Test() {
        assertFalse(new HappyNumber().isHappy(2));
    }

    @Test
    public void example3Test() {
        assertFalse(new HappyNumber().isHappy(11));
    }
}
