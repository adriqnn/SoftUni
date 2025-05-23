package _03_JavaAdvanced._10_ExamPrep._03_.Parking;

public class Car {
    private String manufacturer;
    private String model;
    private int year;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String toString(){
        return String.format("%s %s (%d)", this.manufacturer, this.model, this.year);
    }
}
