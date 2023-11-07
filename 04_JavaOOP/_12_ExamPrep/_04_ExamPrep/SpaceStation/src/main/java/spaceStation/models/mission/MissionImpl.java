package spaceStation.models.mission;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.planets.Planet;

import java.util.Collection;

public class MissionImpl implements Mission{

    @Override
    public void explore(Planet planet, Collection<Astronaut> astronauts) {
        for (Astronaut astronaut : astronauts) {
            while(astronaut.canBreath() && !planet.getItems().isEmpty()){
                for (String item : planet.getItems()) {
                    astronaut.getBag().getItems().add(item);
                    astronaut.breath();
                    planet.getItems().remove(item);
                    break;
                }
            }
        }

    }
}
