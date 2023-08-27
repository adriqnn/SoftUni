package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _04_TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String town = scan.nextLine(), population = scan.nextLine(), area = scan.nextLine();

        // Print result
        System.out.printf("Town %s has population of %s and area %s square km.", town, population, area);
    }
}
