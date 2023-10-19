package _04_JavaOOP._02_EncapsulationExercise._02_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setAge(int age) {
        if(age <= 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        
        this.age = age;
    }

    private void setName(String name) {
        name = name.trim();
        
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        
        this.name = name;
    }

    public double productPerDay(){
        return this.calculateProductPerDay();
    }

    @Override
    public String toString(){
        return "Chicken " + this.name + " (" + this.age + ") can produce " + this.calculateProductPerDay() + " eggs per day.";
    }

    private double calculateProductPerDay(){
        if(this.age < 6){
            return 2;
        }else if(this.age < 11){
            return 1;
        }else{
            return 0.75;
        }
    }
}
