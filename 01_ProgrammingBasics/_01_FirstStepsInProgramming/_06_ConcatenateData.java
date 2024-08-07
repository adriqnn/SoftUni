package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _06_ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        // Print formatted message
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
        
        scan.close();
    }
}
