package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {
    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    void example1() {
        assertEquals("apbqcr", mergeStringsAlternately.mergeAlternately("abc", "pqr"));
    }

    @Test
    void example2() {
        assertEquals("apbqrs", mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void example3() {
        assertEquals("apbqcd", mergeStringsAlternately.mergeAlternately("abcd", "pq"));
    }
}
