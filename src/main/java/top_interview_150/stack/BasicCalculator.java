package top_interview_150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicCalculator {
    public int calculate(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        int sign = 1;
        int current = 0;
        int result = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                current = current * 10 + Character.getNumericValue(c);
            } else if (c == '+') {
                result += sign * current;
                current = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * current;
                current = 0;
                sign = -1;
            } else if (c == '(') {
                deque.add(result);
                deque.add(sign);
                current = 0;
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * current;
                int previousSign = deque.removeLast();
                result *= previousSign;
                int previousResult = deque.removeLast();
                result += previousResult;
                current = 0;
            }
        }

        return result + sign * current;
    }
}
