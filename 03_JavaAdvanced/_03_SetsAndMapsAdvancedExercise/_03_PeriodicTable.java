package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> elements = new TreeSet<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(input));
            /*for (int j = 0; j < input.length; j++) {
                elements.add(input[j]);
            }*/
            /*Collections.addAll(elements,input);*/
        }
        for (String e : elements) {
            System.out.print(e + " ");
        }
    }
}
