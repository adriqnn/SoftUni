package _04_JavaOOP._02_EncapsulationExercise._05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name){
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty");
        }
        
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getRating(){
        return this.players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.0);
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(String name){
        boolean isRemoved = this.players.removeIf(p -> p.getName().equals(name));
        
        if(!isRemoved){
            String message = String.format("Player %s is not in %s team.", name, this.name);
            throw new IllegalArgumentException(message);
        }
    }
}
