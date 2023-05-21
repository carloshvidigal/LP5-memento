package memento;

public class AircraftStateTaxiing implements AircraftState{

    private AircraftStateTaxiing() {};
    private static AircraftStateTaxiing instance = new AircraftStateTaxiing();
    public static AircraftStateTaxiing getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Taxiing";
    }
}
