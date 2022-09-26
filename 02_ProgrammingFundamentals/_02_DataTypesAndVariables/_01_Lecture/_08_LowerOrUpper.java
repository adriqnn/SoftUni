package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        char symbol = console.charAt(0);

        if (symbol >= 97){
            System.out.println("lower-case");
        }else{
            System.out.println("upper-case");
        }
    }
}
