package _04_JavaOOP._05_PolymorphismExercise._03_WildFarm;

public abstract class Animal {
    private String name;
    private String type;
    private double weight;
    private int foodEaten;

    public Animal(String name, String type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }
}
