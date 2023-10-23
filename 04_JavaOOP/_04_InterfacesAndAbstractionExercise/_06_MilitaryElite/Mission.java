package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    public void setState(String state) {
        try{
            this.state = State.valueOf(state);
        }catch(Exception e){
            throw new IllegalStateException("wrong");
        }
    }
    
    public void setState(State state){
        this.state = State.finished;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("  Code Name: ").append(this.codeName).append(" State: ").append(this.state.name());
        return sb.toString();
    }
}
