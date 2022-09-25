package _01_Programming_Basics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String rating = scan.nextLine();

        double result = 0;

        if (room.equals("room for one person")){
            result = (days-1)*18.00;
        }else if (room.equals("apartment")){
            if (days > 15){
                result = ((days-1)*25.00)*0.5;
            }else if (days >= 10){
                result = ((days-1)*25.00)*0.65;
            }else if (days >= 0){
                result = ((days-1)*25.00)*0.7;
            }
        }else if (room.equals("president apartment")){
            if (days > 15){
                result = ((days-1)*35.00)*0.8;
            }else if (days >= 10){
                result = ((days-1)*35.00)*0.85;
            }else if (days >= 0){
                result = ((days-1)*35.00)*0.9;
            }
        }

        if (rating.equals("positive")) {
            result += result * 0.25;
        }else if (rating.equals("negative")){
            result -= result * 0.10;
        }
        System.out.printf("%.2f",result);
    }
}
