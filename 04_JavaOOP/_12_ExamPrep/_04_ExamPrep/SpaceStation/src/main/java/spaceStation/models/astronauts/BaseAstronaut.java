package spaceStation.models.astronauts;

import spaceStation.common.ConstantMessages;
import spaceStation.common.ExceptionMessages;
import spaceStation.models.bags.Backpack;
import spaceStation.models.bags.Bag;

import java.util.stream.Collectors;

public abstract class BaseAstronaut implements Astronaut{
    private String name;
    private double oxygen;
    private Bag bag;

    protected BaseAstronaut(String name, double oxygen) {
        setName(name);
        setOxygen(oxygen);
        this.bag = new Backpack();
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.ASTRONAUT_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    public void setOxygen(double oxygen) {
        if(oxygen < 0){
            throw new IllegalArgumentException(ExceptionMessages.ASTRONAUT_OXYGEN_LESS_THAN_ZERO);
        }

        this.oxygen = oxygen;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getOxygen() {
        return this.oxygen;
    }

    @Override
    public boolean canBreath() {
        return this.oxygen > 0;
    }

    @Override
    public Bag getBag() {
        return this.bag;
    }

    @Override
    public void breath() {
        if(this.oxygen <= 10){
            this.oxygen = 0;
        }else {
            this.oxygen -= 10;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(ConstantMessages.REPORT_ASTRONAUT_NAME, this.name)).append(System.lineSeparator());
        sb.append(String.format(ConstantMessages.REPORT_ASTRONAUT_OXYGEN, this.oxygen)).append(System.lineSeparator());

        if(!this.bag.getItems().isEmpty()) {
            sb.append(String.format(ConstantMessages.REPORT_ASTRONAUT_BAG_ITEMS, this.bag.getItems().stream().map(String::valueOf).collect(Collectors.joining(ConstantMessages.REPORT_ASTRONAUT_BAG_ITEMS_DELIMITER))));
        }else{
            sb.append(String.format(ConstantMessages.REPORT_ASTRONAUT_BAG_ITEMS, "none"));

        }

        return sb.toString();
    }
}
