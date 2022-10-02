package _04_JavaOOP._04_InterfacesAndAbstraction._03_04_SayHelloAndExtended;

public class European extends BasePerson{
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
