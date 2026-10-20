package leet_code_75.monotonic_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!deque.isEmpty() && temperatures[i] > temperatures[deque.getFirst()]) {
                int index = deque.removeFirst();
                answer[index] = i - index;
            }
            deque.addFirst(i);
        }

        return answer;
    }
}
