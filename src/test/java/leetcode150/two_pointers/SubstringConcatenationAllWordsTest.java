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
}
