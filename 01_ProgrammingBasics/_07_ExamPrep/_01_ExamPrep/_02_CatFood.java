package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _02_CatFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        int catBig = 0;
        int catMedium = 0;
        int catSmall = 0;
        int total = 0;

        // Calculate statistics
        for (int i = 0; i < n; i++) {
            int grams = Integer.parseInt(scan.nextLine());

            if (grams < 200) {
                catSmall++;
            } else if(grams < 300) {
                catMedium++;
            } else if(grams < 400) {
                catBig++;
            }
            
            total += grams;
        }

        double price = ((1.00 * total) / 1000) * 12.45;

        // Print result
        System.out.printf("Group 1: %d cats.%n", catSmall);
        System.out.printf("Group 2: %d cats.%n", catMedium);
        System.out.printf("Group 3: %d cats.%n", catBig);
        System.out.printf("Price for food per day: %.2f lv.", price);

        scan.close();
    }
}
