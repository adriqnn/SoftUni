package _03_JavaAdvanced._06_DefiningClasses._01_CarInfo;

public class CarInfo {
    private String brand;
    private String model;
    private int horsePower;

    public CarInfo(String brand,String model,int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public CarInfo(String brand, int horsePower){
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.",this.getBrand(),this.getModel(),this.getHorsePower());
    }
}
