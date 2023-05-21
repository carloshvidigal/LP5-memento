package memento;

public class AircraftStateTakingOff implements AircraftState {

    private AircraftStateTakingOff () {};
    private static AircraftStateTakingOff instance = new AircraftStateTakingOff();
    public static AircraftStateTakingOff getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Taking Off";
    }
}
