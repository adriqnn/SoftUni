package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _01_ProfitAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String name = scan.nextLine();
        int adults = Integer.parseInt(scan.nextLine());
        int other = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        double fee = Double.parseDouble(scan.nextLine());

        // Add variables
        double adults2 = (price + fee) * adults;
        double other2 = ((price * 0.30) + fee) * other;
        double sum = (adults2 + other2) * 0.20;

        // Print result
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, sum);

        scan.close();
    }
}
