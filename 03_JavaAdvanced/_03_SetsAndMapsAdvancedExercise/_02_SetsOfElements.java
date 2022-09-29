package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String console = scan.nextLine();
        int n1 = Integer.parseInt(console.split("\\s+")[0]);
        int n2 = Integer.parseInt(console.split("\\s+")[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < n1; i++) {
            int n = Integer.parseInt(scan.nextLine());
            firstSet.add(n);
        }
        for (int i = 0; i < n2; i++) {
            int n = Integer.parseInt(scan.nextLine());
            secondSet.add(n);
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(number -> System.out.print(number + " "));
    }
}
