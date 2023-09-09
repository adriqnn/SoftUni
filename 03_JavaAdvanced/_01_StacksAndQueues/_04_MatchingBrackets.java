package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String expression = scan.nextLine();

        // Add variable
        ArrayDeque<Integer> stackOfBrackets = new ArrayDeque<>();

        // Determine if the brackets are matching
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if(current == '('){
                stackOfBrackets.push(i);
            }else if (current == ')'){
                int begin = stackOfBrackets.pop();

                // Print result
                System.out.println(expression.substring(begin, i+1));
            }
        }

        scan.close();
    }
}
