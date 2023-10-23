package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

public class SpecialSoldier extends Private {
    private Corps corps;

    public SpecialSoldier(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    public void setCorps(String corps) {
        try{
            this.corps = Corps.valueOf(corps);
        }catch(Exception e){
            throw new IllegalStateException("wrong");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString()).append("Corps: ").append(this.corps.toString()).append(System.lineSeparator());
        return sb.toString();
    }
}
