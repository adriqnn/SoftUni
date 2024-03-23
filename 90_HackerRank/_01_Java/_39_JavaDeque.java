package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _39_JavaDeque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int unique = 0;
        for (int i = 0; i <= n-m; i++) {
            HashSet<Integer> uniques = new HashSet<>();
            for (int j = i; j < i+m; j++) {
                uniques.add(numbers[j]);
            }

            if(uniques.size() > unique) {
                unique = uniques.size();
            }
        }

        System.out.println(unique);

        scan.close();
    }
}
