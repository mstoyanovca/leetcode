package leetcode150.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringConcatenationAllWordsTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(0, 9), new SubstringConcatenationAllWords().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(), new SubstringConcatenationAllWords().findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(6, 9, 12), new SubstringConcatenationAllWords().findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));
    }

    @Test
    public void example4Test() {
        assertEquals(List.of(8), new SubstringConcatenationAllWords().findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"}));
    }

    @Test
    public void example5Test() {
        assertEquals(List.of(13), new SubstringConcatenationAllWords().findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo", "barr", "wing", "ding", "wing"}));
    }

    @Test
    public void example6Test() {
        assertEquals(List.of(), new SubstringConcatenationAllWords().findSubstring("a", new String[]{"a", "a"}));
    }

    @Test
    public void example7Test() {
        assertEquals(List.of(0, 2, 4, 6, 8, 10, 1, 3, 5, 7, 9), new SubstringConcatenationAllWords().findSubstring("aaaaaaaaaaaaaa", new String[]{"aa", "aa"}));
    }

    @Test
    public void example8Test() {
        assertEquals(List.of(0), new SubstringConcatenationAllWords().findSubstring("a", new String[]{"a"}));
    }

    @Test
    public void example9Test() {
        assertEquals(List.of(), new SubstringConcatenationAllWords().findSubstring("aaa", new String[]{"aa", "aa"}));
    }

    @Test
    public void example10Test() {
        assertEquals(List.of(1), new SubstringConcatenationAllWords().findSubstring("ababaab", new String[]{"ab", "ba", "ba"}));
    }

    @Test
    public void example11Test() {
        assertEquals(List.of(6), new SubstringConcatenationAllWords().findSubstring("sheateateseatea", new String[]{"sea", "tea", "ate"}));
    }
}
