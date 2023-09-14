package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variable
        Set<String> parkingLot = new LinkedHashSet<>();

        // Make a car record
        while(!input.equals("END")){
            String[] tokens = input.split(", ");

            String action = tokens[0];
            String registration = tokens[1];

            if(action.equals("IN")){
                parkingLot.add(registration);
            }else{
                parkingLot.remove(registration);
            }

            input = scan.nextLine();
        }

        /*if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            parkingLot.stream().collect(Collectors.joining(System.lineSeparator()));
        }*/

        // Print result
        String output = parkingLot.isEmpty() ? "Parking Lot is Empty" : parkingLot.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);

        scan.close();
    }
}
