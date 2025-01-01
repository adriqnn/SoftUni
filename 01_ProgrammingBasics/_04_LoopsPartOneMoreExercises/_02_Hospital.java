package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _02_Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int hospitalPeriod = Integer.parseInt(scan.nextLine());

        // Add variables
        int availableDoctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        // Loop through each day of the hospital period
        for (int i = 1; i <= hospitalPeriod; i++) {
            // Check if it's a day to evaluate doctor availability
            if (i % 3 == 0 && untreatedPatients > treatedPatients) {
                availableDoctors++;
            }

            // Read the number of patients for the current day
            int patients = Integer.parseInt(scan.nextLine());

            // Treat patients based on doctor availability
            if (availableDoctors >= patients) {
                treatedPatients += patients;
            } else {
                treatedPatients += availableDoctors;
                untreatedPatients += Math.abs(patients - availableDoctors);
            }
        }

        // Print the number of treated and untreated patients
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);

        scan.close();
    }
}
