package _01_ProgrammingBasics._07_ExamPrep._03_ExamPrep;

import java.util.Scanner;

public class _01_Excursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int count = Integer.parseInt(scan.nextLine());
        int night = Integer.parseInt(scan.nextLine());
        int cards = Integer.parseInt(scan.nextLine());
        int tickets = Integer.parseInt(scan.nextLine());

        // Add variable
        double nights = night * 20.00;
        double cards2 = cards * 1.60;
        double tickets2 = tickets * 6;
        double sum = nights + cards2 + tickets2;
        double sumWholeGroup = sum * count;
        double print = sumWholeGroup + (sumWholeGroup * 0.25);

        // Print result
        System.out.printf("%.2f", print);

        scan.close();
    }
}
