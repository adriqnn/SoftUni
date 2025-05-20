package _02_ProgrammingFundamentals._10_TextProcessing._03_MoreExercises;

import java.util.Scanner;

public class _02_ASCIISumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        char one = scan.nextLine().charAt(0);
        char two = scan.nextLine().charAt(0);
        String consoleLine = scan.nextLine();

        // Add variable
        StringBuilder charList = new StringBuilder();

        // Generate character string
        for (int i = one + 1; i < two; i++) {
            charList.append((char) i);
        }

        int sum = 0;
        
        // Extract repeating characters
        for (int i = 0; i < charList.length(); i++) {
            for (int j = 0; j < consoleLine.length(); j++) {
                if (charList.charAt(i) == consoleLine.charAt(j)) {
                    sum += charList.charAt(i);
                }
            }
        }
        
        // Print result
        System.out.println(sum);
        
        scan.close();
    }
}
