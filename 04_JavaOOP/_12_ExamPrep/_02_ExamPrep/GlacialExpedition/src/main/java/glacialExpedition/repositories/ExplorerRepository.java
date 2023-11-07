package glacialExpedition.repositories;

import glacialExpedition.models.explorers.Explorer;

import java.util.*;

public class ExplorerRepository implements Repository<Explorer> {
    private Map<String, Explorer> explorers;

    public ExplorerRepository(){
        this.explorers = new LinkedHashMap<>();
    }

    @Override
    public Collection<Explorer> getCollection() {
        return Collections.unmodifiableCollection(this.explorers.values());

        //return this.explorers.values();
    }

    @Override
    public void add(Explorer entity) {
        this.explorers.put(entity.getName(), entity);
    }

    @Override
    public boolean remove(Explorer entity) {
        return this.explorers.remove(entity.getName()) != null;

        /*
        if(this.explorers.containsKey(entity.getName())){
            this.explorers.remove(entity.getName());
            return true;
        }

        return false;
        */
    }

    @Override
    public Explorer byName(String name) {
        return this.explorers.get(name);

        //return this.explorers.values().stream().filter(e -> e.getName().equals("name")).findFirst().orElse(null);
    }
}
