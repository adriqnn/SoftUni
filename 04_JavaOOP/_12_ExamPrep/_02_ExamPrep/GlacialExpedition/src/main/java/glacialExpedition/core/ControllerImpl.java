package glacialExpedition.core;

import glacialExpedition.common.ConstantMessages;
import glacialExpedition.common.ExceptionMessages;
import glacialExpedition.models.explorers.AnimalExplorer;
import glacialExpedition.models.explorers.Explorer;
import glacialExpedition.models.explorers.GlacierExplorer;
import glacialExpedition.models.explorers.NaturalExplorer;
import glacialExpedition.models.mission.Mission;
import glacialExpedition.models.mission.MissionImpl;
import glacialExpedition.models.states.State;
import glacialExpedition.models.states.StateImpl;
import glacialExpedition.repositories.ExplorerRepository;
import glacialExpedition.repositories.Repository;
import glacialExpedition.repositories.StateRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private Repository<Explorer> explorerRepository;
    private Repository<State> stateRepository;
    // private ExplorerRepository explorerRepository;
    // private StateRepository stateRepository;
    private int exploredStates;

    public ControllerImpl() {
        this.explorerRepository = new ExplorerRepository();
        this.stateRepository = new StateRepository();
    }

    @Override
    public String addExplorer(String type, String explorerName) {
        Explorer explorer = null;

        if(type.equals("NaturalExplorer")){
            explorer = new NaturalExplorer(explorerName);
        }else if(type.equals("GlacierExplorer")){
            explorer = new GlacierExplorer(explorerName);
        }else if(type.equals("AnimalExplorer")){
            explorer = new AnimalExplorer(explorerName);
        }else{
            throw new IllegalArgumentException(ExceptionMessages.EXPLORER_INVALID_TYPE);
        }

        this.explorerRepository.add(explorer);
        return String.format(ConstantMessages.EXPLORER_ADDED, type, explorerName);
    }

    @Override
    public String addState(String stateName, String... exhibits) {
        State state = new StateImpl(stateName);
        Collection<String> stateExhibits = state.getExhibits();
        Collections.addAll(stateExhibits, exhibits);
        this.stateRepository.add(state);

        return String.format(ConstantMessages.STATE_ADDED, stateName);
    }

    /*
    @Override
    public String addState(String stateName, String... exhibits) {
        StateImpl state = new StateImpl(stateName);
        state.setExhibits(Arrays.stream(exhibits).collect(Collectors.toList()));
        stateRepository.add(state);
        return String.format(ConstantMessages.STATE_ADDED, stateName);
    }
    */

    @Override
    public String retireExplorer(String explorerName) {
        Collection<Explorer> explorers = this.explorerRepository.getCollection();
        Explorer explorer = explorers.stream().filter(e -> e.getName().equals(explorerName)).findFirst().orElse(null);

        if(explorer != null){
            this.explorerRepository.remove(explorer);
            return String.format(ConstantMessages.EXPLORER_RETIRED, explorerName);
        }

        throw new IllegalArgumentException(String.format(ExceptionMessages.EXPLORER_DOES_NOT_EXIST, explorerName));
    }

    @Override
    public String exploreState(String stateName) {
        List<Explorer> explorers = this.explorerRepository.getCollection().stream().filter(e -> e.getEnergy() >= 50).collect(Collectors.toList());

        if(!explorers.isEmpty()) {
            this.exploredStates++;
            Mission mission = new MissionImpl();
            mission.explore(this.stateRepository.byName(stateName), explorers);
            int count = 0;

            for (Explorer e : explorers) {
                if(e.getEnergy() <= 0){
                    this.retireExplorer(e.getName());
                    count++;
                }
            }

            return String.format(ConstantMessages.STATE_EXPLORER, stateName, count);
        }

        throw new IllegalArgumentException(ExceptionMessages.STATE_EXPLORERS_DOES_NOT_EXISTS);
    }

    @Override
    public String finalResult() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(ConstantMessages.FINAL_STATE_EXPLORED, exploredStates)).append(System.lineSeparator());
        sb.append(ConstantMessages.FINAL_EXPLORER_INFO).append(System.lineSeparator());
        sb.append(this.explorerRepository.getCollection().stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator())));

        return sb.toString();
    }
}
