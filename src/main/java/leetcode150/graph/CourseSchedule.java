package leetcode150.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseToPrerequisites = new HashMap<>();
        boolean[] visited = new boolean[numCourses];

        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            courseToPrerequisites.putIfAbsent(course, new ArrayList<>());
            courseToPrerequisites.get(course).add(prerequisite);
        }

        for (int course : courseToPrerequisites.keySet()) {
            boolean[] visited2 = new boolean[numCourses];
            if (isCycle(course, courseToPrerequisites, visited, visited2)) return false;
        }

        return true;
    }

    private boolean isCycle(int course, Map<Integer, List<Integer>> courseToPrerequisite, boolean[] visited, boolean[] visited2) {
        if (visited[course]) return true;
        if (visited2[course]) return true;

        if (courseToPrerequisite.containsKey(course)) {
            for (int prerequisite : courseToPrerequisite.get(course)) {
                if (courseToPrerequisite.containsKey(prerequisite)) {
                    visited[course] = true;
                    visited2[course] = true;
                    return isCycle(prerequisite, courseToPrerequisite, visited, visited2);
                }
            }
        }

        return false;
    }
}
