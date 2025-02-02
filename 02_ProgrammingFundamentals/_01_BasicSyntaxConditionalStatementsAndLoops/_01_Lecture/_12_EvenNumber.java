package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _12_EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Determine if the input number is even and accept another number
        while (!console.equals("STOP")) {
            int n = Math.abs(Integer.parseInt(console));

            if (n % 2 == 0) {
                System.out.printf("The number is: %d%n", Math.abs(n));
                break;
            } else {
                System.out.printf("Please write an even number.%n");
            }

            console = scan.nextLine();
        }

        scan.close();
    }
}
