package _04_JavaOOP._02_EncapsulationExercise._05_FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name){
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty");
        }
        
        this.name = name;
    }

    private void setEndurance(int endurance){
        checkIfInRange(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint){
        checkIfInRange(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble){
        checkIfInRange(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing){
        checkIfInRange(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting){
        checkIfInRange(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void checkIfInRange(int statValue,String statName){
        if(statValue < 0 || statValue > 100){
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel(){
        return (this.endurance + this.dribble + this.sprint + this.passing + this.shooting) / 5.00;
    }

    public String getName() {
        return this.name;
    }
}
