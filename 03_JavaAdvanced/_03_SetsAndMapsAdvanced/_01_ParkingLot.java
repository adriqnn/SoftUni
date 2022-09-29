package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();
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
        String output = parkingLot.isEmpty() ? "Parking Lot is Empty" : parkingLot.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);
    }
}
