package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] arrOne = scan.nextLine().split("\\s+");
        String[] arrTwo = scan.nextLine().split("\\s+");

        // Print common elements in two arrays
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {

                if (arrOne[i].equals(arrTwo[j])) {
                    System.out.print(arrTwo[j] + " ");
                }
            }
        }

        scan.close();
    }
}
