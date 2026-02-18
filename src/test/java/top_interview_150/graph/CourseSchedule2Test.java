package top_interview_150.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CourseSchedule2Test {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{0, 1}, new CourseSchedule2().findOrder(2, new int[][]{{1, 0}}));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, new CourseSchedule2().findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }

    @Test
    public void example3Test() {
        assertArrayEquals(new int[]{0}, new CourseSchedule2().findOrder(1, new int[][]{}));
    }

    @Test
    public void example4Test() {
        assertArrayEquals(new int[]{1, 0}, new CourseSchedule2().findOrder(2, new int[][]{{0, 1}}));
    }

    @Test
    public void example5Test() {
        assertArrayEquals(new int[]{0, 1, 2}, new CourseSchedule2().findOrder(3, new int[][]{{2, 0}, {2, 1}}));
    }

    @Test
    public void example6Test() {
        assertArrayEquals(new int[]{}, new CourseSchedule2().findOrder(3, new int[][]{{1, 0}, {1, 2}, {0, 1}}));
    }
}
