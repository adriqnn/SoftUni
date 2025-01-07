package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        String name = scan.nextLine();
        int projectsCount = Integer.parseInt(scan.nextLine());

        // Calculate total hours
        int allHours = projectsCount * 3;

        // Print formatted message
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, allHours, projectsCount);

        // Old version
        /* System.out.printf("The architect %s will need %d hours to complete %d project%s.", name, allHours, projectsCount, projectsCount == 1 ? "" : "s"); */

        scan.close();
    }
}
