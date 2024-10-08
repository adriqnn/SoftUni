package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_BalancedParenthesesV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value and determine if the brackets are matching
        while (scan.hasNext()) {
            String input = scan.nextLine();
            System.out.println(areParenthesesBalanced(input) ? "YES" : "NO");
        }

        scan.close();
    }

    // Method that determines if brackets are balanced
    public static boolean areParenthesesBalanced(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char bracket : s.toCharArray()) {
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else if (isClosingBracket(bracket)) {
                if (stack.isEmpty() || !areMatchingBrackets(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Method that determines if bracket is opening
    public static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    // Method that determine if bracket is closing
    public static boolean isClosingBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    // Method that determines if brackets are matching
    public static boolean areMatchingBrackets(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}

