package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int nStart = Integer.parseInt(scan.nextLine());
        int nEnd = Integer.parseInt(scan.nextLine());

        // Add variable
        int sum = 0;
        
        // Print the numbers
        for (int i = nStart; i <= nEnd; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        
        // Print result
        System.out.println();
        System.out.printf("Sum: %d", sum);
        
        scan.close();
    }
}
