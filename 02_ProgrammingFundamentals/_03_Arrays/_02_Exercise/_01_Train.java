package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] train = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            train[i] = (scan.nextInt());
            sum += train[i];
        }
        Arrays.stream(train).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(sum);
    }
}
