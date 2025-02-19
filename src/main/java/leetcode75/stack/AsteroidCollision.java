package leetcode75.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int a : asteroids) {
            if (deque.isEmpty()) {
                deque.add(a);
            } else if (!collide(deque.peekLast(), a)) {
                deque.add(a);
            } else {
                if (Math.abs(deque.peekLast()) == Math.abs(a)) {
                    deque.removeLast();
                } else if (Math.abs(deque.peekLast()) < Math.abs(a)) {
                    deque.removeLast();
                    deque.add(a);
                }
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean collide(int previous, int next) {
        return previous > 0 && next < 0;
    }
}
