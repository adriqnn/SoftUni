package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> collect = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        if(collect.size() < 3){
            System.out.println(collect.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }else{
            System.out.print(collect.get(0));
            System.out.print(" ");
            System.out.print(collect.get(1));
            System.out.print(" ");
            System.out.print(collect.get(2));
        }
    }

}
