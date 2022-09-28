package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._01_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class _04_WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        Arrays.stream(input).filter(word -> word.length() % 2 == 0).forEach(word -> System.out.println(word));
    }
}
