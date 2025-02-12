package _02_ProgrammingFundamentals._06_ObjectsAndClasses._03_MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_CarSalesman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int engineCount = Integer.parseInt(scan.nextLine());

        // Add variables
        List<EngineInfo> engines = new ArrayList<>();
        List<CarInfo> cars = new ArrayList<>();

        // Create catalog for engines
        for (int i = 0; i < engineCount; i++) {
            String[] engineSpecs = scan.nextLine().split("\\s+");

            String model = engineSpecs[0];
            String power = engineSpecs[1];
            String displacement = "";
            String efficiency = "";

            try {
                displacement = String.valueOf(Integer.parseInt(engineSpecs[2]));
                efficiency = engineSpecs[3];
            } catch (Exception e) {

                try {
                    displacement = String.valueOf(Integer.parseInt(engineSpecs[2]));
                    efficiency = "n/a";
                } catch (Exception e1) {

                    try {
                        displacement = "n/a";
                        efficiency = engineSpecs[2];
                    } catch(Exception e2) {
                        displacement = "n/a";
                        efficiency = "n/a";
                    }
                }
            }
            
            EngineInfo engine = new EngineInfo(model, power, displacement, efficiency);

            engines.add(engine);
        }

        int carCount = Integer.parseInt(scan.nextLine());

        // Create catalog for cars
        for (int i = 0; i < carCount; i++) {
            String[] carInformation = scan.nextLine().split("\\s+");

            String model = carInformation[0];
            String engine = carInformation[1];
            String weight = "";
            String color = "";

            try {
                weight = String.valueOf(Integer.parseInt(carInformation[2]));
                color = carInformation[3];
            } catch (Exception e) {

                try {
                    weight = String.valueOf(Integer.parseInt(carInformation[2]));
                    color = "n/a";
                } catch (Exception e1) {

                    try {
                        weight = "n/a";
                        color = carInformation[2];
                    } catch (Exception e2) {
                        weight = "n/a";
                        color = "n/a";
                    }
                }
            }

            for (EngineInfo eng: engines) {
                if (eng.getModel().equals(engine)) {
                    CarInfo car = new CarInfo(model, eng, weight, color);
                    cars.add(car);
                }
            }
        }

        // Print result
        for (CarInfo car: cars) {
            System.out.println(car.getModel() + ":");
            System.out.println("  " +car.getEngine().getModel() + ":");
            System.out.println("    Power: " + car.getEngine().getPower());
            System.out.println("    Displacement: " + car.getEngine().getDisplacement());
            System.out.println("    Efficiency: " + car.getEngine().getEfficiency());
            System.out.println("  Weight: " + car.getWeight());
            System.out.println("  Color: " + car.getColor());
        }

        scan.close();
    }
}

// Create practice CarInfo class
class CarInfo {
    private String model;
    private EngineInfo engine;
    private String weight;
    private String color;

    public CarInfo(String model, EngineInfo engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public EngineInfo getEngine() {
        return this.engine;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }
}

// Create practice EngineInfo class
class EngineInfo {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public EngineInfo(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return this.model;
    }

    public String getPower() {
        return this.power;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}
