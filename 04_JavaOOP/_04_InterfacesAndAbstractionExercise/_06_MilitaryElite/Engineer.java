package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.ArrayList;

public class Engineer extends SpecialSoldier {
    private ArrayList<Repair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    public void addRepair(Repair repair){
        this.repairs.add(repair);
    }

    public ArrayList<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Repairs:").append(System.lineSeparator());
        if(repairs.size() > 0){
            repairs.forEach(e -> sb.append(e).append(System.lineSeparator()));
            return sb.toString();
        }
        return sb.toString();
    }
}