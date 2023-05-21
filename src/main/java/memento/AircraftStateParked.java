package memento;

public class AircraftStateParked implements AircraftState {

    private AircraftStateParked() {};
    private static AircraftStateParked instance = new AircraftStateParked();
    public static AircraftStateParked getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Parked";
    }

}
