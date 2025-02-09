package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> trainWagonsPassengers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacityOfWagon = Integer.parseInt(scan.nextLine());
        String passengersListActions = scan.nextLine();

        // Arrange the train based on commands
        while (!passengersListActions.equals("end")) {
            if (passengersListActions.split("\\s+")[0].equals("Add")) {
                int addWagonAndPassengers = Integer.parseInt(passengersListActions.split("\\s+")[1]);
                
                trainWagonsPassengers.add(addWagonAndPassengers);
            } else {
                int addPassengers = Integer.parseInt(passengersListActions.split("\\s+")[0]);

                for (int i = 0; i < trainWagonsPassengers.size(); i++) {
                    if (trainWagonsPassengers.get(i) + addPassengers <= capacityOfWagon) {
                        trainWagonsPassengers.set(i, trainWagonsPassengers.get(i) + addPassengers);
                        break;
                    }
                }
            }

            passengersListActions = scan.nextLine();
        }

        // Print result
        trainWagonsPassengers.stream().forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
