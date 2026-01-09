package leetcode150.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        Map<Integer, List<Integer>> courseToPrerequisites = new HashMap<>();

        // I assume:
        // space complexity O(n)
        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            courseToPrerequisites.putIfAbsent(course, new ArrayList<>());
            courseToPrerequisites.get(course).add(prerequisite);
        }

        for (int course : courseToPrerequisites.keySet()) {
            for (int prerequisite : courseToPrerequisites.get(course)) {
                if (isCycle(course, prerequisite, courseToPrerequisites, visited)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCycle(int course, int newCourse, Map<Integer, List<Integer>> courseToPrerequisite, boolean[] visited) {
        visited[course] = true;
        //visited[newCourse] = true;
        if (course == newCourse)
            return true;
        if (!courseToPrerequisite.containsKey(newCourse))
            return false;
        for (int prerequisite : courseToPrerequisite.get(newCourse))
            if (!visited[prerequisite])
                return isCycle(course, prerequisite, courseToPrerequisite, visited);
        return false;
    }
}
