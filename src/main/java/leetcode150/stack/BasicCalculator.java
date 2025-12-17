package leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BasicCalculator {
    public int calculate(String s) {
        String[] input = s.replace(" ", "").split("(?<=\\+)|(?=\\+)|(?<=-)|(?=-)|(?<=\\()|(?=\\()|(?<=\\))|(?=\\))");
        Queue<Integer> queue = new ArrayDeque<>();
        int result = 0;
        String operator = "+";
        int negation = 1;

        // I assume:
        // time complexity O(n)
        // space complexity O(n)
        for (String string : input) {
            switch (string) {
                case "+" -> {
                    operator = "+";
                }
                case "-" -> {
                    operator = "-";
                }
                case "(" -> {
                    if (result != 0) queue.add(result);
                    result = 0;
                    if (operator.equals("-")) {
                        negation *= -1;
                        operator = "+";
                    }
                }
                case ")" -> {
                    if (negation == -1) negation = 1;
                    while (!queue.isEmpty()) {
                        result += queue.remove();
                    }
                }
                default -> {
                    switch (operator) {
                        case "+" -> result += negation * Integer.parseInt(string);
                        case "-" -> result -= negation * Integer.parseInt(string);
                        default -> throw new IllegalStateException("invalid operator");
                    }
                    int x = 0;
                }
            }
        }

        return result;
    }

    public int calculate1(String s) {
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
