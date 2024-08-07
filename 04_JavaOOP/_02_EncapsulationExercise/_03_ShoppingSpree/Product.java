package _04_JavaOOP._02_EncapsulationExercise._03_ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        this.setName(name);
        this.setCost(cost);
    }

    private void setCost(double cost) {
        if(cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        
        this.cost = cost;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
