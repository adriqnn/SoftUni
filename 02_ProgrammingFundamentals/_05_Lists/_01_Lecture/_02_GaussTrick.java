package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> listNumbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        // List<String> hmm = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());

        // Add variable
        int middle = listNumbers.size() / 2;

        // Sum numbers in the given pattern
        for (int i = 0; i < middle; i++) {
            listNumbers.set(i, listNumbers.get(i) + listNumbers.get(listNumbers.size() - 1));
            listNumbers.remove(listNumbers.size() - 1);
        }

        //System.out.println(listNumbers);
        listNumbers.stream().forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
