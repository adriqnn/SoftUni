package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._01_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        Arrays.stream(input).map(Integer::parseInt).sorted((left, right) -> right.compareTo(left)).limit(3).forEach(System.out::println);
    }
}
