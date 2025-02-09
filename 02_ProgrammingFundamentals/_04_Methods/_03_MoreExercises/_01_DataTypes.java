package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.Scanner;

public class _01_DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String type = scan.nextLine();

        // Determine the data type of the input
        if (type.equals("int")) {
            int num = Integer.parseInt(scan.nextLine());

            printDataTypes(num);
        } else if (type.equals("real")) {
            double num = Double.parseDouble(scan.nextLine());

            printDataTypes(num);
        } else if (type.equals("string")) {
            String line = scan.nextLine();

            printDataTypes(line);
        }

        scan.close();
    }

    private static void printDataTypes(int num) {
        System.out.println(num * 2);
    }

    private static void printDataTypes(double num) {
        System.out.printf("%.2f", num * 1.5);
    }

    private static void printDataTypes(String line) {
        String newString = "$" + line + "$";
        System.out.println(newString);
    }
}
