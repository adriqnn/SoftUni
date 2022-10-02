package spaceStation.models.astronauts;

public class Biologist extends BaseAstronaut{
    private static final double BIOLOGIST_ASTRONAUT_OXYGEN_LEVEL = 70;

    public Biologist(String name) {
        super(name, BIOLOGIST_ASTRONAUT_OXYGEN_LEVEL);
    }

    @Override
    public void breath() {
        if(super.getOxygen() <= 5){
            super.setOxygen(0);
        }else {
            super.setOxygen(super.getOxygen() - 5);
        }
    }
}
