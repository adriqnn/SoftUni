package _02_ProgrammingFundamentals._06_ObjectsAndClasses._03_MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_RawData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        List<Car> carList = new ArrayList<>();

        // Create car database
        for (int i = 0; i < n; i++) {
            String[] console = scan.nextLine().split("\\s+");

            String model = console[0];
            int engineHP = Integer.parseInt(console[2]);
            String cargoType = console[4];
            double tire1Pressure = Double.parseDouble(console[5]);
            double tire2Pressure = Double.parseDouble(console[7]);
            double tire3Pressure = Double.parseDouble(console[9]);
            double tire4Pressure = Double.parseDouble(console[11]);

            Car newCar = new Car(model, engineHP, cargoType, tire1Pressure, tire2Pressure, tire3Pressure, tire4Pressure);

            carList.add(newCar);
        }

        String cargo = scan.nextLine();

        // Print result
        if (cargo.equals("fragile")) {
            for (Car element: carList) {
                if ((element.getCargoType().equals(cargo)) && (element.getTire1Pressure() < 1 || element.getTire2Pressure() < 1) || element.getTire3Pressure() < 1 || element.getTire4Pressure() < 1) {
                    System.out.println(element.getModel());
                }
            }
        } else if (cargo.equals("flamable")) {
            for (Car element : carList) {
                if (element.getCargoType().equals(cargo) && element.getEngineHP() > 250) {
                    System.out.println(element.getModel());
                }
            }
        }

        scan.close();
    }
}

// Create practice Car class
class Car {
    private String model;
    private int engineHP;
    private String cargoType;
    private double tire1Pressure;
    private double tire2Pressure;
    private double tire3Pressure;
    private double tire4Pressure;

    public Car(String model, int engineHP, String cargoType, double tire1Pressure, double tire2Pressure, double tire3Pressure, double tire4Pressure) {
        this.model = model;
        this.engineHP = engineHP;
        this.cargoType = cargoType;
        this.tire1Pressure = tire1Pressure;
        this.tire2Pressure = tire2Pressure;
        this.tire3Pressure = tire3Pressure;
        this.tire4Pressure = tire4Pressure;
    }

    public String getModel() {
        return this.model;
    }

    public int getEngineHP() {
        return this.engineHP;
    }

    public String getCargoType() {
        return this.cargoType;
    }

    public double getTire1Pressure() {
        return this.tire1Pressure;
    }

    public double getTire2Pressure() {
        return this.tire2Pressure;
    }

    public double getTire3Pressure() {
        return this.tire3Pressure;
    }

    public double getTire4Pressure() {
        return this.tire4Pressure;
    }
}
