package _04_JavaOOP._05_PolymorphismExercise._02_VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");
        double carFuelAmount = Double.parseDouble(tokens[1]);
        double carConsumption = Double.parseDouble(tokens[2]);
        double carTankCapacity = Double.parseDouble(tokens[3]);
        Vehicle car = new Car(carFuelAmount, carConsumption, carTankCapacity);

        tokens = scan.nextLine().split("\\s+");
        double truckFuelAmount = Double.parseDouble(tokens[1]);
        double truckConsumption = Double.parseDouble(tokens[2]);
        double truckTankCapacity = Double.parseDouble(tokens[3]);
        Vehicle truck = new Truck(truckFuelAmount, truckConsumption, truckTankCapacity);

        tokens = scan.nextLine().split("\\s+");
        double busFuelAmount = Double.parseDouble(tokens[1]);
        double busConsumption = Double.parseDouble(tokens[2]);
        double busTankCapacity = Double.parseDouble(tokens[3]);
        Vehicle bus = new Bus(busFuelAmount, busConsumption, busTankCapacity);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scan.nextLine().split("\\s+");
            
            String commandName = tokens[0];
            String vehicleType = tokens[1];
            double amount = Double.parseDouble(tokens[2]);

            switch(commandName){
                case "Drive":
                    try {
                        System.out.println(vehicles.get(vehicleType).drive(amount));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case "Refuel":
                    try {
                        vehicles.get(vehicleType).refuel(amount);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case "DriveEmpty":
                    try {
                        ((Bus) vehicles.get(vehicleType)).setFuelConsumption(((Bus) vehicles.get(vehicleType)).getFuelConsumption() + 1.4);
                        System.out.println(vehicles.get(vehicleType).drive(amount));
                        ((Bus) vehicles.get(vehicleType)).setFuelConsumption(((Bus) vehicles.get(vehicleType)).getFuelConsumption() - 1.4);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
            }
        }
        
        vehicles.values().forEach(System.out::println);

        scan.close();
    }
}

