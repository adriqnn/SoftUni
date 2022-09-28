package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder reverse = new StringBuilder(scan.nextLine());
        while(!reverse.toString().equals("end")) {
            String console = reverse.toString();
            reverse.reverse();
            System.out.printf("%s = %s%n", console, reverse);
            reverse = new StringBuilder(scan.nextLine());
        }
    }
}
