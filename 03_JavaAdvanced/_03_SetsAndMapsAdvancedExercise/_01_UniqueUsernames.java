package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        int n = Integer.parseInt(scan.nextLine());
        
        // Add variable
        Set<String> usernames = new LinkedHashSet<>();
        
        // Make database for unique usernames
        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();
            
            usernames.add(console);
        }
        
        // Print result
        usernames.forEach(System.out::println);
        
        scan.close();
    }
}
