package renovation.models;

import java.util.Objects;

public class Laminate {

    public double length;
    public double width;
    public WoodType woodType;

    public Laminate(double length, double width, WoodType woodType) {
        this.length = length;
        this.width = width;
        this.woodType = woodType;
    }

    public double getLength() {
        return length;
    }

    public Laminate setLength(double length) {
        this.length = length;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public Laminate setWidth(double width) {
        this.width = width;
        return this;
    }

    public WoodType getWoodType() {
        return woodType;
    }

    public Laminate setWoodType(WoodType woodType) {
        this.woodType = woodType;
        return this;
    }

    @Override
    public String toString() {
        return "models.Laminate{" +
                "length=" + length +
                ", width=" + width +
                ", woodType='" + woodType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laminate laminate = (Laminate) o;
        return Double.compare(laminate.length, length) == 0 && Double.compare(laminate.width, width) == 0 && woodType == laminate.woodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, woodType);
    }
}
