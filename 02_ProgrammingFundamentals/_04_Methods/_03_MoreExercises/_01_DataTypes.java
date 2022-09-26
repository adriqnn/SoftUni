package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.Scanner;

public class _01_DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        if(type.equals("int")){
            int num1 = Integer.parseInt(scan.nextLine());
            printDataTypes(num1);
        }else if(type.equals("real")){
            double num2 = Double.parseDouble(scan.nextLine());
            printDataTypes(num2);
        }else if(type.equals("string")){
            String line = scan.nextLine();
            printDataTypes(line);
        }
    }

    private static void printDataTypes(int num1) {
        System.out.println(num1*2);
    }
    private static void printDataTypes(double num2) {
        System.out.printf("%.2f",num2*1.5);
    }
    private static void printDataTypes(String line) {
        String newString = "$" + line + "$";
        System.out.println(newString);
    }
}
