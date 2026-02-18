package top_interview_150.stack;

import java.util.*;

public class BasicCalculator {
    public int calculate(String s) {
        String[] input = s.replace(" ", "").split("(?<=\\+)|(?=\\+)|(?<=-)|(?=-)|(?<=\\()|(?=\\()|(?<=\\))|(?=\\))");
        Queue<Integer> queue = new ArrayDeque<>();
        int result = 0;
        String operator = "+";
        int negation = 1;
        int nestingLevel = 0;
        Map<Integer, Integer> nestingLevelToNegation = new HashMap<>();

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
                    nestingLevel++;
                    if (operator.equals("-")) {
                        negation *= -1;
                        operator = "+";
                    }
                    nestingLevelToNegation.put(nestingLevel, negation);

                    if (result != 0) queue.add(result);
                    result = 0;
                }
                case ")" -> {
                    nestingLevel--;
                    negation = nestingLevelToNegation.getOrDefault(nestingLevel, 1);

                    while (!queue.isEmpty()) {
                        result += queue.remove();
                    }
                }
                default -> {
                    switch (operator) {
                        case "+" ->
                                result += nestingLevelToNegation.getOrDefault(nestingLevel, 1) * Integer.parseInt(string);
                        case "-" ->
                                result += nestingLevelToNegation.getOrDefault(nestingLevel, 1) * Integer.parseInt("-" + string);
                        default -> throw new IllegalStateException("invalid operator");
                    }
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
