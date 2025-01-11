package _01_ProgrammingBasics._07_ExamPrep._04_ExamPrep;

import java.util.Scanner;

public class _03_PartyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String type = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        // Add variable
        double price = 0;

        // Determine the price based on the input
        switch (type) {
            case "Cake":
                if (days <= 15) {
                    price = 24.00 * count;
                } else {
                    price = 28.70 * count;
                }
                
                break;
            case "Souffle":
                if (days <= 15) {
                    price = 6.66 * count;
                } else {
                    price = 9.80 * count;
                }
                
                break;
            case "Baklava":
                if (days <= 15) {
                    price = 12.60 * count;
                } else {
                    price = 16.98 * count;
                }
                
                break;
        }

        // Add discount if requirements are met
        if (days <= 22) {
            if (price >= 100 && price <= 200) {
                price *= 0.85;
            } else if (price > 200) {
                price *= 0.75;
            }
        }

        // Add discount if requirements are met
        if (days <= 15) {
            price *= 0.90;
        }

        // Print result
        System.out.printf("%.2f", price);

        scan.close();
    }
}
