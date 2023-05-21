import memento.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AircraftTest {

    @Test
    void shouldStoreStates() {
        Aircraft aircraft = new Aircraft();
        aircraft.setState(AircraftStateParked.getInstance());
        aircraft.setState(AircraftStateTaxiing.getInstance());
        assertEquals(2, aircraft.getStates().size());
    }

    @Test
    void shouldReturnToInitialState() {
        Aircraft aircraft = new Aircraft();
        aircraft.setState(AircraftStateLanding.getInstance());
        aircraft.setState(AircraftStateTakingOff.getInstance());
        aircraft.restoreState(0);
        assertEquals(AircraftStateLanding.getInstance(), aircraft.getState());
    }

    @Test
    void shouldReturnToPreviousState() {
        Aircraft aircraft = new Aircraft();
        aircraft.setState(AircraftStateLanding.getInstance());
        aircraft.setState(AircraftStateTakingOff.getInstance());
        aircraft.setState(AircraftStateLanding.getInstance());
        aircraft.setState(AircraftStateFlying.getInstance());
        aircraft.restoreState(2);
        assertEquals(AircraftStateLanding.getInstance(), aircraft.getState());
    }

    @Test
    void shouldReturnInvalidIndexException() {
        try {
            Aircraft aircraft = new Aircraft();
            aircraft.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }
}
