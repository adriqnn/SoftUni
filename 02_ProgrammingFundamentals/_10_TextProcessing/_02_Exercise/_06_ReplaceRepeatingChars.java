package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder console = new StringBuilder(scan.nextLine());
        for (int i = 1; i < console.length(); i++) {
            if(console.charAt(i) == console.charAt(i-1)){
                console.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(console);
    }
}
