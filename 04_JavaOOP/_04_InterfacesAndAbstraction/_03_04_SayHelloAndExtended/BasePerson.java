package _04_JavaOOP._04_InterfacesAndAbstraction._03_04_SayHelloAndExtended;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}