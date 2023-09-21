package _03_JavaAdvanced._06_DefiningClassesExercise._07_Google;

public class Car {
    private String model;
    private String speed;

    public Car(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    
    @Override
    public String toString(){
        if(this.model.equals("")){
            return "Car:" + "\n";
        }
        
        return "Car:" + "\n" + this.model + " " + this.speed + "\n";
    }
}
