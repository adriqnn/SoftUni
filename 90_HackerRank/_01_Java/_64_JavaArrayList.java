package _05_HackerRank._01_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _64_JavaArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add( Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray());
        }
        
        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++) {
            String[] line = scan.nextLine().split("\\s+");
            int indexOne = Integer.parseInt(line[0]);
            int indexTwo = Integer.parseInt(line[1]);
            try{
                int i1 = list.get(indexOne-1)[indexTwo];
                System.out.println(i1);
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
