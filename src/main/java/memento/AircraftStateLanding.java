package memento;

public class AircraftStateLanding implements AircraftState{

    private AircraftStateLanding() {};
    private static AircraftStateLanding instance = new AircraftStateLanding();
    public static AircraftStateLanding getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Landing";
    }
}
