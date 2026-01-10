package leetcode150.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseToPrerequisites = new HashMap<>();
        boolean[] visitedGlobal = new boolean[numCourses];

        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            courseToPrerequisites.putIfAbsent(course, new ArrayList<>());
            courseToPrerequisites.get(course).add(prerequisite);
        }

        for (int course : courseToPrerequisites.keySet()) {
            // boolean flags per recursion stack:
            boolean[] visited = new boolean[numCourses];
            if (!visitedGlobal[course] && isCycle(course, courseToPrerequisites, visited, visitedGlobal)) return false;
        }

        return true;
    }

    private boolean isCycle(int course, Map<Integer, List<Integer>> courseToPrerequisite, boolean[] visited, boolean[] visitedGlobal) {
        if (visitedGlobal[course] && visited[course])
            return true;

        for (int prerequisite : courseToPrerequisite.containsKey(course) ? courseToPrerequisite.get(course) : List.<Integer>of()) {
            visitedGlobal[course] = true;
            visited[course] = true;
            if (isCycle(prerequisite, courseToPrerequisite, visited, visitedGlobal))
                return true;
        }

        return false;
    }
}
