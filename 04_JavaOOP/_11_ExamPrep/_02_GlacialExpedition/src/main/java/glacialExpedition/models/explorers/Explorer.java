package glacialExpedition.models.explorers;

import glacialExpedition.models.states.State;
import glacialExpedition.models.suitcases.Suitcase;

import java.util.Collection;

public interface Explorer{
    String getName();

    double getEnergy();

    boolean canSearch();

    Suitcase getSuitcase();

    void search();

}
