package top_interview_150.heap;

import java.util.*;

public class Ipo {
    // k = number of projects
    // w = initial capital
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<Project> projects = new ArrayList<>();
        Queue<Project> maxHeap = new PriorityQueue<>((a, b) -> b.profit - a.profit);

        for (int i = 0; i < capital.length; i++) projects.add(new Project(capital[i], profits[i]));
        projects.sort(Comparator.comparingInt(a -> a.capital));

        int i = 0;
        for (int j = 0; j < k; j++) {
            while (i < projects.size() && w >= projects.get(i).capital) {
                maxHeap.add(projects.get(i));
                i++;
            }
            if (maxHeap.isEmpty()) return w;
            w += maxHeap.remove().profit;
        }

        return w;
    }

    private static class Project {
        int capital;
        int profit;

        public Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }
}
