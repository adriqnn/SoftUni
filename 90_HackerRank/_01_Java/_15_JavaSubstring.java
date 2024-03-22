package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.Scanner;

public class _15_JavaSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String substring = scan.nextLine();
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(substring.substring(numbers[0], numbers[1]));

        scan.close();
    }
}
