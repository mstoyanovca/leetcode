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

    @Test
    public void example6Test() {
        assertEquals(-12, new BasicCalculator().calculate("- (3 + (4 + 5))"));
    }

    @Test
    public void example7Test() {
        assertEquals(11, new BasicCalculator().calculate("(7)-(0)+(4)"));
    }

    @Test
    public void example8Test() {
        assertEquals(-15, new BasicCalculator().calculate("2-4-(8+2-6+(8+4-(1)+8-10))"));
    }

    @Test
    public void example9Test() {
        assertEquals(-2147483648, new BasicCalculator().calculate("-2147483648"));
    }
}
