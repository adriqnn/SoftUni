package _04_JavaOOP._05_PolymorphismExercise._02_VehiclesExtension;

public class Bus extends VehicleImpl{
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance);
    }
}
