package _01_Programming_Basics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int countAll = 0;
        int studentsAll = 0;
        int standardAll = 0;
        int kidsAll = 0;
        while(!movie.equals("Finish")){
            int seats = Integer.parseInt(scan.nextLine());
            String type = scan.nextLine();
            int count = 0;
            int students = 0;
            int standard = 0;
            int kids = 0;
            while(!type.equals("End")){
                if (type.equals("student")){
                    count++;
                    students++;
                }else if (type.equals("standard")){
                    count++;
                    standard++;
                }else if (type.equals("kid")){
                    count++;
                    kids++;
                }
                if (count == seats){
                    double percentile = ((1.00*count)/seats)*100;
                    System.out.printf("%s - %.2f%% full.%n",movie,percentile);
                    break;
                }
                type = scan.nextLine();
            }
            double percentile1 = ((1.00*count)/seats)*100;
            if(type.equals("End")){
                System.out.printf("%s - %.2f%% full.%n",movie,percentile1);
            }

            int all = students+standard+kids;
            countAll +=all;
            studentsAll += students;
            standardAll += standard;
            kidsAll += kids;
            movie = scan.nextLine();
        }
        double p1 = (1.00*studentsAll/countAll)*100;
        double p2 = (1.00*standardAll/countAll)*100;
        double p3 = (1.00*kidsAll/countAll)*100;
        if(movie.equals("Finish")){
            System.out.printf("Total tickets: %d%n",countAll);
            System.out.printf("%.2f%% student tickets.%n",p1);
            System.out.printf("%.2f%% standard tickets.%n",p2);
            System.out.printf("%.2f%% kids tickets.%n",p3);
        }
    }
}
