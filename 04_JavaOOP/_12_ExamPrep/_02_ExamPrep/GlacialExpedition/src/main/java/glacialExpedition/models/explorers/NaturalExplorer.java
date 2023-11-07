package glacialExpedition.models.explorers;

import glacialExpedition.models.states.State;

import java.util.Collection;

public class NaturalExplorer extends BaseExplorer{

    public NaturalExplorer(String name) {
        super(name, 60);
    }

    @Override
    public void search(){
        if(getEnergy() <= 7){
            super.setEnergy(0);
        }else{
            super.setEnergy(this.getEnergy() - 7);
        }
    }

    /*
    @Override
    public void search() {
        if(super.canSearch()){
            super.energy -= 7;

            if(super.energy < 0){
                this.energy = 0;
            }
        }
    }
    */
}
