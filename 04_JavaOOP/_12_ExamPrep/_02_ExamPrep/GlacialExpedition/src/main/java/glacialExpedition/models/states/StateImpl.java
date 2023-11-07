package glacialExpedition.models.states;

import glacialExpedition.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StateImpl implements State{
    private String name;
    private List<String> exhibits;

    public StateImpl(String name) {
        setName(name);
        this.exhibits = new ArrayList<>();
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.STATE_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    public void setExhibits(List<String> exhibits) {
        this.exhibits = exhibits;
    }

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
