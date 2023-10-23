package _04_JavaOOP._04_InterfacesAndAbstractionExercise._01_02_03_;


public class Pet implements Birthable{
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
