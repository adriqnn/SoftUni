package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Remove negative numbers
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) < 0 ) {
                numbersList.remove(i);
                i--;
            }
        }

        // Reverse list
        Collections.reverse(numbersList);

        // Print result
        if (numbersList.isEmpty()) {
            System.out.println("empty");
        } else {
            numbersList.stream().forEach(e-> System.out.print(e + " "));
        }

        scan.close();
    }
}
