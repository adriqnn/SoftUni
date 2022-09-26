package _01_Programming_Basics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();

        boolean isTrue = false;
        int countBad = 0;
        double average = 0;
        int count = 0;
        String last = "";

        while(!name.equals("Enough")){
            int gradeNew = Integer.parseInt(scan.nextLine());
            if (gradeNew<=4){
                countBad++;
                if (countBad==grade){
                    System.out.printf("You need a break, %d poor grades.",countBad);
                    break;
                }
            }
            last = name;
            average += gradeNew;
            count++;
            name = scan.nextLine();
        }
        if (name.equals("Enough")){
            System.out.printf("Average score: %.2f\n", average/count);
            System.out.printf("Number of problems: %d\n", count);
            System.out.printf("Last problem: %s", last);
        }
    }
}
