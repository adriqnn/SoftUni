package glacialExpedition.models.mission;

import glacialExpedition.models.explorers.Explorer;
import glacialExpedition.models.states.State;

import java.util.Collection;

public class MissionImpl implements Mission{

    @Override
    public void explore(State state, Collection<Explorer> explorers) {

        for (Explorer e : explorers) {
            while(e.canSearch() && !state.getExhibits().isEmpty()){
                for (String s : state.getExhibits()) {
                    e.getSuitcase().getExhibits().add(s);
                    state.getExhibits().remove(s);
                    e.search();
                    break;
                }
            }
        }
    }
}
