package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._01_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input values
        String[] input = scan.nextLine().split(" ");

        // Sort, limit and print result
        Arrays.stream(input).map(Integer::parseInt).sorted((left, right) -> right.compareTo(left)).limit(3).forEach(System.out::println);
        
        scan.close();
    }
