package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.text.DecimalFormat;

public class Private extends Soldier {
    private double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        DecimalFormat df = new DecimalFormat("0.00");
        sb.append(super.toString()).append(df.format(this.salary)).append(System.lineSeparator());
        return sb.toString();
    }
}
