package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class _03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
