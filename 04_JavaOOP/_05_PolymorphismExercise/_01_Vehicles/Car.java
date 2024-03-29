package _04_JavaOOP._05_PolymorphismExercise._01_Vehicles;

public class Car extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }
}
