package _03_JavaAdvanced._06_DefiningClassesExercise._05_CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model,power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this(model,power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model,power);
        this.efficiency = efficiency;
    }

    @Override
    public String toString(){
        String displacementPrint;

        if(this.displacement == 0){
            displacementPrint = "n/a";
        }else{
            displacementPrint = this.displacement + "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.model).append(":").append("\n")
                .append("Power: ").append(this.power).append("\n")
                .append("Displacement: ").append(displacementPrint).append("\n")
                .append("Efficiency: ").append(this.efficiency);

        return stringBuilder.toString();
    }
}
