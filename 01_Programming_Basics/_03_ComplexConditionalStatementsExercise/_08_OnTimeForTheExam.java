package _01_Programming_Basics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minuteOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minuteOfArrival = Integer.parseInt(scan.nextLine());

        int exam = (hourOfExam*60)+minuteOfExam;
        int arrival = (hourOfArrival*60)+minuteOfArrival;

        int late = arrival-exam;
        int early = exam-arrival;

        String time = "";
        int value = 0;
        int value2 = 0;

        if (exam == arrival){
            System.out.println("On Time");
        }else if (exam<arrival){
            if (late>=60){
                time = "hours";
                value = late/60;
                value2 = late%60;
                if (value2<10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d %s after the start", value,value2,time);
                }else{
                    System.out.println("Late");
                    System.out.printf("%d:%d %s after the start", value,value2,time);
                }
            }else{
                time = "minutes";
                System.out.println("Late");
                System.out.printf("%d %s after the start", late, time);
            }
        }else{
            if (early<=30){
                time = "minutes";
                System.out.println("On time");
                System.out.printf("%d %s before the start", early, time);
            }else{
                if(early>=60){
                    time = "hours";
                    value = early/60;
                    value2 = early%60;
                    if (value2<10) {
                        System.out.println("Early");
                        System.out.printf("%d:0%d %s before the start", value,value2,time);
                    }else{
                        System.out.println("Early");
                        System.out.printf("%d:%d %s before the start", value,value2,time);
                    }
                }else{
                    time = "minutes";
                    System.out.println("Early");
                    System.out.printf("%d %s before the start", early, time);
                }
            }
        }
    }
}
