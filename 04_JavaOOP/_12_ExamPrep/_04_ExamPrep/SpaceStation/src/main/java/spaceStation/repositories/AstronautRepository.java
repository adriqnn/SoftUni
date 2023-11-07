package spaceStation.repositories;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.astronauts.BaseAstronaut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class AstronautRepository implements Repository<Astronaut>{
    private Map<String, Astronaut> astronauts;

    public AstronautRepository() {
        this.astronauts = new LinkedHashMap<>();
    }

    @Override
    public Collection<Astronaut> getModels() {
        return this.astronauts.values();
    }

    @Override
    public void add(Astronaut model) {
        this.astronauts.put(model.getName(), model);
    }

    @Override
    public boolean remove(Astronaut model) {
        if(this.astronauts.containsKey(model.getName())){
            this.astronauts.remove(model.getName());

            return true;
        }

        return false;
    }

    @Override
    public Astronaut findByName(String name) {
        return this.astronauts.get(name);
    }
}
