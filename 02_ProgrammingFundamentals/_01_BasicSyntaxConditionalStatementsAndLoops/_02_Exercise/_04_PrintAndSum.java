package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nStart = Integer.parseInt(scan.nextLine());
        int nEnd = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = nStart; i <= nEnd; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
