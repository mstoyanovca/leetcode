package leetcode150.graph;

import java.util.HashMap;
import java.util.Map;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Integer> courseToPrerequisite = new HashMap<>();
        for (int[] courseToPrerequisiteEntry : prerequisites) courseToPrerequisite.put(courseToPrerequisiteEntry[0], courseToPrerequisiteEntry[1]);

        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            if (checkForCycle(course, prerequisite, courseToPrerequisite, 0)) return false;
        }

        return true;
    }

    private boolean checkForCycle(int course, int prerequisite, Map<Integer, Integer> courseToPrerequisite, Integer visited) {
        if (visited++ == courseToPrerequisite.size()) return false;
        if (course == prerequisite) return true;
        if (!courseToPrerequisite.containsKey(prerequisite)) return false;

        return checkForCycle(course, courseToPrerequisite.get(prerequisite), courseToPrerequisite, visited);
    }
}
