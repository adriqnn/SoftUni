package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.ArrayList;
import java.util.List;

public class Commando extends SpecialSoldier {
    private List<Mission> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    public void addMission(Mission mission){
        this.missions.add(mission);
    }

    public List<Mission> getMissions(){
        return this.missions;
    }

    public void completeMission(Mission mission){
        for (Mission m : missions) {
            if(m.equals(mission)){
                m.setState(State.finished);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Missions:").append(System.lineSeparator());
        if(missions.size() > 0){
            missions.forEach(e -> sb.append(e).append(System.lineSeparator()));
            return sb.toString();
        }
        return sb.toString();
    }
}
