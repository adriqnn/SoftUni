package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.ArrayList;
import java.util.Comparator;

public class LieutenantGeneral extends Private {
    private ArrayList<Private> privates;


    public LieutenantGeneral(int id, String firstName, String lastName, double salary, ArrayList<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }

    public void addPrivate(Private p){
        this.privates.add(p);
    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Privates:").append(System.lineSeparator());
        if(privates.size() > 0){
            privates.stream().sorted(Comparator.comparing(Private::getId).reversed()).forEach(e -> sb.append("  ").append(e));
            return sb.toString();
        }
        return sb.toString();
    }
}
