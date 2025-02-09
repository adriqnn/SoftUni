package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Double> listNumbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        // Sum adjacent numbers in list
        for (int i = 0; i < listNumbers.size() - 1; i++) {
            if (listNumbers.get(i).equals(listNumbers.get(i + 1))) {
                double sum = listNumbers.get(i) + listNumbers.get(i + 1);
                listNumbers.set(i, sum);
                listNumbers.remove(i + 1);
                i = -1;
            }
        }

        // Print result
        DecimalFormat format = new DecimalFormat("0.#");
        listNumbers.forEach(e -> System.out.print(format.format(e) + " "));

        scan.close();
    }
}
