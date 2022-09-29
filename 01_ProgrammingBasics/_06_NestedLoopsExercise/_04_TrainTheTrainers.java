package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String console = scan.nextLine();

        double averageWhole = 0;
        int count =0;
        while(!console.equals("Finish")){
            count++;
            double average =0;
            String console2 = "";
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                average+=grade;
                console2 = console;
            }
            averageWhole += average/n;
            System.out.printf("%s - %.2f.%n",console2,average/n);
            console = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.02f.%n",averageWhole/count);
    }
}
