package _05_HackerRank._01_Java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _49_JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        for(int i = 0; i < n; i++){
            list.add(scan.nextLine());
        }

        list.add("###");

        for(int i = 0; i < m; i++){
            list.add(scan.nextLine());
        }

        int i = list.indexOf("###");
        System.out.println(list.subList(i+1, list.size()).stream().collect(Collectors.joining("\n")));
    }
}
