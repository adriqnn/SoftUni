package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _01_BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double inheritance = Double.parseDouble(scan.nextLine());
        double targetYear = Double.parseDouble(scan.nextLine());

        double money = inheritance;

        // Calculate money spent for each year from 1800 to the target year
        for (int i = 1800; i <= targetYear; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + (((i - 1800) + 18) * 50);
            }
        }

        // Determine and print the result based on the remaining money
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }

        scan.close();
    }
}
