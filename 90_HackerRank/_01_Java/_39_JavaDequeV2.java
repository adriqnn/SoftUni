package _05_HackerRank._01_Java;

import java.util.*;

public class _39_JavaDequeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = scan.nextInt();
        int m = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            list.add(num);
        }

        int max = 0;
        for (int i = 0; i <= n-m; i++) {
            List<Integer> sublist = list.subList(i, i+m);
            Set<Integer> unique = new HashSet<>(sublist);
            max = Math.max(unique.size(), max);
        }
        System.out.println(max);
    }
}
