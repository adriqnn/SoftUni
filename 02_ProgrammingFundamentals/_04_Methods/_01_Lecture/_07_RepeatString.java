package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _07_RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String console = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        
        // Create method that repeats a string
        repeatString(console, num);
        
        scan.close();
    }

    private static void repeatString(String console, int num) {
        StringBuilder newString = new StringBuilder();
        
        for (int i = 0; i < num; i++) {
            newString.append(console);
        }
        
        System.out.println(newString);
    }
}
