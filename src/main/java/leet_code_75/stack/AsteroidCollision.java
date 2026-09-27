package leet_code_75.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int a : asteroids) {
            if (deque.isEmpty() || deque.getLast() < 0 || a > 0) {
                deque.add(a);
            } else {
                while (!deque.isEmpty() && deque.getLast() > 0 && deque.getLast() < -a) {
                    deque.removeLast();
                }

                if (!deque.isEmpty() && deque.getLast() > 0 && deque.getLast() == -a) {
                    deque.removeLast();
                } else if (deque.isEmpty() || deque.getLast() < 0) {
                    deque.add(a);
                }
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
