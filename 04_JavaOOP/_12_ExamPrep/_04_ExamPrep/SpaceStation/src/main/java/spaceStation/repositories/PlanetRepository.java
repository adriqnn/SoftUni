package spaceStation.repositories;

import spaceStation.models.planets.Planet;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlanetRepository implements Repository<Planet>{
    private Map<String, Planet> planets;

    public PlanetRepository() {
        this.planets = new LinkedHashMap<>();
    }

    @Override
    public Collection<Planet> getModels() {
        return this.planets.values();
    }

    @Override
    public void add(Planet model) {
        this.planets.put(model.getName(), model);
    }

    @Override
    public boolean remove(Planet model) {
        if(this.planets.containsKey(model.getName())){
            this.planets.remove(model.getName());

            return true;
        }

        return false;
    }

    @Override
    public Planet findByName(String name) {
        return this.planets.get(name);
    }
}
