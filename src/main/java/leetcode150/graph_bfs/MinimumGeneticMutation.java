package leetcode150.graph_bfs;

import java.util.*;

public class MinimumGeneticMutation {
    public int minMutation(String startGene, String endGene, String[] bank) {
        List<String> geneBank = new ArrayList<>(Arrays.asList(bank));
        char[] mutations = new char[]{'A', 'C', 'G', 'T'};
        Queue<String> bfs = new ArrayDeque<>();
        bfs.add(startGene);
        int numberOfMutations = 0;

        while (!bfs.isEmpty()) {
            int size = bfs.size();

            for (int i = 0; i < size; i++) {
                String currentGene = bfs.remove();
                if (currentGene.equals(endGene)) return numberOfMutations;
                StringBuilder currentGeneBuilder = new StringBuilder(currentGene);

                for (int j = 0; j < 8; j++) {
                    char originalChar = currentGeneBuilder.charAt(j);

                    for (char mutation : mutations) {
                        currentGeneBuilder.setCharAt(j, mutation);
                        String mutatedGene = currentGeneBuilder.toString();
                        if (geneBank.contains(mutatedGene)) {
                            bfs.add(mutatedGene);
                            geneBank.remove(mutatedGene);
                        }
                    }

                    currentGeneBuilder.setCharAt(j, originalChar);
                }
            }
            numberOfMutations++;
        }

        return -1;
    }
}
