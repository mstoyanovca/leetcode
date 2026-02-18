package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstOccurrenceInStringTest {
    @Test
    public void example1Test() {
        assertEquals(0, new FirstOccurrenceInString().strStr("sadbutsad", "sad"));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, new FirstOccurrenceInString().strStr("leetcode", "leeto"));
    }
}
