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
                while (!deque.isEmpty() &&
                        collide(deque.peekLast(), a) &&
                        Math.abs(deque.peekLast()) < Math.abs(a)) {
                    deque.removeLast();
                }
                if (!deque.isEmpty() &&
                        collide(deque.peekLast(), a) &&
                        Math.abs(deque.peekLast()) == Math.abs(a)) {
                    deque.removeLast();
                } else if (!deque.isEmpty() &&
                        collide(deque.peekLast(), a) &&
                        Math.abs(deque.peekLast()) > Math.abs(a)) {
                    // do not add to deque
                } else {
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
