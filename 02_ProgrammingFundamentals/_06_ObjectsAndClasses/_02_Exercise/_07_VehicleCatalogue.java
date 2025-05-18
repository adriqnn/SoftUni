package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        double carHorsePower = 0;
        double cars = 0;
        double truckHorsePower = 0;
        double trucks = 0;
        List<Vehicle> vehicles = new ArrayList<>();

        // Create a DB of all vehicles
        while (!console.equals("End")) {
            String[] consoleLine = console.split("\\s+");

            String type = consoleLine[0];
            String model = consoleLine[1];
            String color = consoleLine[2];
            int horsePower = Integer.parseInt(consoleLine[3]);

            if (type.equals("car")) {
                carHorsePower += horsePower;
                cars++;
            } else if (type.equals("truck")) {
                truckHorsePower += horsePower;
                trucks++;
            }

            Vehicle catalogueEntry = new Vehicle(type, model, color, horsePower);
            vehicles.add(catalogueEntry);

            console = scan.nextLine();
        }

        String models = scan.nextLine();

        // Print result
        while (!models.equals("Close the Catalogue")) {
            for (Vehicle element : vehicles) {
                if (element.getModel().equals(models)) {
                    System.out.print(element);
                }
            }

            models = scan.nextLine();
        }

        // Print result
        if (cars == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carHorsePower / cars);
        }

        if (trucks == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", truckHorsePower / trucks);
        }

        scan.close();
    }
}

// Create practice Vehicle class
class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        String format = this.type.substring(0,1).toUpperCase() + this.type.substring(1);
        // return String.format
        return "Type: " + format + "\n" + "Model: " + this.model + "\n" + "Color: " + this.color + "\n" + "Horsepower: " + this.horsePower + "\n";
    }
}
