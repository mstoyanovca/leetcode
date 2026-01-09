package leetcode150.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleTest {
    @Test
    public void example1Test() {
        assertTrue(new CourseSchedule().canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    public void example2Test() {
        assertFalse(new CourseSchedule().canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

    @Test
    public void example3Test() {
        assertFalse(new CourseSchedule().canFinish(3, new int[][]{{1, 0}, {2, 0}, {0, 2}}));
    }

    @Test
    public void example4Test() {
        assertFalse(new CourseSchedule().canFinish(13, new int[][]{{1, 2}, {2, 3}, {2, 10}, {3, 4}, {4, 5}, {4, 11}, {5, 1}}));
    }

    @Test
    public void example5Test() {
        /*
        * 0 -> 1
        * 1 -> 3
        * 3 -> 1
        * 3 -> 2
        *
        * 0 requires 1, 1 requires 3, 3 requires 1, a cycle
        * 0 doesn't lead back to 0, but there is a cycle for a required course
        * a visited array has to be used to detect it
        * */
        assertFalse(new CourseSchedule().canFinish(4, new int[][]{{0, 1}, {3, 1}, {1, 3}, {3, 2}}));
    }
}
