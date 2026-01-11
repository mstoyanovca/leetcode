package leetcode150.graph;

import java.util.*;

public class CourseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> prerequisiteToCourses = new HashMap<>();
        int[] inDegree = new int[numCourses];
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < numCourses; i++) prerequisiteToCourses.put(i, new ArrayList<>());
        for (int[] courseWithPrerequisite : prerequisites) {
            int prerequisite = courseWithPrerequisite[1];
            int course = courseWithPrerequisite[0];

            prerequisiteToCourses.get(prerequisite).add(course);
            inDegree[course]++;
        }

        Queue<Integer> bfs = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) if (inDegree[i] == 0) bfs.add(i);
        while (!bfs.isEmpty()) {
            int prerequisite = bfs.remove();
            //result.add(prerequisite);
            for (int course : prerequisiteToCourses.get(prerequisite)) {
                inDegree[course]--;
                if (inDegree[course] == 0) bfs.add(course);
                result.add(course);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
