package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _03_Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int elevatorCapacity = Integer.parseInt(scan.nextLine());

        // Print result
        System.out.printf("%.0f", Math.ceil(numberOfPeople * 1.00 / elevatorCapacity));

        scan.close();
    }
}
