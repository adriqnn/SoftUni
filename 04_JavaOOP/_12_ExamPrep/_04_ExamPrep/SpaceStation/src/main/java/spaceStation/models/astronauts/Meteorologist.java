package spaceStation.models.astronauts;

public class Meteorologist extends BaseAstronaut{
    private static final double METEOROLOGIST_ASTRONAUT_OXYGEN_LEVEL = 90;

    public Meteorologist(String name) {
        super(name, METEOROLOGIST_ASTRONAUT_OXYGEN_LEVEL);
    }
}
