package _01_Programming_Basics._05_LoopsPartTwo;

import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int excluded = 0;
        int count = 1;
        double sum = 0;

        while (count <= 12){
            double grade = Double.parseDouble(scan.nextLine());

            if (grade<4.0){
                excluded++;
            }else{
                count++;
            }
            if (excluded>1){
                break;
            }

            sum += grade;
        }
        if (excluded>1){
            System.out.printf("%s has been excluded at %d grade",name,count);
        }else{
            System.out.printf("%s graduated. Average grade: %.2f",name,sum/12);
        }
    }
}
