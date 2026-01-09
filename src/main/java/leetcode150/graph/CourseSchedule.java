package leetcode150.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseToPrerequisites = new HashMap<>();
        boolean[] visited = new boolean[numCourses];

        // I assume:
        // space complexity O(n)
        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            courseToPrerequisites.putIfAbsent(course, new ArrayList<>());
            courseToPrerequisites.get(course).add(prerequisite);
        }

        for (int course : courseToPrerequisites.keySet()) if (isCycle(course, courseToPrerequisites, visited)) return false;

        return true;
    }

    private boolean isCycle(int course, Map<Integer, List<Integer>> courseToPrerequisite, boolean[] visited) {
        if (visited[course]) return true;

        if (courseToPrerequisite.containsKey(course)) {
            for (int prerequisite : courseToPrerequisite.get(course)) {
                if (courseToPrerequisite.containsKey(prerequisite)) {
                    visited[course] = true;
                    return isCycle(prerequisite, courseToPrerequisite, visited);
                }
            }
        }

        return false;
    }
}
