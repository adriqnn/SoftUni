package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        
        // Add comparator value
        double epsilon = 0.000001;

        // Print result
        System.out.println(Math.abs(n1 - n2) <= epsilon ? "True" : "False");
        
        scan.close();
    }
}
