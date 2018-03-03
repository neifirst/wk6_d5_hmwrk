import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void setUp() throws Exception {
        conferenceRoom = new ConferenceRoom(050, 200, 999.95);
    }

    @Test
    public void hasCost() {
        assertEquals(999.95, conferenceRoom.getCost(), 0.01);
    }

    @Test
    public void canSetCost() {
        conferenceRoom.setCost(59.95);
        assertEquals(59.95, conferenceRoom.getCost(), 0.01);
    }
}
