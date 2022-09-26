package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double epsilon = 0.000001;
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());

        System.out.println(Math.abs(n1 - n2) <= epsilon ? "True":"False");
    }
}
