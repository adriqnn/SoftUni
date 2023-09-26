package _02_ProgrammingFundamentals._08_MidExam;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        double everything = 0;
        
        // Calculate price
        for (int i = 0; i < n; i++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsuleCount = Integer.parseInt(scan.nextLine());
            
            double total = ((days * capsuleCount) * pricePerCapsule);
            everything += total;
            System.out.printf("The price for the coffee is: $%.2f%n", total);
        }
        
        // Print result
        System.out.printf("Total: $%.2f%n", everything);
        
        scan.close();
    }
}
