package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _03_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringToRemove = scan.nextLine();
        String consoleString = scan.nextLine();
        while(consoleString.contains(stringToRemove)){
            consoleString = consoleString.replaceFirst(stringToRemove,"");
        }
        System.out.println(consoleString);
    }
}
