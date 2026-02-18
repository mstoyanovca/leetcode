package top_interview_150.hashmap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")), new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(List.of("")), new GroupAnagrams().groupAnagrams(new String[]{""}));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(List.of("a")), new GroupAnagrams().groupAnagrams(new String[]{"a"}));
    }
}
