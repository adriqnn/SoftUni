package _04_JavaOOP._05_PolymorphismExercise._01_Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");
        double carFuelAmount = Double.parseDouble(tokens[1]);
        double carConsumption = Double.parseDouble(tokens[2]);
        Vehicle car = new Car(carFuelAmount,carConsumption);

        tokens = scan.nextLine().split("\\s+");
        double truckFuelAmount = Double.parseDouble(tokens[1]);
        double truckConsumption = Double.parseDouble(tokens[2]);
        Vehicle truck = new Truck(truckFuelAmount,truckConsumption);

        Map<String,Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car",car);
        vehicles.put("Truck",truck);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scan.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];
            double amount = Double.parseDouble(tokens[2]);

            switch(commandName){
                case "Drive":
                    System.out.println(vehicles.get(vehicleType).drive(amount));
                    break;
                case "Refuel":
                    vehicles.get(vehicleType).refuel(amount);
                    break;
            }
        }
        vehicles.values().forEach(System.out::println);
    }
}
