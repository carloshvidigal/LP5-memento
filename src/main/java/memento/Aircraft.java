package memento;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    private AircraftState state;
    private List<AircraftState> memento = new ArrayList<AircraftState>();

    public AircraftState getState() {
        return state;
    }

    public void setState(AircraftState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public void restoreState(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }
        this.state = this.memento.get(index);
    }

    public List<AircraftState> getStates() {
        return this.memento;
    }
}
