package spaceStation.repositories;

import spaceStation.models.planets.Planet;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlanetRepository implements Repository<Planet>{
    private Map<String,Planet> planets;

    public PlanetRepository() {
        planets = new LinkedHashMap<>();
    }

    @Override
    public Collection<Planet> getModels() {
        return planets.values();
    }

    @Override
    public void add(Planet model) {
        planets.put(model.getName(),model);
    }

    @Override
    public boolean remove(Planet model) {
        if(planets.containsKey(model.getName())){
            planets.remove(model.getName());
            return true;
        }
        return false;
    }

    @Override
    public Planet findByName(String name) {
        return planets.get(name);
    }
}
