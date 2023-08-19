package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _05_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        // Read new input value
        for (int i = 0; i < n; i++) {
            String site = scan.nextLine();

            // Deduct salary based on the social media site visited
            switch (site) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            // Check if the salary has gone negative
            if (salary <= 0) {
                break;
            }
        }

        // Print the result based on the salary
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }

        scan.close();
    }
}
