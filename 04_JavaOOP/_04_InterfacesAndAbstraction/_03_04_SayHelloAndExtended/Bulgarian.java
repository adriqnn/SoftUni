package _04_JavaOOP._04_InterfacesAndAbstraction._03_04_SayHelloAndExtended;

public class Bulgarian extends BasePerson{
    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

