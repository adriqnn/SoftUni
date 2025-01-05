package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _01_RoomPainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int cans = Integer.parseInt(scan.nextLine());
        int rolls = Integer.parseInt(scan.nextLine());
        double gloves = Double.parseDouble(scan.nextLine());
        double brush =  Double.parseDouble(scan.nextLine());

        // Add variables
        double cans2 = cans * 21.5;
        double rolls2 = rolls * 5.2;
        double gloves2 = Math.ceil(rolls * 1.00 * 0.35);
        double gloves3 = gloves2 * gloves;
        double brush2 = Math.floor(cans * 1.00 * 0.48);
        double brush3 = brush2 * brush;

        // Calculate
        double total = cans2 + rolls2 + gloves3 + brush3;
        double price = total / 15;

        // Print result
        System.out.printf("This delivery will cost %.2f lv.", price);

        scan.close();
    }
}
