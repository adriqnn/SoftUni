package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0;
        String resultType = "";

        // Perform the selected operation based on the operator
        if (operator.equals("+")) {
            result = numberOne + numberTwo;
        } else if (operator.equals("-")) {
            result = numberOne - numberTwo;
        } else if (operator.equals("*")) {
            result = numberOne * numberTwo;
        } else if (operator.equals("/")) {
            if (numberTwo != 0) {
                result = numberOne * 1.0 / numberTwo;
            } else {
                System.out.printf("Cannot divide %d by zero%n", numberOne);
                return; // Exit the program if division by zero
            }
        } else if (operator.equals("%")) {
            if (numberTwo != 0) {
                result = numberOne % numberTwo;
            } else {
                System.out.printf("Cannot divide %d by zero%n", numberOne);
                return; // Exit the program if division by zero
            }
        }

        // Determine whether the result is even or odd for +, -, and *
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                resultType = "even";
            } else {
                resultType = "odd";
            }
        }

        // Display the result based on the operation and input values
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s%n", numberOne, operator, numberTwo, result, resultType);
        } else if (operator.equals("/")) {
            System.out.printf("%d %s %d = %.2f%n", numberOne, operator, numberTwo, result);
        } else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %.0f%n", numberOne, operator, numberTwo, result);
        }
        
        scan.close();
    }
}
