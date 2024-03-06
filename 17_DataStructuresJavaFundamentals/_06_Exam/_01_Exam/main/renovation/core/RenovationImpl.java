package renovation.core;

import renovation.models.Laminate;
import renovation.models.Tile;
import renovation.models.WoodType;

import java.util.*;
import java.util.stream.Collectors;

public class RenovationImpl implements Renovation {
    private double sqrMeters;
    private List<Tile> tiles;
    private List<Laminate> laminates;
    private ArrayDeque<Laminate> lamIterator;

    public RenovationImpl() {
        this.sqrMeters = 0;
        this.tiles = new ArrayList<>();
        this.laminates = new ArrayList<>();
        this.lamIterator = new ArrayDeque<>();
    }

    @Override
    public void deliverTile(Tile tile) {
        if( this.sqrMeters == 30 || this.sqrMeters + (tile.getHeight() * tile.getWidth()) > 30){
            throw new IllegalArgumentException();
        }

        this.tiles.add(tile);
        this.sqrMeters += tile.getHeight() * tile.getWidth();
    }

    @Override
    public void deliverFlooring(Laminate laminate) {
        this.laminates.add(laminate);
        this.lamIterator.push(laminate);
    }

    @Override
    public double getDeliveredTileArea() {
        return this.sqrMeters;
    }

    @Override
    public boolean isDelivered(Laminate laminate) {
        return this.laminates.contains(laminate);
    }

    @Override
    public void returnTile(Tile tile) {
        if(!this.tiles.contains(tile)){
            throw new IllegalArgumentException();
        }

        double sqr = tile.getWidth() * tile.getHeight();
        this.sqrMeters -= sqr;
        this.tiles.remove(tile);
    }

    @Override
    public void returnLaminate(Laminate laminate) {
        if(!this.laminates.contains(laminate)){
            throw new IllegalArgumentException();
        }

        this.laminates.remove(laminate);
    }

    @Override
    public Collection<Laminate> getAllByWoodType(WoodType wood) {
        return this.laminates.stream().filter(e -> e.getWoodType().equals(wood)).collect(Collectors.toList());
    }

    @Override
    public Collection<Tile> getAllTilesFitting(double width, double height) {
        return this.tiles.stream().filter(e -> e.getWidth() <= width && e.getHeight() <= height).collect(Collectors.toList());
    }

    @Override
    public Collection<Tile> sortTilesBySize() {
        return this.tiles.stream().sorted((t1, t2) -> {
            int compare = Double.compare(t1.getHeight() * t1.getWidth(), t2.getHeight() * t2.getWidth());

            if(compare == 0){
                compare = Double.compare(t1.getDepth(), t2.getDepth());
            }

            return compare;
        }).collect(Collectors.toList());
    }

    @Override
    public Iterator<Laminate> layFlooring() {

//        Collections.reverse(laminates);
        return this.lamIterator.iterator();
    }
}
