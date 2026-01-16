package leetcode150.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSearch2Test {
    @Test
    public void example1Test() {
        assertEquals(
                List.of("eat", "oath"),
                new WordSearch2().findWords(
                        new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
                        new String[]{"oath", "pea", "eat", "rain"})
        );
    }

    @Test
    public void example2Test() {
        assertEquals(
                List.of("eat", "oath"),
                new WordSearch2().findWords(
                        new char[][]{{'a', 'b'}, {'c', 'd'}},
                        new String[]{"abcd"}));
    }
}
