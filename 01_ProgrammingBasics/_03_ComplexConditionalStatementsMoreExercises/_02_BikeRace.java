package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercise;

import java.util.Scanner;

public class _02_BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int youngParticipants = Integer.parseInt(scan.nextLine());
        int seniorParticipants = Integer.parseInt(scan.nextLine());
        String trackType = scan.nextLine().toLowerCase();

        double collectedMoney = 0;

        // Calculate the collected money based on the track type
        if (trackType.equals("trail")) {
            collectedMoney = (youngParticipants * 5.50) + (seniorParticipants * 7.00);
        } else if (trackType.equals("cross-country")) {
            if ((youngParticipants + seniorParticipants) >= 50) {
                collectedMoney = ((youngParticipants * 8.00) + (seniorParticipants * 9.50)) * 0.75;
            } else {
                collectedMoney = (youngParticipants * 8.00) + (seniorParticipants * 9.50);
            }
        } else if (trackType.equals("downhill")) {
            collectedMoney = (youngParticipants * 12.25) + (seniorParticipants * 13.75);
        } else if (trackType.equals("road")) {
            collectedMoney = (youngParticipants * 20) + (seniorParticipants * 21.50);
        }

        // Calculate the expenses
        double expenses = collectedMoney * 0.05;

        // Print the sum
        System.out.printf("%.2f", collectedMoney - expenses);

        scan.close();
    }
}
