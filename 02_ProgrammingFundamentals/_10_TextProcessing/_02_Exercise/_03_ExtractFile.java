package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _03_ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String[] console = scan.nextLine().split("\\\\");
        
        // Add variable
        String[] file = console[console.length-1].split("\\.");
        
        // Print result
        System.out.printf("File name: %s%nFile extension: %s%n", file[0], file[1]);
        
        scan.close();
    }
}
