package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());
        String presentationName = scan.nextLine();

        // Add variables
        double totalAverage = 0;
        int presentationCount = 0;

        // Evaluate all presentations
        while (!presentationName.equals("Finish")) {
            presentationCount++;
            double presentationAverage = 0;

            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                presentationAverage += grade;
            }
            
            totalAverage += presentationAverage/n;
            
            System.out.printf("%s - %.2f.%n", presentationName, presentationAverage/n);
            presentationName = scan.nextLine();
        }
        
        double finalAverage = totalAverage / presentationCount;
        
        // Print the result
        System.out.printf("Student's final assessment is %.02f.%n", finalAverage);
        
        scan.close();
    }
}
