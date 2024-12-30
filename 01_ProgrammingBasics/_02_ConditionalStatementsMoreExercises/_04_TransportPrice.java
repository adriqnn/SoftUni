package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _04_TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input
        int kilometers = Integer.parseInt(scan.nextLine());
        String timePeriod = scan.nextLine();
        double tripPrice = 0;

        // Calculate the trip price based on different cases
        if (kilometers < 20) {
            if (timePeriod.equals("day")) {
                tripPrice = 0.70 + (kilometers * 0.79);
            } else {
                tripPrice = 0.70 + (kilometers * 0.90);
            }
        } else if (kilometers < 100) {
            tripPrice = kilometers * 0.09;
        } else {
            tripPrice = kilometers * 0.06;
        }

        // Print the calculated trip price
        System.out.printf("%.2f", tripPrice);

        scan.close();
    }
}
