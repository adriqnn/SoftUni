package _05_HackerRank._01_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _16_JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        List<String> subs = new ArrayList<>();

        for (int i = 0; i <= line.length()-n; i++) {
            String add = "";
            for (int j = 0; j < n; j++) {
                add += line.charAt(i + j);
            }

            subs.add(add);
        }

        Collections.sort(subs);
        System.out.println(subs.get(0));
        System.out.println(subs.get(subs.size() - 1));

        scan.close();
    }
}
