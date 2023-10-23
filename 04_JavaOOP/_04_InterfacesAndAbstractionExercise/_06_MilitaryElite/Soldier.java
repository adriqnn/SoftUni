package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class Soldier implements Info{
    private int id;
    private String firstName;
    private String lastName;

    public Soldier(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder();
        
        sb.append("Name: ").append(this.getFirstName()).append(" ").append(this.getLastName()).append(" Id: ").append(this.getId()).append(" Salary: ");
        return sb.toString();
    }
}
