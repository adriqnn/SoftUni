package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _03_GoldMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n1 = Integer.parseInt(scan.nextLine());

        // Determine the outcome of the gold collecting
        for (int i = 1; i <= n1; i++) {
            double average = Double.parseDouble(scan.nextLine());
            double n2 = Double.parseDouble(scan.nextLine());

            double total = 0;

            for (int j = 1; j <= n2; j++) {
                double goldPerDay = Double.parseDouble(scan.nextLine());
                total += goldPerDay;
            }

            double average2 = total / n2;

            // Print result
            if (average2 >= average) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", average2);
            } else {
                System.out.printf("You need %.2f gold.%n", average - average2);
            }
        }
        
        scan.close();
    }
}
