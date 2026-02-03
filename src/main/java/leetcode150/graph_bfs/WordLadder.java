package leetcode150.graph_bfs;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // if this is a List, it times out in the LeetCode engine!
        Set<String> dictionary = new HashSet<>(wordList);
        if (!dictionary.contains(endWord)) return 0;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Queue<String> bfs = new ArrayDeque<>();
        bfs.add(beginWord);
        int numberOfWords = 0;

        while (!bfs.isEmpty()) {
            numberOfWords++;
            int size = bfs.size();

            for (int i = 0; i < size; i++) {
                String currentWord = bfs.remove();
                if (currentWord.equals(endWord)) return numberOfWords;
                StringBuilder currentWordBuilder = new StringBuilder(currentWord);

                for (int j = 0; j < currentWord.length(); j++) {
                    char originalChar = currentWord.charAt(j);

                    for (char a : alphabet) {
                        currentWordBuilder.setCharAt(j, a);
                        String transformedWord = currentWordBuilder.toString();

                        if (dictionary.contains(transformedWord)) {
                            bfs.add(transformedWord);
                            dictionary.remove(transformedWord);
                        }
                    }

                    currentWordBuilder.setCharAt(j, originalChar);
                }
            }
        }

        return 0;
    }
}
