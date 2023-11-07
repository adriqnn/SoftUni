package glacialExpedition.models.explorers;

import glacialExpedition.common.ConstantMessages;
import glacialExpedition.common.ExceptionMessages;
import glacialExpedition.models.mission.Mission;
import glacialExpedition.models.suitcases.Carton;
import glacialExpedition.models.suitcases.Suitcase;

import java.util.stream.Collectors;

public abstract class BaseExplorer implements Explorer{
    private String name;
    private double energy;
    private Suitcase suitcase;

    protected BaseExplorer(String name, double energy) {
        setName(name);
        setEnergy(energy);
        this.suitcase = new Carton();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.EXPLORER_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    public void setEnergy(double energy) {
        if(energy < 0){
            throw new IllegalArgumentException(ExceptionMessages.EXPLORER_ENERGY_LESS_THAN_ZERO);
        }

        this.energy = energy;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public boolean canSearch() {
        return this.energy > 0;
    }

    @Override
    public Suitcase getSuitcase() {
        return this.suitcase;
    }

    /*
    @Override //from first test
    public void search() {
        if(this.canSearch()){
            this.energy -= 15;

            if(this.energy < 0){
                this.energy = 0;
            }
        }
    }
    */

    @Override
    public void search(){
        if(this.energy <= 15){
            this.energy = 0;
        }else{
            this.energy -= 15;
        }

        //this.energy = Math.max(0,this.energy-15);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(ConstantMessages.FINAL_EXPLORER_NAME, this.name)).append(System.lineSeparator());
        sb.append(String.format(ConstantMessages.FINAL_EXPLORER_ENERGY, this.energy)).append(System.lineSeparator());

        if(this.suitcase.getExhibits().isEmpty()){
            sb.append(String.format(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS, "None"));
            return sb.toString();
        }else{
            sb.append(String.format(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS, String.join(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS_DELIMITER, this.suitcase.getExhibits())));
            return sb.toString();
        }
    }
}
