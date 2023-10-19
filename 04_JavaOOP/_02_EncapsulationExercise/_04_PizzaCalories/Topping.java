package _04_JavaOOP._02_EncapsulationExercise._04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight){
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public void setToppingType(String toppingType){
        if(toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")){
            this.toppingType = toppingType;
        }else{
            String message = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(message);
        }

    }

    public void setWeight(double weight){
        if(weight < 1 || weight > 50){
            String message = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(message);
        }
        
        this.weight = weight;
    }

    public double calculateCalories(){
        double toppingModifier = 0;
        
        if(this.toppingType.equals("Meat")){
            toppingModifier = 1.2;
        }else if(this.toppingType.equals("Veggies")){
            toppingModifier = 0.8;
        }else if(this.toppingType.equals("Cheese")){
            toppingModifier = 1.1;
        }else{
            toppingModifier = 0.9;
        }
        
        return (2 * this.weight) * toppingModifier;
    }
}
