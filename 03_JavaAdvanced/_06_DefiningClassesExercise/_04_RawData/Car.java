package _03_JavaAdvanced._06_DefiningClassesExercise._04_RawData;

public class Car {
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
        return model;
    }
    
    public int getEngineHP() {
        return engineHP;
    }
    
    public String getCargoType() {
        return cargoType;
    }
    
    public double getTire1Pressure() {
        return tire1Pressure;
    }
    
    public double getTire2Pressure() {
        return tire2Pressure;
    }
    
    public double getTire3Pressure() {
        return tire3Pressure;
    }
    
    public double getTire4Pressure() {
        return tire4Pressure;
    }
}
