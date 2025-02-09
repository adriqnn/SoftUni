package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList1 = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbersList2 = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Add variables
        List<Integer> newNumbersList1and2 = new ArrayList<>();
        int sizeOfSmaller = Math.min(numbersList1.size(), numbersList2.size());

        // Merge the lists based on the smaller one
        for (int i = 0; i < sizeOfSmaller; i++) {
            newNumbersList1and2.add(numbersList1.get(i));
            newNumbersList1and2.add(numbersList2.get(i));
        }

        // Continue merging the lists
        if (numbersList1.size() < numbersList2.size()) {
            for (int i = sizeOfSmaller; i < numbersList2.size(); i++) {
                newNumbersList1and2.add(numbersList2.get(i));
            }
        } else {
            for (int i = sizeOfSmaller; i < numbersList1.size(); i++) {
                newNumbersList1and2.add(numbersList1.get(i));
            }
        }

        // Print result
        newNumbersList1and2.stream().forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
