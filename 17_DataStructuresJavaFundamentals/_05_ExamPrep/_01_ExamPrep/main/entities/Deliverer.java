package entities;

import java.util.Objects;

public class Deliverer {
    private String id;
    private String name;

    public Deliverer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deliverer deliverer = (Deliverer) o;
        return Objects.equals(id, deliverer.id) && Objects.equals(name, deliverer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
