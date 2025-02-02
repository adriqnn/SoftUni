package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        // Print the multiplication based on the input
        if (n2 > 10) {
            System.out.printf("%d X %d = %d%n", n1, n2, n1 * n2);
        } else {
            for (int i = n2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n1, i, n1 * i);
            }
        }

        scan.close();
    }
}
