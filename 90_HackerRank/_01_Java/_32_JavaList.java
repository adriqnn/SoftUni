package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _32_JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int line = Integer.parseInt(scan.nextLine()) * 2;

        for (int i = 0; i < line; i = i+2) {
            String command = scan.nextLine();

            if(command.equals("Insert")){
                int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                numbers.add(array[0], array[1]);
            }else if(command.equals("Delete")){
                int number = Integer.parseInt(scan.nextLine());
                numbers.remove(number);
            }
        }

        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        scan.close();
    }
}
