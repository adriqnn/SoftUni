package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _04_TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine(),population = scan.nextLine(),square = scan.nextLine();
        System.out.printf("Town %s has population of %s and area %s square km.", town,population,square);
    }
}
