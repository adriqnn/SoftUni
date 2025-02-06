package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Scanner;

public class _01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ,"Saturday", "Sunday"};

        // Print result
        try {
            System.out.println(days[n - 1]);
        } catch (Exception e) {
            System.out.println("Invalid day!");
        }

        scan.close();
    }
}
