package _03_JavaAdvanced._06_DefiningClassesExercise._03_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfCars = Integer.parseInt(scan.nextLine());
        
        Map<String,Car> cars = new LinkedHashMap<>();
        
        for (int i = 0; i < numberOfCars; i++) {
            String[] input = scan.nextLine().split("\\s+");
            
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double consumption = Double.parseDouble(input[2]);
            
            Car car = new Car(model,fuelAmount,consumption);
            cars.put(model,car);
        }
        
        String[] driveCommand = scan.nextLine().split("\\s+");
        
        while(!driveCommand[0].equals("End")){
            String carModel = driveCommand[1];
            double kilometersToDrive = Double.parseDouble(driveCommand[2]);
            
            Car car = cars.get(carModel);
            
            if(!car.drive(kilometersToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            
            driveCommand = scan.nextLine().split("\\s+");
        }
        
        cars.values().forEach(System.out::println);
        
        scan.close();
    }
}
