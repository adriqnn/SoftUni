package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        List<String> productsList = new ArrayList<>();

        // Create list
        for (int i = 0; i < n; i++) {
            productsList.add(scan.nextLine());
        }

        // Arrange list
        Collections.sort(productsList);

        // Print result
        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productsList.get(i));
        }

        scan.close();
    }
}
