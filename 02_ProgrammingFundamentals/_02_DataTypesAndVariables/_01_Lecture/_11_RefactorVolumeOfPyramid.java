package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double length = Double.parseDouble(scan.nextLine()), width = Double.parseDouble(scan.nextLine()), height = Double.parseDouble(scan.nextLine());

        // Print result
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", (length * width * height) / 3);

        scan.close();
    }
}
