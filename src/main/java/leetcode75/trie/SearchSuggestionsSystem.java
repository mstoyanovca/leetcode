package leetcode75.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// problem 71:
public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();

        int[] searchSpace = new int[2];
        searchSpace[1] = products.length - 1;
        for (int i = 0; i < searchWord.length(); i++) {
            char c = searchWord.charAt(i);
            result.add(findMatchingWords(products, searchSpace, i, c));
        }

        return result;
    }

    private List<String> findMatchingWords(String[] products, int[] searchSpace, int prefixIndex, char prefixChar) {
        List<String> topMatchingWords = new ArrayList<>();
        int left = searchSpace[0], right = searchSpace[1];
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (products[mid].length() <= prefixIndex || products[mid].charAt(prefixIndex) < prefixChar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        searchSpace[0] = left;
        right = searchSpace[1];
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (products[mid].length() <= prefixIndex || products[mid].charAt(prefixIndex) > prefixChar) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        searchSpace[1] = right;
        for (int i = searchSpace[0]; i <= searchSpace[1] && i < searchSpace[0] + 3; i++) {
            topMatchingWords.add(products[i]);
        }
        return topMatchingWords;
    }
}
