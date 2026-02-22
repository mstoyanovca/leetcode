package top_interview_150.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {
    @Test
    public void example1Test() {
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void example2Test() {
        assertEquals(6, new EvaluateReversePolishNotation().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    public void example3Test() {
        assertEquals(22, new EvaluateReversePolishNotation().evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    public void example4Test() {
        assertEquals(18, new EvaluateReversePolishNotation().evalRPN(new String[]{"18"}));
    }
}
