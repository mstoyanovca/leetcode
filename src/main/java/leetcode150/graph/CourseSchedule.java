package leetcode150.graph;

import java.util.*;

public class CourseSchedule {
    // I assume:
    // time complexity O(V + E)
    // space complexity O(V + E)
    // BFS version / Kahn's algorithm (with a queue):
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count = 0;
        int[] inDegree2 = new int[numCourses];

        Map<Integer, List<Integer>> prerequisiteToCourses = new HashMap<>();
        for (int i = 0; i < numCourses; i++) prerequisiteToCourses.put(i, new ArrayList<>());

        for (int[] courseWithPrerequisite : prerequisites) {
            int prerequisite = courseWithPrerequisite[1];
            int course = courseWithPrerequisite[0];

            prerequisiteToCourses.get(prerequisite).add(course);
            inDegree2[course]++;
        }

        int[] inDegree = new int[numCourses];

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        for (int[] courseWithPrerequisite : prerequisites) {
            int prerequisite = courseWithPrerequisite[1];
            int course = courseWithPrerequisite[0];

            adj.get(prerequisite).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        // if there are no nodes with inDegree[i] == 0, this is not a DAG:
        for (int i = 0; i < numCourses; i++) if (inDegree[i] == 0) queue.add(i);

        while (!queue.isEmpty()) {
            count++;
            int prerequisite = queue.remove();

            for (int course : adj.get(prerequisite)) {
                inDegree[course]--;
                if (inDegree[course] == 0) queue.add(course);
            }
        }

        return count == numCourses;
    }

    // I assume:
    // time complexity O(V + E)
    // space complexity O(V + E)
    // DFS version with recursion, it times out in the LeetCode engine
    public boolean canFinishDfs(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseToPrerequisites = new HashMap<>();
        boolean[] visitedGlobal = new boolean[numCourses];
        // boolean flags per recursion stack:
        boolean[] visited = new boolean[numCourses];

        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            courseToPrerequisites.putIfAbsent(course, new ArrayList<>());
            courseToPrerequisites.get(course).add(prerequisite);
        }

        for (int course : courseToPrerequisites.keySet()) if (isCycle(course, courseToPrerequisites, visited, visitedGlobal)) return false;

        return true;
    }

    private boolean isCycle(int course, Map<Integer, List<Integer>> courseToPrerequisite, boolean[] visited, boolean[] visitedGlobal) {
        visitedGlobal[course] = true;
        visited[course] = true;

        for (int prerequisite : courseToPrerequisite.containsKey(course) ? courseToPrerequisite.get(course) : List.<Integer>of()) {
            if (visitedGlobal[prerequisite] && visited[prerequisite]) return true;
            if (isCycle(prerequisite, courseToPrerequisite, visited, visitedGlobal)) return true;
        }

        visited[course] = false;
        return false;
    }
}
