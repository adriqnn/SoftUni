package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _03_ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] console = scan.nextLine().split("\\\\");
        String[] file = console[console.length-1].split("\\.");
        System.out.printf("File name: %s%nFile extension: %s%n", file[0],file[1]);
    }
}
