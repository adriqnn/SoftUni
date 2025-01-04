package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String movie = scan.nextLine();

        // Add variables
        int totalTickets = 0;
        int studentsTotal = 0;
        int standardTotal = 0;
        int kidsTotal = 0;

        // Make statistics for ticket types and movies
        while (!movie.equals("Finish")) {

            // Read additional input values for each movie
            int seats = Integer.parseInt(scan.nextLine());
            String type = scan.nextLine();

            // Variables for each money
            int count = 0;
            int students = 0;
            int standard = 0;
            int kids = 0;


            while (!type.equals("End")) {
                if (type.equals("student")) {
                    students++;
                } else if (type.equals("standard")) {
                    standard++;
                } else if (type.equals("kid")) {
                    kids++;
                }
                
                count++;

                if (count == seats) {
                    double occupancy = ((1.00 * count) / seats) * 100;
                    System.out.printf("%s - %.2f%% full.%n", movie, occupancy);
                    break;
                }
                
                type = scan.nextLine();
            }

            double occupancy = ((1.00 * count) / seats) * 100;

            if (type.equals("End")) {
                System.out.printf("%s - %.2f%% full.%n", movie, occupancy);
            }

            int all = students + standard + kids;
            totalTickets += all;
            studentsTotal += students;
            standardTotal += standard;
            kidsTotal += kids;
            movie = scan.nextLine();
        }

        double percentStudents = (1.00 * studentsTotal / totalTickets) * 100;
        double percentStandard = (1.00 * standardTotal / totalTickets) * 100;
        double percentKids = (1.00 * kidsTotal / totalTickets) * 100;

        // Print statistics
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudents);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentKids);

        scan.close();
    }
}
