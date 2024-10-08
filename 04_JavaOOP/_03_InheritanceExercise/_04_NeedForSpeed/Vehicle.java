package _04_JavaOOP._03_InheritanceExercise._04_NeedForSpeed;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;

    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometers){
        double fuelNeeded = kilometers * this.fuelConsumption;
        
        if(this.fuel >= fuelNeeded){
            this.fuel -= fuelNeeded;
        }
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}


