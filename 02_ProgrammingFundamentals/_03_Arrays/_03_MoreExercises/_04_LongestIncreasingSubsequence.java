package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] console = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // Add variables
        int[] empty = new int[console.length];
        Arrays.fill(empty, 1);
        int max = 0;

        // End if the length is 1
        if (console.length <= 1) {
            System.out.println(console.length);
            return;
        }

        // Find the LIS
        for (int i = 1; i < console.length; i++) {
            for (int j = 0; j < i; j++) {
                if (console[j] < console[i] && empty[i] <= empty[j]) {
                    empty[i] = empty[j] + 1;
                }
                
                if (max < empty[i]) {
                    max++;
                }
            }
        }

        // More variables
        int value = 0;
        int sequence = max;
        int[] print = new int[sequence];
        int count = 0;

        // Leftmost LIS
        for (int i = empty.length - 1; i >= 0; i--) {
            if (empty[i] == sequence) {
                print[count] = i;
                value = console[i];
            }
        }

        sequence--;
        count++;

        while (sequence != 0) {
            for (int i = 0; i < empty.length; i++) {
                if (empty[i] == sequence && console[i] < value) {
                    print[count] = i;
                    sequence--;
                    count++;
                    value = console[i];
                    break;
                }
            }
        }

        // Arrange and print the result
        int[] print2 = new int[print.length];
        for (int i = 0; i < print.length; i++) {
            print2[i] = console[print[i]];
        }
        
        Arrays.sort(print2);
        for (int i = 0; i < print2.length; i++) {
            System.out.print(print2[i] + " ");
        }

        scan.close();
    }
}
