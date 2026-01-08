package leetcode150.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseToPrerequisites = new HashMap<>();
        for (int[] courseToPrerequisiteEntry : prerequisites) {
            int course = courseToPrerequisiteEntry[0];
            int prerequisite = courseToPrerequisiteEntry[1];

            courseToPrerequisites.putIfAbsent(course, new ArrayList<>());
            courseToPrerequisites.get(course).add(prerequisite);
        }

        for (int course : courseToPrerequisites.keySet()) {
            for (int prerequisite : courseToPrerequisites.get(course)) {
                if (isCycle(course, prerequisite, courseToPrerequisites)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCycle(int course, int prerequisite, Map<Integer, List<Integer>> courseToPrerequisite) {
        if (course == prerequisite)
            return true;
        if (!courseToPrerequisite.containsKey(prerequisite))
            return false;
        for (int prereq : courseToPrerequisite.get(prerequisite))
            return isCycle(course, prereq, courseToPrerequisite);
        return false;
    }
}
