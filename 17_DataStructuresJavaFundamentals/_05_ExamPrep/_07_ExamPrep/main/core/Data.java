package core;

import interfaces.Entity;
import interfaces.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Data implements Repository {
    private List<Entity> entities;

    public Data() {
        this.entities = new ArrayList<>();
    }

    public Data(Data copy){
        this.entities = new ArrayList<>(copy.entities);
    }

    @Override
    public void add(Entity entity) {
        this.entities.add(entity);
    }

    @Override
    public Entity getById(int id) {
        return this.entities.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Entity> getByParentId(int id) {
        return this.entities.stream().filter(e -> e.getParentId() == id).collect(Collectors.toList());
    }

    @Override
    public List<Entity> getAll() {
        return this.entities;
    }

    @Override
    public Repository copy() {
        return new Data(this);
    }

    @Override
    public List<Entity> getAllByType(String type) {
        if(!type.equals("Invoice") && !type.equals("StoreClient") && !type.equals("User")){
            throw new IllegalArgumentException("Illegal type: " + type);
        }

        return this.entities.stream().filter(e -> e.getClass().getSimpleName().equals(type)).collect(Collectors.toList());
    }

    @Override
    public Entity peekMostRecent() {
        return this.entities.stream().max(Comparator.comparing(Entity::getId)).orElseThrow(() -> new IllegalStateException("Operation on empty Data"));
    }

    @Override
    public Entity pollMostRecent() {
        Entity result = null;
        int id = Integer.MIN_VALUE;

        for (Entity current : this.entities) {
            if (current.getId() > id) {
                result = current;
                id = current.getId();
            }
        }

        if(result == null){
            throw new IllegalStateException("Operation on empty Data");
        }

        this.entities.remove(result);
        return result;

//        Entity toRemove = this.entities.stream().max(Comparator.comparing(Entity::getId)).orElse(null);
//        if(toRemove == null){
//            throw new IllegalStateException("Operation on empty Data");
//        }
//        this.entities.remove(toRemove);
//        return toRemove;
    }

    @Override
    public int size() {
        return this.entities.size();
    }
}
