package top_interview_150.graph_bfs;

import java.util.*;

public class MinimumGeneticMutation {
    private final char[] genes = new char[]{'A', 'C', 'G', 'T'};

    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> geneBank = new HashSet<>(Arrays.asList(bank));
        Queue<String> bfs = new ArrayDeque<>();
        bfs.add(startGene);
        int numberOfMutations = 0;

        while (!bfs.isEmpty()) {
            int size = bfs.size();

            for (int i = 0; i < size; i++) {
                String mutation = bfs.remove();
                if (mutation.equals(endGene)) return numberOfMutations;
                StringBuilder currentGeneBuilder = new StringBuilder(mutation);

                for (int j = 0; j < 8; j++) {
                    char originalChar = currentGeneBuilder.charAt(j);

                    for (char gene : genes) {
                        currentGeneBuilder.setCharAt(j, gene);
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
