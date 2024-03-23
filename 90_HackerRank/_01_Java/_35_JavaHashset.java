package _05_HackerRank._01_Java;

import java.util.HashSet;
import java.util.Scanner;

public class _35_JavaHashset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> pairs = new HashSet<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine().toLowerCase();
            pairs.add(input);

            System.out.println(pairs.size());
        }

        scan.close();
    }
}
