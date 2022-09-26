package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _05_ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String one = scan.nextLine(),two = scan.nextLine(),three = scan.nextLine();
        System.out.println(one+three+two);
    }
}
