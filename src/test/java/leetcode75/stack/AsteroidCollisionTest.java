package leetcode75.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AsteroidCollisionTest {
    private final AsteroidCollision collision = new AsteroidCollision();

    @Test
    void example1() {
        assertArrayEquals((new int[]{5, 10}), collision.asteroidCollision(new int[]{5, 10, -5}));
    }

    @Test
    void example2() {
        assertArrayEquals((new int[]{}), collision.asteroidCollision(new int[]{8, -8}));
    }

    @Test
    void example3() {
        assertArrayEquals((new int[]{10}), collision.asteroidCollision(new int[]{10, 2, -5}));
    }

    @Test
    void example4() {
        assertArrayEquals((new int[]{-2, -1, 1, 2}), collision.asteroidCollision(new int[]{-2, -1, 1, 2}));
    }

    @Test
    void example5() {
        assertArrayEquals((new int[]{-2, -2, -2}), collision.asteroidCollision(new int[]{-2, -2, 1, -2}));
    }
}
