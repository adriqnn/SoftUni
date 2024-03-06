package renovation.models;

import java.util.Objects;

public class Tile {
    public double width;
    public double height;
    public double depth;

    public Tile(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public Tile setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Tile setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getDepth() {
        return depth;
    }

    public Tile setDepth(double depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public String toString() {
        return "models.Tile{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        
        return Double.compare(tile.width, width) == 0 && Double.compare(tile.height, height) == 0 && Double.compare(tile.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }
}
