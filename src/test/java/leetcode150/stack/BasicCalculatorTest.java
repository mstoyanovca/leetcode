package leetcode150.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    @Test
    public void example1Test() {
        assertEquals(2, new BasicCalculator().calculate("1 + 1"));
    }

    @Test
    public void example2Test() {
        assertEquals(3, new BasicCalculator().calculate(" 2-1 + 2 "));
    }

    @Test
    public void example3Test() {
        assertEquals(23, new BasicCalculator().calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    public void example4Test() {
        assertEquals(2147483647, new BasicCalculator().calculate("2147483647"));
    }

    @Test
    public void example5Test() {
        assertEquals(3, new BasicCalculator().calculate("1-(     -2)"));
    }
}
