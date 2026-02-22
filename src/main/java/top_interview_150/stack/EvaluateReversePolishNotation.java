package top_interview_150.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class EvaluateReversePolishNotation {
    private final Set<String> operators = new HashSet<>(Set.of("+", "-", "*", "/"));

    public int evalRPN(String[] tokens) {
        Deque<String> deque = new ArrayDeque<>();

        for (String token : tokens) {
            if (!operators.contains(token)) {
                // token is an integer:
                deque.add(token);
            } else {
                int secondOperand = Integer.parseInt(deque.removeLast());
                int firstOperand = Integer.parseInt(deque.removeLast());
                int result = switch (token) {
                    case "+" -> firstOperand + secondOperand;
                    case "-" -> firstOperand - secondOperand;
                    case "*" -> firstOperand * secondOperand;
                    case "/" -> firstOperand / secondOperand;
                    default -> 0;
                };
                deque.add(String.valueOf(result));
            }
        }

        return Integer.parseInt(deque.remove());
    }
}
