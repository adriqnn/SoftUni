package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _02_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input radians
        double radians = Double.parseDouble(scan.nextLine());

        // Convert radians to degrees
        double degrees = radians * 180 / Math.PI;

        // Print the converted degrees
        System.out.println(degrees);
        
        scan.close();
    }
}
