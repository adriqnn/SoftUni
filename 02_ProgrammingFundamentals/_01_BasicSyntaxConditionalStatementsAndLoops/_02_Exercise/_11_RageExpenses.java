package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int l = Integer.parseInt(scan.nextLine());
        double headset = Double.parseDouble(scan.nextLine());
        double mouse = Double.parseDouble(scan.nextLine());
        double keyboard = Double.parseDouble(scan.nextLine());
        double display = Double.parseDouble(scan.nextLine());

        // Add variables
        double headset2 = 0;
        double mouse2 = 0;
        double keyboard2 = 0;

        // Make a statistic for the items
        for (int i = 1; i <= l; i++) {
            if (i % 2 == 0) {
                headset2++;
            }

            if (i % 3 == 0) {
                mouse2++;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                keyboard2++;
            }
        }

        // Calculate prices
        double display2 = Math.floor(keyboard2 / 2);
        double total = (headset * headset2) + (mouse * mouse2) + (keyboard * keyboard2) + (display2 * display);

        // Print result
        System.out.printf("Rage expenses: %.2f lv.", total);

        scan.close();
    }
}
