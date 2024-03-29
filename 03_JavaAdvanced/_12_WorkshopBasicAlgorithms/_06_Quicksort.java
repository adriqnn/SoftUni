package _03_JavaAdvanced._12_WorkshopBasicAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _06_Quicksort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        reader.close();
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSort = true;
            
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSort = false;
                }
            }
            
            if (isSort) {
                break;
            }
        }
        
        return arr;
    }
}
