package spaceStation.models.astronauts;

public class Geodesist extends BaseAstronaut{
    private static final double GEODESIST_ASTRONAUT_OXYGEN_LEVEL = 50;

    public Geodesist(String name) {
        super(name, GEODESIST_ASTRONAUT_OXYGEN_LEVEL);
    }
}
