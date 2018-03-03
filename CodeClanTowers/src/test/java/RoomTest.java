import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void setUp() throws Exception {
        room = new Bedroom(001, 2);
        guest1 = new Guest("Jeff Bridges");
        guest2 = new Guest("Kevin Bacon");
        guests = new ArrayList<>();
    }

    @Test
    public void hasRoomNo() {
        assertEquals(001, room.getRoomNo());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void canGetNumberOfGuests() {
        assertEquals(0, room.getNoOfGuests());
    }

    @Test
    public void canCheckinGuest() {
        room.addGuest(guest1);
        room.addGuest(guest2);
        assertEquals(2, room.getNoOfGuests());
    }
}
