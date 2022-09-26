package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Scanner;

public class _04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split("\\s+");

        for (int i = 0; i < arr.length/2; i++) {
            String first = arr[i];
            String last = arr[arr.length-i-1];
            arr[i] = last;
            arr[arr.length-1-i] = first;
        }
        for (String e: arr) {
            System.out.print(e + " ");
        }
    }
}
