package leet_code_75.trie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchSuggestionsSystemTest {
    private final SearchSuggestionsSystem autocomplete = new SearchSuggestionsSystem();

    @Test
    void example1() {
        List<List<String>> result = new ArrayList<>();
        result.add(Arrays.asList("mobile", "moneypot", "monitor"));
        result.add(Arrays.asList("mobile", "moneypot", "monitor"));
        result.add(Arrays.asList("mouse", "mousepad"));
        result.add(Arrays.asList("mouse", "mousepad"));
        result.add(Arrays.asList("mouse", "mousepad"));

        assertEquals(result, autocomplete.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"));
    }

    @Test
    void example2() {
        List<List<String>> result = new ArrayList<>();
        result.add(List.of("havana"));
        result.add(List.of("havana"));
        result.add(List.of("havana"));
        result.add(List.of("havana"));
        result.add(List.of("havana"));
        result.add(List.of("havana"));

        assertEquals(result, autocomplete.suggestedProducts(new String[]{"havana"}, "havana"));
    }
}
