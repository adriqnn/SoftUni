package spaceStation.core;

import spaceStation.common.ConstantMessages;
import spaceStation.common.ExceptionMessages;
import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.astronauts.Biologist;
import spaceStation.models.astronauts.Geodesist;
import spaceStation.models.astronauts.Meteorologist;
import spaceStation.models.mission.Mission;
import spaceStation.models.mission.MissionImpl;
import spaceStation.models.planets.Planet;
import spaceStation.models.planets.PlanetImpl;
import spaceStation.repositories.AstronautRepository;
import spaceStation.repositories.PlanetRepository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private AstronautRepository astronautRepository;
    private PlanetRepository planetRepository;
    private int exploredPlanets;

    public ControllerImpl() {
        this.astronautRepository = new AstronautRepository();
        this.planetRepository = new PlanetRepository();
    }

    @Override
    public String addAstronaut(String type, String astronautName) {
        Astronaut astronaut = null;

        if(type.equals("Biologist")){
            astronaut = new Biologist(astronautName);
        }else if(type.equals("Geodesist")){
            astronaut = new Geodesist(astronautName);
        }else if(type.equals("Meteorologist")){
            astronaut = new Meteorologist(astronautName);
        }

        if(astronaut != null){
            this.astronautRepository.add(astronaut);
            return String.format(ConstantMessages.ASTRONAUT_ADDED, type, astronautName);
        }

        throw new IllegalArgumentException(ExceptionMessages.ASTRONAUT_INVALID_TYPE);
    }

    @Override
    public String addPlanet(String planetName, String... items) {
        Planet planet = new PlanetImpl(planetName);

        for (String item : items) {
            planet.getItems().add(item);
        }

        //Collections.addAll(planet.getItems(),items);
        this.planetRepository.add(planet);
        return String.format(ConstantMessages.PLANET_ADDED, planetName);
    }

    @Override
    public String retireAstronaut(String astronautName) {
        Astronaut isIn = this.astronautRepository.findByName(astronautName);

        if(isIn != null){
            this.astronautRepository.remove(this.astronautRepository.findByName(astronautName));
            return String.format(ConstantMessages.ASTRONAUT_RETIRED, astronautName);
        }

        throw new IllegalArgumentException(String.format(ExceptionMessages.ASTRONAUT_DOES_NOT_EXIST, astronautName));
    }

    @Override
    public String explorePlanet(String planetName) {
        List<Astronaut> astronauts = this.astronautRepository.getModels().stream().filter(a -> a.getOxygen() >= 60).collect(Collectors.toList());

        if(!astronauts.isEmpty()){
            this.exploredPlanets++;
            Mission mission = new MissionImpl();
            mission.explore(this.planetRepository.findByName(planetName), astronauts);

            long deadAstronauts = astronauts.stream().mapToDouble(Astronaut::getOxygen).filter(a -> a == 0).count();
            return String.format(ConstantMessages.PLANET_EXPLORED, planetName, deadAstronauts);
        }

        throw new IllegalArgumentException(ExceptionMessages.PLANET_ASTRONAUTS_DOES_NOT_EXISTS);
    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(ConstantMessages.REPORT_PLANET_EXPLORED,exploredPlanets)).append(System.lineSeparator());
        sb.append(ConstantMessages.REPORT_ASTRONAUT_INFO).append(System.lineSeparator());
        sb.append(this.astronautRepository.getModels().stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator())));

        return sb.toString();
    }
}
