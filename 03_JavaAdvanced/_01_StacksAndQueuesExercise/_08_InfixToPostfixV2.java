package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _08_InfixToPostfixV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] tokens = scan.nextLine().split(" ");

        // Operator stack
        Deque<String> operatorStack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperand(token)) {
                // Operand, output directly
                System.out.print(token + " ");
            } else if (token.equals("(")) {
                // Left parenthesis, push onto stack
                operatorStack.push(token);
            } else if (token.equals(")")) {
                // Right parenthesis, pop and output operators until left parenthesis
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                    System.out.print(operatorStack.pop() + " ");
                }
                if (!operatorStack.isEmpty() && operatorStack.peek().equals("(")) {
                    operatorStack.pop(); // Remove the left parenthesis
                }
            } else {
                // Operator
                while (!operatorStack.isEmpty() && precedence(getOperatorType(token)) <= precedence(getOperatorType(operatorStack.peek()))) {
                    System.out.print(operatorStack.pop() + " ");
                }
                operatorStack.push(token);
            }
        }

        // Pop remaining operators from the stack
        while (!operatorStack.isEmpty()) {
            System.out.print(operatorStack.pop() + " ");
        }
    }

    private static boolean isOperand(String token) {
        return !token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/") && !token.equals("(") && !token.equals(")");
    }

    private static int getOperatorType(String operator) {
        switch (operator) {
            case "+":
                return 0;
            case "-":
                return 1;
            case "*":
                return 2;
            case "/":
                return 3;
            default:
                return -1;
        }
    }

    private static int precedence(int operatorType) {
        int[] precedence = {1, 1, 2, 2};
        if (operatorType >= 0 && operatorType < precedence.length) {
            return precedence[operatorType];
        }
        return -1; // Handle invalid operatorType gracefully
    }
}
