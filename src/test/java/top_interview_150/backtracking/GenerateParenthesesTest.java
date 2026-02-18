package top_interview_150.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesesTest {
    @Test
    public void example1Test() {
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), new GenerateParentheses().generateParenthesis(3));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of("()"), new GenerateParentheses().generateParenthesis(1));
    }
}
