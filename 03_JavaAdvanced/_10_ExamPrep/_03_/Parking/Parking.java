package _03_JavaAdvanced._10_ExamPrep._03_.Parking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car){
        if(this.capacity > this.data.size()){
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model){
        for (Car e : this.data) {
            if(e.getManufacturer().equals(manufacturer) && e.getModel().equals(model)){
                this.data.remove(e);
                return true;
            }
        }
        
        return false;
    }

    public Car getLatestCar(){
        if(this.data.size() > 0){
            return this.data.stream().sorted((a, b) -> Integer.compare(b.getYear(), a.getYear())).collect(Collectors.toList()).get(0);
        }
        
        return null;
    }

    public Car getCar(String manufacturer, String model){
        return this.data.stream().filter(p -> p.getManufacturer().equals(manufacturer) && p.getModel().equals(model)).findAny().orElse(null);
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("The cars are parked in ").append(this.type).append(":").append(System.lineSeparator());
        this.data.forEach(e -> sb.append(e).append(System.lineSeparator()));
        
        return sb.toString();
    }
}
