package leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicCalculator {
    public int calculate(String s) {
        char[] input = s.replace(" ", "").toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            deque.add(input[i]);
            if (i == input.length - 1) {
                while (!deque.isEmpty()) {
                    int leftOperand = Integer.parseInt(String.valueOf(deque.remove()));
                    char operator = deque.remove();
                    int rightOperand = Integer.parseInt(String.valueOf(deque.remove()));
                    int temp = switch (operator) {
                        case '+' -> leftOperand + rightOperand;
                        case '-' -> leftOperand - rightOperand;
                        default -> 0;
                    };
                    if (!deque.isEmpty()) {
                        deque.addFirst(Character.forDigit(temp, 10));
                    } else {
                        result = temp;
                    }
                }
            } else if (input[i] == ')') {
                deque.removeLast();
                while (deque.peek() != '(') {
                    int leftOperand = Integer.parseInt(String.valueOf(deque.remove()));
                    char operator = deque.remove();
                    int rightOperand = Integer.parseInt(String.valueOf(deque.remove()));
                    int temp = switch (operator) {
                        case '+' -> leftOperand + rightOperand;
                        case '-' -> leftOperand - rightOperand;
                        default -> 0;
                    };
                }
            }
        }

        return result;
    }
}
