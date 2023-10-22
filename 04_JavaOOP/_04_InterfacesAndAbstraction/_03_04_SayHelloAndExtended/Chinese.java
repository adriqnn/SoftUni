package _04_JavaOOP._04_InterfacesAndAbstraction._03_04_SayHelloAndExtended;


public class Chinese extends BasePerson{
    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjbydjy";
    }
}
