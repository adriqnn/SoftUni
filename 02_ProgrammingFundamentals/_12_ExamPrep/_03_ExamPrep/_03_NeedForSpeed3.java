package _02_ProgrammingFundamentals._12_ExamPrep._03_ExamPrep;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _03_NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        Map<String, Integer> carsMileage = new TreeMap<>();
        Map<String, Integer> carsFuel = new TreeMap<>();

        // Add cars
        for (int car = 0; car < n; car++) {
            String dataCar = scan.nextLine();
            String[] splitCarData = dataCar.split("\\|");

            String carName = splitCarData[0];
            int carMileage = Integer.parseInt(splitCarData[1]);
            int carFuel = Integer.parseInt(splitCarData[2]);

            carsMileage.put(carName, carMileage);
            carsFuel.put(carName, carFuel);
        }

        String commands = scan.nextLine();

        // Determine the outcome of the race
        while (!commands.equals("Stop")) {
            String[] input = commands.split(" : ");

            String command = input[0];
            String carName = input[1];

            switch (command) {
                case "Drive":
                    int distanceDrive = Integer.parseInt(input[2]);
                    int fuelDrive = Integer.parseInt(input[3]);
                    int currentFuel = carsFuel.get(carName);

                    if (fuelDrive > currentFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsMileage.put(carName, carsMileage.get(carName) + distanceDrive);
                        carsFuel.put(carName, currentFuel - fuelDrive);
                        System.out.printf("%s driven for %d kilometers. %s liters of fuel consumed.%n", carName, distanceDrive, fuelDrive);
                    }

                    if (carsMileage.get(carName) >= 100000) {
                        System.out.println("Time to sell the " + carName + "!");
                        carsMileage.remove(carName);
                    }

                    break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(input[2]);
                    int fuelInTheTank = carsFuel.get(carName);

                    if (fuelInTheTank + fuelToRefill > 75) {
                        int refill = 75 - fuelInTheTank;
                        fuelInTheTank = 75;
                        carsFuel.put(carName, fuelInTheTank);
                        
                        System.out.printf("%s refueled with %d liters%n", carName, refill);
                    } else {
                        fuelInTheTank += fuelToRefill;
                        carsFuel.put(carName, fuelInTheTank);
                        
                        System.out.println(carName + " refueled with " + fuelToRefill + " liters");
                    }
                    break;
                case "Revert":
                    int kilometersToRemove = Integer.parseInt(input[2]);
                    int currentMileage = carsMileage.get(carName);
                    
                    if (currentMileage-kilometersToRemove < 10000) {
                        currentMileage = 10000;
                        carsMileage.put(carName, currentMileage);
                    } else {
                        currentMileage -= kilometersToRemove;
                        carsMileage.put(carName, currentMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kilometersToRemove);
                    }
                    
                    break;
            }
            
            commands = scan.nextLine();
        }
        
        // Print result
        carsMileage.entrySet().stream().sorted((car1, car2) -> Integer.compare(car2.getValue(), car1.getValue()))
                .forEach(carEntry -> {
                    String carName = carEntry.getKey();
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", carEntry.getKey(), carEntry.getValue(), carsFuel.get(carName));
                });
        
        scan.close();
    }
}
