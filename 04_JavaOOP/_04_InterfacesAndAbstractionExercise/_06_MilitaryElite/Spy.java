package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class Spy extends Soldier{
    private String codeNumber;


    public Spy(int id, String firstName, String lastName,String number) {
        super(id, firstName, lastName);
        this.codeNumber = number;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder();
        sb.append("Name: ").append(this.getFirstName()).append(" ").append(this.getLastName()).append(" Id: ").append(this.getId()).append(System.lineSeparator());
        sb.append("Code Number: ").append(this.codeNumber).append(System.lineSeparator());
        return sb.toString();
    }
}