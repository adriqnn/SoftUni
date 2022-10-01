package _03_JavaAdvanced._12_WorkshopBasicAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class _01_RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = calcSum(arr,0);
        System.out.println(sum);
    }

    private static int calcSum(int[] arr, int i) {
        if(i == arr.length - 1){
            return arr[i];
        }
        return arr[i] + calcSum(arr,i+1);
    }
}
