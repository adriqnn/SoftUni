package _03_JavaAdvanced._06_DefiningClassesExercise._04_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Car> carList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] console = scan.nextLine().split("\\s+");
            
            String model = console[0];
            int engineHP = Integer.parseInt(console[2]);
            String cargoType = console[4];
            double tire1Pressure = Double.parseDouble(console[5]);
            double tire2Pressure = Double.parseDouble(console[7]);
            double tire3Pressure = Double.parseDouble(console[9]);
            double tire4Pressure = Double.parseDouble(console[11]);
            
            Car newCar = new Car(model,engineHP,cargoType,tire1Pressure,tire2Pressure,tire3Pressure,tire4Pressure);
            carList.add(newCar);
        }
        
        String cargo = scan.nextLine();

        if(cargo.equals("fragile")){
            for (Car element: carList) {
                if((element.getCargoType().equals(cargo)) && (element.getTire1Pressure() < 1 || element.getTire2Pressure() < 1) || element.getTire3Pressure() < 1 || element.getTire4Pressure() < 1){
                    System.out.println(element.getModel());
                }
            }
        }else if(cargo.equals("flamable")){
            for (Car element : carList) {
                if(element.getCargoType().equals(cargo) && element.getEngineHP() > 250){
                    System.out.println(element.getModel());
                }
            }
        }
        
        scan.close();
    }
}
