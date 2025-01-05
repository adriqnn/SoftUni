package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _02_PuppyCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int food = Integer.parseInt(scan.nextLine());
        String console = scan.nextLine();

        // Add variables
        int gramsFood = food * 1000;
        int gramsTotal = 0;

        // Calculate the food
        while (!console.equals("Adopted")) {
            int grams = Integer.parseInt(console);
            gramsTotal += grams;

            console = scan.nextLine();
        }

        // Print result
        if (gramsFood >= gramsTotal) {
            System.out.printf("Food is enough! Leftovers: %d grams.", gramsFood - gramsTotal);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", gramsTotal - gramsFood);
        }

        scan.close();
    }
}
