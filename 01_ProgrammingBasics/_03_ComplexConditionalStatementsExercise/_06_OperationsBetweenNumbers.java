package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0;
        String type = "";

        if (operator.equals("+")){
            result += (num1*(1.00)) + num2;
        } else if (operator.equals("-")){
            result += (num1*1.00) - num2;
        } else if (operator.equals("*")){
            result += (num1*1.00) * num2;
        } else if (operator.equals("/")){
            result += (num1*(1.00)) / num2;
        }else if (operator.equals("%")){
            result += (num1*(1.00)) % num2;
        }

        double result2 = result*1.00;
        boolean isValid = num2 != 0;

        if ((operator.equals("+")) || (operator.equals("-")) || (operator.equals("*"))){
            if (result%2 ==0){
                type = "even";
                System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result,type);
            }else{
                type = "odd";
                System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result,type);
            }
        }else if (operator.equals("/")){
            if (!isValid)
                System.out.printf("Cannot divide %d by zero", num1);
            else{
                System.out.printf("%d %s %d = %.2f", num1, operator, num2, result);
            }
        }else if (operator.equals("%")) {
            if (!isValid)
                System.out.printf("Cannot divide %d by zero", num1);
            else {
                System.out.printf("%d %s %d = %.0f", num1, operator, num2, result);
            }
        }
    }
}
