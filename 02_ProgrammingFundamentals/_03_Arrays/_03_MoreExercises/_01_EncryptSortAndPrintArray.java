package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Add variable
        int[] listOfNamesValues = new int[num];

        // Transform the strings into numeric values
        for (int i = 0; i < num; i++) {
            String console = scan.nextLine();

            int sum = 0;

            for (int j = 0; j < console.length(); j++) {
                char symbol = console.charAt(j);

                if (symbol == 'a' || symbol == 'e' || symbol == 'u' || symbol == 'i' || symbol == 'o') {
                    sum += symbol * console.length();
                } else if (symbol == 'A' || symbol == 'E' || symbol == 'U' || symbol == 'I' || symbol == 'O') {
                    sum += symbol * console.length();
                } else {
                    sum +=  symbol / console.length();
                }
            }

            listOfNamesValues[i] = sum;
        }

        // Print result
        Arrays.sort(listOfNamesValues);
        Arrays.stream(listOfNamesValues).forEach(System.out::println);

        scan.close();
    }
}
