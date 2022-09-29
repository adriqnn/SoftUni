package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int countProjects = Integer.parseInt(scan.nextLine());
        int allHours = countProjects*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, allHours, countProjects);
    }
}
