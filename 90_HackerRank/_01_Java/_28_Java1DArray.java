package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _28_Java1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrN = Integer.parseInt(scan.nextLine());
            arr[i] = arrN;
        }

        for (int e : arr) {
            System.out.println(e);
        }

        scan.close();
    }
}
