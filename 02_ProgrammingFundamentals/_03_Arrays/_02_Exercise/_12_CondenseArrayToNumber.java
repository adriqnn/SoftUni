package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _12_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while (arr.length > 1) {
            int[] arrNew = new int[arr.length - 1];

            for (int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i] + arr[i + 1];
            }

            arr = arrNew;
        }

        System.out.println(arr[0]);
    }
}
