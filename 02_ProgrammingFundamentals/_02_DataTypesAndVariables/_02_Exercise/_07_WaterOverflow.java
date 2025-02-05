package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        int capacity = 0;

        // Determine the capacity
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scan.nextLine());
            
            if (capacity + liters > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            
            capacity += liters;
        }

        // Print result
        System.out.println(capacity);

        scan.close();
    }
}
