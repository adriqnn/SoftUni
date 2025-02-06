package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Scanner;

public class _04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] arr = scan.nextLine().split("\\s+");

        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
            String first = arr[i];
            String last = arr[arr.length - i - 1];
            arr[i] = last;
            arr[arr.length - 1 - i] = first;
        }

        // Print result
        for (String e: arr) {
            System.out.print(e + " ");
        }

        scan.close();
    }
}
