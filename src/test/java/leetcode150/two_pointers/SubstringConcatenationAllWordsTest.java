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
        assertEquals(List.of(), new SubstringConcatenationAllWords().findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));
    }
}
