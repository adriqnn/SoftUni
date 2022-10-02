package glacialExpedition.repositories;

import glacialExpedition.models.states.State;

import java.util.*;

public class StateRepository implements Repository<State> {
    private Map<String,State> states;

    public StateRepository(){
        this.states = new LinkedHashMap<>();
    }

    @Override
    public Collection<State> getCollection() {
        return Collections.unmodifiableCollection(this.states.values());
        //return states.values();
    }

    @Override
    public void add(State entity) {
        states.put(entity.getName(),entity);
    }

    @Override
    public boolean remove(State entity) {
        return states.remove(entity.getName()) != null;
        /*if(states.containsKey(entity.getName())){
            states.remove(entity.getName());
            return true;
        }
        return false;*/
    }

    @Override
    public State byName(String name) {
        return this.states.get(name);
        //return states.values().stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }
}



















