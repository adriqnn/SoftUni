package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _06_VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String text = scan.nextLine();

        int sum = 0;

        // Iterate through the input value text and sum all the vowels
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            switch (symbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }

        // Print the sum of vowel values
        System.out.println(sum);

        scan.close();
    }
}
