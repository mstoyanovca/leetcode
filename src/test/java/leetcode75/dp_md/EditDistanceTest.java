package leetcode75.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditDistanceTest {
    private final EditDistance editDistance = new EditDistance();

    @Test
    void example1() {
        assertEquals(3, editDistance.minDistance("horse", "ros"));
    }

    @Test
    void example2() {
        assertEquals(5, editDistance.minDistance("intention", "execution"));
    }
}
