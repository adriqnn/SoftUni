package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _01_StudentInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int age = scan.nextInt();
        double grade = scan.nextDouble();


        System.out.println(studentPrint(name,age,grade));
    }
    private static String studentPrint(String name, int age, double grade) {
        return String.format("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }
}
