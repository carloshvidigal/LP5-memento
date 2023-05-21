package memento;

public class AircraftStateFlying implements AircraftState{

    private AircraftStateFlying() {};
    private static AircraftStateFlying instance = new AircraftStateFlying();
    public static AircraftStateFlying getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Flying";
    }
}
