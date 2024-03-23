package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.Scanner;

public class _30_JavaSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(negativeSubs(array));

        scan.close();
    }

    private static int negativeSubs(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum<0){
                    count++;
                }
            }
        }

        return count;
    }
}
