package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> usernames = new LinkedHashSet<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();
            usernames.add(console);
        }
        usernames.forEach(System.out::println);
    }
}
