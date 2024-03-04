package core;

import interfaces.Buffer;
import interfaces.Entity;
import model.BaseEntity;

import java.util.*;
import java.util.stream.Collectors;

public class Loader implements Buffer {
    private List<Entity> entities;

    public Loader() {
        this.entities = new ArrayList<>();
    }

    @Override
    public void add(Entity entity) {
        this.entities.add(entity);
    }

//    @Override
//    public Entity extract(int id) {
//        Entity entity = this.entities.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
//        this.entities.remove(entity);
//        return entity;
//    }

    @Override
    public Entity extract(int id) {
        Entity result = null;

        for (Entity current : this.entities) {
            if (current.getId() == id) {
                result = current;
                this.entities.remove(current);
                break;
            }
        }

        return result;
    }

    @Override
    public Entity find(Entity entity) {
        int i = this.entities.indexOf(entity);

        return i == -1 ? null : this.entities.get(i);
    }

    @Override
    public boolean contains(Entity entity) {
        return this.entities.contains(entity);
    }

    @Override
    public int entitiesCount() {
        return this.entities.size();
    }

    @Override
    public void replace(Entity oldEntity, Entity newEntity) {
        if (!entities.contains(oldEntity)) {
            throw new IllegalStateException("Entity not found");
        }

        int i = this.entities.indexOf(oldEntity);
        this.entities.set(i, newEntity);
    }

    @Override
    public void swap(Entity first, Entity second) {
        if (!this.entities.contains(first) || !this.entities.contains(second)) {
            throw new IllegalStateException("Entities not found");
        }

        int iFirst = this.entities.indexOf(first);
        int iSecond = this.entities.indexOf(second);

        this.entities.set(iFirst, second);
        this.entities.set(iSecond, first);
    }

    @Override
    public void clear() {
        this.entities.clear();
    }

    @Override
    public Entity[] toArray() {
        return this.entities.toArray(new Entity[0]);
    }

    @Override
    public List<Entity> retainAllFromTo(BaseEntity.Status lowerBound, BaseEntity.Status upperBound) {
        List<Entity> result = new ArrayList<>();

        for (Entity entity : this.entities) {
            if (entity.getStatus().compareTo(lowerBound) >= 0 && entity.getStatus().compareTo(upperBound) <= 0) {
                result.add(entity);
            }
        }

        return result;
    }

    @Override
    public List<Entity> getAll() {
        return this.entities;
    }

    @Override
    public void updateAll(BaseEntity.Status oldStatus, BaseEntity.Status newStatus) {
        this.entities.forEach(e -> {
            if(e.getStatus() == oldStatus){
                e.setStatus(newStatus);
            }
        });
    }

    @Override
    public void removeSold() {
        this.entities = this.entities.stream().filter(e -> !e.getStatus().toString().equals("SOLD")).collect(Collectors.toList());
    }

    @Override
    public Iterator<Entity> iterator() {
        return new Iterator<>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < entities.size();
            }

            @Override
            public Entity next() {
                return entities.get(i++);
            }
        };
    }
}
