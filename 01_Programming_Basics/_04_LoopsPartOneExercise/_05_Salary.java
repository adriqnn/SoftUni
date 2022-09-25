package _01_Programming_Basics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _05_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String site = scan.nextLine();

            if (site.equals("Facebook")){
                salary -=150;
            }else if (site.equals("Instagram")){
                salary -=100;
            }else if (site.equals("Reddit")){
                salary -=50;
            }
            if (salary <=0){
                break;
            }
        }
        if (salary<=0){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println(salary);
        }
    }
}
