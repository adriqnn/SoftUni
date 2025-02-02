package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        // Add variables
        int timePlus30 = hours * 60 + minutes + 30;
        int newHour = timePlus30 / 60;
        int newMinutes = timePlus30 % 60;

        if (newHour > 23) {
            newHour = 0;
        }

        // Print result
        System.out.printf("%d:%02d", newHour, newMinutes);

        scan.close();
    }
}
