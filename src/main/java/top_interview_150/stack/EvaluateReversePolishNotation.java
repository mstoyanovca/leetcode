package top_interview_150.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        List<String> operators = List.of("+", "-", "*", "/");
        Deque<String> deque = new ArrayDeque<>();

        for (String s : tokens) {
            if (!operators.contains(s)) {
                // s is an integer:
                deque.add(s);
            } else {
                int secondOperand = Integer.parseInt(deque.removeLast());
                int firstOperand = Integer.parseInt(deque.removeLast());
                int result = switch (s) {
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
