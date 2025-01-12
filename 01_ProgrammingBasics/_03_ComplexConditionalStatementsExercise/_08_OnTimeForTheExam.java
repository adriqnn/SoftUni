package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minuteOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minuteOfArrival = Integer.parseInt(scan.nextLine());

        // Transforming the data into minutes
        int examInMinutes = (hourOfExam * 60) + minuteOfExam;
        int arrivalInMinutes = (hourOfArrival * 60) + minuteOfArrival;

        // Calculating the time late/early
        int lateMinutes = arrivalInMinutes - examInMinutes;
        int earlyMinutes = examInMinutes - arrivalInMinutes;

        String timeUnit = "";
        int value1 = 0;
        int value2 = 0;

        // Determine if arrival is late or early and printing information based on that
        if (examInMinutes == arrivalInMinutes) {
            System.out.println("On Time");
        } else if (examInMinutes < arrivalInMinutes) {
            if (lateMinutes >= 60) {
                timeUnit = "hours";
                value1 = lateMinutes / 60;
                value2 = lateMinutes % 60;
                
                if (value2 < 10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d %s after the start%n", value1, value2, timeUnit);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d:%d %s after the start%n", value1, value2, timeUnit);
                }
            } else {
                timeUnit = "minutes";
                
                System.out.println("Late");
                System.out.printf("%d %s after the start%n", lateMinutes, timeUnit);
            }
        } else {
            if (earlyMinutes <= 30) {
                timeUnit = "minutes";
                
                System.out.println("On time");
                System.out.printf("%d %s before the start%n", earlyMinutes, timeUnit);
            } else {
                if (earlyMinutes >= 60) {
                    timeUnit = "hours";
                    value1 = earlyMinutes / 60;
                    value2 = earlyMinutes % 60;
                    
                    if (value2 < 10) {
                        System.out.println("Early");
                        System.out.printf("%d:0%d %s before the start%n", value1, value2, timeUnit);
                    } else {
                        System.out.println("Early");
                        System.out.printf("%d:%d %s before the start%n", value1, value2, timeUnit);
                    }
                } else {
                    timeUnit = "minutes";
                    
                    System.out.println("Early");
                    System.out.printf("%d %s before the start%n", earlyMinutes, timeUnit);
                }
            }
        }

        scan.close();
    }
}
